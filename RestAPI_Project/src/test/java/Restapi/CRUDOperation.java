package Restapi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Base.BaseReport;
import Utilities.ExcelUtils;

import io.restassured.http.ContentType;

public class CRUDOperation
extends BaseReport {

    @Test

    public void crudOperations() {

        test =
                extent.createTest(
                        "CRUD Operations");

        String path =
                System.getProperty("user.dir")
                + "/TestData.xlsx";

        ExcelUtils excel =
                new ExcelUtils(path, "Sheet1");

        int rows =
                excel.getRowCount();

        for (int i = 1; i < rows; i++) {

            String firstName =
                    excel.getCellData(i, 0);

            String lastName =
                    excel.getCellData(i, 1);

            String age =
                    excel.getCellData(i, 2);

            // POST

            String requestBody = "{\n"

                    + "\"firstName\":\""
                    + firstName + "\",\n"

                    + "\"lastName\":\""
                    + lastName + "\",\n"

                    + "\"age\":"
                    + age + "\n"

                    + "}";

            int userId =

            given()

                .contentType(ContentType.JSON)

                .body(requestBody)

            .when()

                .post("https://dummyjson.com/users/add")

            .then()

                .statusCode(201)

                .log().all()

            .extract()

                .path("id");

            test.pass("POST Passed");

            // GET

            given()

            .when()

                .get("https://dummyjson.com/users/"
                        + userId)

            .then()

                .statusCode(200)

                .log().all();

            test.pass("GET Passed");

            // PUT

            String updateBody = "{\n"

                    + "\"firstName\":\"Updated"
                    + firstName + "\"\n"

                    + "}";

            given()

                .contentType(ContentType.JSON)

                .body(updateBody)

            .when()

                .put("https://dummyjson.com/users/"
                        + userId)

            .then()

                .statusCode(200)

                .log().all();

            test.pass("PUT Passed");

            // DELETE

            given()

            .when()

                .delete("https://dummyjson.com/users/"
                        + userId)

            .then()

                .statusCode(200)

                .log().all();

            test.pass("DELETE Passed");
        }
    }
}
