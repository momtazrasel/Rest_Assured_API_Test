package pages;

import io.restassured.response.Response;
import utils.BaseAPI;

import java.util.HashMap;
import java.util.Map;

public class LoginPage extends BaseAPI {

    private String loginEndpoint = "api/login";
    private String createEndpoint = "api/users";

    public void login(String username, String password) {
        Map<String, String> payload = new HashMap<>();
        payload.put("username", username);
        payload.put("password", password);

        Response response = postRequest(loginEndpoint, payload);
        if (response.getStatusCode() == 200) {
            accessToken = response.jsonPath().getString("access_token");
        } else {
            throw new RuntimeException("Login failed with status code: " + response.getStatusCode());
        }
    }

    public void createUser(String name, String job) {
        Map<String, String> payload = new HashMap<>();
        payload.put("name", name);
        payload.put("job", job);

        Response response = postRequest(createEndpoint, payload);
        if (response.getStatusCode() == 200) {
            accessToken = response.jsonPath().getString("access_token");
        } else {
            throw new RuntimeException("Create failed with status code: " + response.getStatusCode());
        }
    }
}
