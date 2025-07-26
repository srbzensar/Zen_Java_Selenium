package x.restfulbooker;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import java.io.File;

//-----------------------------------------------
//Authorization: send token in header

// Register: Generate Token Auth
// POST Method: Generate Token and capture in a variable
//URL: https://restful-booker.herokuapp.com/auth   
//Header: Content-Type, application/json
//body: {"username": "admin","password": "password123"}


public class A_RegisterGenerateToken {

	public static void main(String[] args) {

//		Register: generate token and capture in varToken
		
		String reqBody = "{\"username\": \"admin\",\"password\": \"password123\"}";
		
		String varToken = given().
			header("Content-Type", "application/json").
			body(reqBody).
		when().
			post("https://restful-booker.herokuapp.com/auth").
		then().log().all().
			assertThat().statusCode(200).
		extract().response().jsonPath().getString("token"); 
		
		System.out.println(varToken);
	}
}
