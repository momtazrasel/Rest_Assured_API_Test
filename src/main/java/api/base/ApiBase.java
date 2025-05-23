package api.base;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ApiBase {
    protected RequestSpecification getRequestSpec() {
        return given()
                .baseUri("https://reqres.in/api")
                .contentType("application/json");
    }
}
