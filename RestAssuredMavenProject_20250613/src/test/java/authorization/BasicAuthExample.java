package authorization;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicAuthExample {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://postman-echo.com";
		
		System.out.println("Testing Started");
		
//		given().
//			auth().basic("postman", "password").
//		when().log().all().
//			get("/basic-auth").
//		then().log().all().
//			assertThat().statusCode(200).
//			body("authenticated", is(true));
		
//		-----------------------------------
		
		given().
			header("Authorization", "Basic cG9zdG1hbjpwYXNzd29yZA==").
		when().log().all().
			get("/basic-auth").
		then().log().all().
			assertThat().statusCode(200).
			body("authenticated", is(true));
		
		
		System.out.println("Thanks");
	}

}
