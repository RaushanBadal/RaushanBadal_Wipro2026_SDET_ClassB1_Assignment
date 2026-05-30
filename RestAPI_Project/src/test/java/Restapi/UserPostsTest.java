package Restapi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Base.BaseReport;

public class UserPostsTest
extends BaseReport {

    @Test

    public void getPosts() {

        test =
                extent.createTest(
                        "User Posts Test");

        given()

        .when()

            .get("https://dummyjson.com/users/5/posts")

        .then()

            .statusCode(200)

            .log().all();

        test.pass("Posts Passed");
    }
}