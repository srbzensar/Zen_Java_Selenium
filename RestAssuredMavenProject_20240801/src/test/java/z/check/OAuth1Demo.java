package z.check;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth1Demo {

    @Test
    public void testOAuthRequest() {
        String varConsumerKey = "RKCGzna7bv9YD57c";
        String varConsumerSecret = "D+EdQ-gs$-%@2Nu7";

        Response response = RestAssured
            .given()
                .auth()
                .oauth(varConsumerKey, varConsumerSecret, "", "")
            .when()
                .get("https://postman-echo.com/oauth1");

        System.out.println("Response: " + response.asString());
    }
}
