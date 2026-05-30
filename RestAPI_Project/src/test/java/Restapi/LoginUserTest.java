package Restapi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Base.BaseReport;

import io.restassured.http.ContentType;

public class LoginUserTest
extends BaseReport {

    @Test

    public void loginUser() {

        test =
                extent.createTest(
                        "Login User Test");

        String body = "{\n"

                + "\"username\":\"emilys\",\n"

                + "\"password\":\"emilyspass\"\n"

                + "}";

        given()

            .contentType(ContentType.JSON)

            .body(body)

        .when()

            .post("https://dummyjson.com/user/login")

        .then()

            .statusCode(200)

            .log().all();

        test.pass("Login Passed");
    }
}