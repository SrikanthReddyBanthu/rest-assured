package com.cjss.restassured;

import io.restassured.http.ContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class RestAssuredExample1 {


    // Ref: https://www.javadoc.io/doc/io.rest-assured/rest-assured/latest/io/restassured/RestAssured.html
    // https://github.com/rest-assured/rest-assured/wiki/Usage

    @Test
    public void testAPIs() {
        given()
                .contentType(ContentType.JSON).get("http://localhost:8080/demo-application/test-api")
                .then()
                .statusCode(200)
                .body(equalTo("sample response"));


        String addEmployeePayload = "{\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"customer 1\",\n" +
                "    \"designation\": \"DES\"\n" +
                "}";

        given()
                .contentType(ContentType.JSON)
                .body(addEmployeePayload)
                .post("http://localhost:8080/demo-application/add")
                .then()
                .statusCode(200)
                .body("id", equalTo(1)).and()
                .body("name", equalTo("customer 1"));
    }

}
