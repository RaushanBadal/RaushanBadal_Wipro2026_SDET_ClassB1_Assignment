package Restapi;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Base.BaseReport;

public class FilterUserTest
extends BaseReport {

    @Test

    public void filterUser() {

        test =
                extent.createTest(
                        "Filter User Test");

        given()

        .when()

            .get("https://dummyjson.com/users/filter?key=hair.color&value=Brown")

        .then()

            .statusCode(200)

            .log().all();

        test.pass("Filter Passed");
    }
}
