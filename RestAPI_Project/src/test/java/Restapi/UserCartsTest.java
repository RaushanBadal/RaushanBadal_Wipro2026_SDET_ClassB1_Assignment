package Restapi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Base.BaseReport;

public class UserCartsTest
extends BaseReport {

    @Test

    public void getCarts() {

        test =
                extent.createTest(
                        "User Carts Test");

        given()

        .when()

            .get("https://dummyjson.com/users/6/carts")

        .then()

            .statusCode(200)

            .log().all();

        test.pass("Carts Passed");
    }
}
