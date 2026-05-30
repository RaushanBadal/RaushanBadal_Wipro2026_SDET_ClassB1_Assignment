package Restapi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Base.BaseReport;

public class SearchUserTest
extends BaseReport {

    @Test

    public void searchUser() {

        test =
                extent.createTest(
                        "Search User Test");

        given()

        .when()

            .get("https://dummyjson.com/users/search?q=John")

        .then()

            .statusCode(200)

            .log().all();

        test.pass("Search Passed");
    }
}
