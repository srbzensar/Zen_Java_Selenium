package d.authorization;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class BaiscAuthExample {

	public static void main(String[] args) {

		System.out.println("API Testing Started");
		
		given().
			header("Authorization", "Basic cG9zdG1hbjpwYXNzd29yZA==").
		when().log().all().
			get("https://postman-echo.com/basic-auth").
		then().log().all().
			assertThat().statusCode(200).
			body("authenticated", is(true));
//		-------------------------------------------
//		given().
//			auth().basic("postman", "password").
//		when().log().all().
//			get("https://postman-echo.com/basic-auth").
//		then().log().all().
//			assertThat().statusCode(200).
//			body("authenticated", is(true));
		
		
		System.out.println("Thank you");
	}
}
