package pages;

import io.restassured.response.Response;
import utils.BaseAPI;

import java.util.HashMap;
import java.util.Map;

public class FormPage extends BaseAPI {

    private String formEndpoint = "/form/submit";

    public void submitForm(String name, String email, String message) {
        Map<String, String> payload = new HashMap<>();
        payload.put("name", name);
        payload.put("email", email);
        payload.put("message", message);

        Response response = authorizedPostRequest(formEndpoint, payload);
        if (response.getStatusCode() != 201) {
            throw new RuntimeException("Form submission failed with status code: " + response.getStatusCode());
        }
    }
}
