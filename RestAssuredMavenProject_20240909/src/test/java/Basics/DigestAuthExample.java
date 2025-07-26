package Basics;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
//-----------------------------------------------


public class DigestAuthExample {

	public static void main(String[] args) {
		
		System.out.println("API Testing Started");
		
		given().auth().digest("postman", "password").
		when().log().all().
			get("https://postman-echo.com/digest-auth").
		then().log().all().
			assertThat().statusCode(200).and().
			body("authenticated", is(true));
		
		System.out.println("Thank you");
	}
}
