package Restapi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Base.BaseReport;

public class SortUserTest
extends BaseReport {

    @Test

    public void sortUsers() {

        test =
                extent.createTest(
                        "Sort User Test");

        given()

        .when()

            .get("https://dummyjson.com/users?sortBy=firstName&order=asc")

        .then()

            .statusCode(200)

            .log().all();

        test.pass("Sort Passed");
    }
}
