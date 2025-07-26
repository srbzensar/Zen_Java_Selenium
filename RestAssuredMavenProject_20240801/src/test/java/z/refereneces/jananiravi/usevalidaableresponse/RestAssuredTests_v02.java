package z.refereneces.jananiravi.usevalidaableresponse;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

public class RestAssuredTests_v02 {

    private static final String URL = "https://httpbin.org/get";

    @Test
    void validatableResponseTest() {
        ValidatableResponse vResponse = RestAssured.get(URL)
                .then();

        vResponse = vResponse.statusCode(200);
        vResponse = vResponse.statusLine("HTTP/1.1 200 OK");
        vResponse = vResponse.contentType("application/json");

        vResponse = vResponse.header("Server", "gunicorn/19.9.0");
        vResponse = vResponse.header("Access-Control-Allow-Origin", "*");
    }

}
