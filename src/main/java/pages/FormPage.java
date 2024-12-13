package pages;

import io.restassured.response.Response;
import utils.BaseAPI;

import java.util.HashMap;
import java.util.Map;

public class FormPage extends BaseAPI {

    private String createEndpoint = "api/users";

    public void submitForm(String name, String job) {
        Map<String, String> payload = new HashMap<>();
        payload.put("name", name);
        payload.put("job", job);
//        payload.put("message", message);

        Response response = authorizedPostRequest(createEndpoint, payload);
        if (response.getStatusCode() != 201) {
            throw new RuntimeException("Create submission failed with status code: " + response.getStatusCode());
        }
    }
}
