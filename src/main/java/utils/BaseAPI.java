package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseAPI {

    protected String baseURL = "https://api.example.com"; // Replace with your base URL
    protected String accessToken;

    public Response postRequest(String endpoint, Object payload) {
        return RestAssured.given()
                .baseUri(baseURL)
                .header("Content-Type", "application/json")
                .body(payload)
                .post(endpoint);
    }

    public Response authorizedPostRequest(String endpoint, Object payload) {
        return RestAssured.given()
                .baseUri(baseURL)
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + accessToken)
                .body(payload)
                .post(endpoint);
    }
}
