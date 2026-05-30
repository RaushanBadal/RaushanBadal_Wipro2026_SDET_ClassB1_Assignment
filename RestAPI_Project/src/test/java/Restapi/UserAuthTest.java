package Restapi;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseReport;

import io.restassured.http.ContentType;

public class UserAuthTest
extends BaseReport {

    @Test

    public void authTest() {

        test =
                extent.createTest(
                        "Authenticated User API Test");

        String requestBody = "{"

                + "\"username\":\"emilys\","

                + "\"password\":\"emilyspass\","

                + "\"expiresInMins\":30"

                + "}";

        try {

            test.info(
                    "Generating Access Token");

            String token =

            given()

                .contentType(ContentType.JSON)

                .body(requestBody)

            .when()

                .post("/user/login")

            .then()

                .statusCode(200)

                .log().all()

            .extract()

                .path("accessToken");

            test.pass(
                    "Token Generated Successfully");

            test.info(
                    "Accessing Protected API");

            int statusCode =

            given()

                .header(
                        "Authorization",
                        "Bearer " + token)

            .when()

                .get("/user/me")

            .then()

                .log().all()

            .extract()

                .statusCode();

            Assert.assertEquals(
                    statusCode,
                    200);

            test.pass(
                    "Authenticated User API Passed");
        }

        catch(Exception e) {

            test.fail(
                    "Authenticated User API Failed");

            test.fail(
                    e.getMessage());
        }
    }
}
