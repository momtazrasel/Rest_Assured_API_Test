package tests;

import api.endpoints.CreateUserAPI;
import api.payloads.User;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class CreateUserTest {

    @Test
    public void createUser() {
        CreateUserAPI create = new CreateUserAPI();
        User user = new User("John Doe", "QA Engineer");
        Response res = create.createUser(user);
        res.then().statusCode(201).body("name", equalTo("John Doe"));
    }
}
