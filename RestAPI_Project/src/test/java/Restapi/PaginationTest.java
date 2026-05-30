package Restapi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Base.BaseReport;

public class PaginationTest
extends BaseReport {

    @Test

    public void paginationUsers() {

        test =
                extent.createTest(
                        "Pagination Test");

        given()

        .when()

            .get("https://dummyjson.com/users?limit=5&skip=10&select=firstName,age")

        .then()

            .statusCode(200)

            .log().all();

        test.pass("Pagination Passed");
    }
}