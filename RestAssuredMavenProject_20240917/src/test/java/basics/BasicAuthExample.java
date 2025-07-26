package basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//basic Auth
//GET Method
//URL: https://postman-echo.com/basic-auth
//Header: Authorization, Basic cG9zdG1hbjpwYXNzd29yZA==
//validate: status code 200 and response body {"authenticated": true}

public class BasicAuthExample {

	public static void main(String[] args) {

		System.out.println("API Testing started");
		
//		given().header("Authorization", "Basic cG9zdG1hbjpwYXNzd29yZA==").
//		when().get("https://postman-echo.com/basic-auth").
//		then().log().all().statusCode(200).
//			body("authenticated", is(true));
		
//		------------------------------------
		
		given().auth().basic("postman", "password").
		when().get("https://postman-echo.com/basic-auth").
		then().log().all().statusCode(200).
			body("authenticated", is(true));
		
		
		System.out.println("Thanks");
		
	}

}
