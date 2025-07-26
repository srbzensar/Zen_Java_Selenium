package authorization;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DigestAuthExample {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://postman-echo.com";
		
		System.out.println("Testing Started");
		
		given().
			auth().digest("postman", "password").
		when().log().all().
			get("/digest-auth").
		then().log().all().
			assertThat().statusCode(200).
			body("authenticated", is(true));
		
		
		
		System.out.println("Thanks");
	}

}
