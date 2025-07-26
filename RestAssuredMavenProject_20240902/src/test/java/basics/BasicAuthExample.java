package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; 

//-----------------------------------------------
//Authorization: postman-echo
//Encoding	for usability (not for confidentiality)
//postman:password			encoded		cG9zdG1hbjpwYXNzd29yZA==

//basic Auth
//GET Method
//URL: https://postman-echo.com/basic-auth
//Header: Authorization, Basic cG9zdG1hbjpwYXNzd29yZA==
//validate: status code 200 and response body {"authenticated": true}



public class BasicAuthExample {

	public static void main(String[] args) {

		System.out.println("API Testing started");
		
		given().
			header("Authorization", "Basic cG9zdG1hbjpwYXNzd29yZA==").
		when().
			get("https://postman-echo.com/basic-auth").
		then().log().all().
			assertThat().statusCode(200).body("authenticated", is(true));

//		---------- negative test-------------------------
		given().
		when().
			get("https://postman-echo.com/basic-auth").
		then().log().all().
			assertThat().statusCode(401); 
		
		
		System.out.println("Thank you");
	}

}
