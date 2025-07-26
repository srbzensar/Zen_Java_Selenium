package z.refereneces.jananiravi.usevalidaableresponse;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RestAssuredTests_v01 {

    private static final String URL = "https://httpbin.org/get";

    @Test
    void validatableResponseTest() {
        RestAssured.get(URL)
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .contentType("application/json");
    }

}
