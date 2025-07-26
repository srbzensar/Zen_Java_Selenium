package basics;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

//-----------------------------------------------
//Authorization: local service

//JWT Bearer Token Auth
// POST Method: Generate Token
//URL: http://localhost:8000/user/authenticate
//Header: Content-Type, application/json
//body: {"username": "anand","password": "anand"}

//GET Method: Fetch Products
//URL: http://localhost:9000/products
//Header: Authorization, Bearer jwtToken
//validate: status code 200 and response body 

public class O_JWTBearerTokenExample {

	public static void main(String[] args) {

		String reqBody = "{\"username\": \"anand\",\"password\": \"anand\"}";
		
		String bearerToken = given().
			header("Content-Type", "application/json").
			body(reqBody).
		when().
			post("http://localhost:8000/user/authenticate").
		then().log().all().
			assertThat().statusCode(200).
		extract().response().asString();
		
		bearerToken = "Bearer " + bearerToken;
		System.out.println(bearerToken);
		
//		-------------------------------------------------
		
		given().
			header("Authorization", bearerToken).
		when().log().all().
			get("http://localhost:9000/products").
		then().log().all().
			assertThat().statusCode(200).
			body("[0].id", is(1)).
			body("[0].name", is("Laptop"));		
		
	}
	

}
