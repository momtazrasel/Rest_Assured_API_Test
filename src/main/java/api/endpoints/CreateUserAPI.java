package api.endpoints;

import api.base.ApiBase;
import api.payloads.User;
import io.restassured.response.Response;

public class CreateUserAPI extends ApiBase {
    public Response createUser(User user) {
        return getRequestSpec()
                .body(user)
                .when()
                .post("/users");
    }
}
