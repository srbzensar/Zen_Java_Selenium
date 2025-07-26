package Basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; 

public class CorrelationExample {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
		Response res = given().when().get("/posts/12").then().log().all().statusCode(200).extract().response();

		JsonPath jsonObj = res.jsonPath();
		int varUserId = jsonObj.getInt("userId");
		
		System.out.println("Captured userId: " + varUserId);
//		-----------------------------------------------
		
		given().
			queryParam("userId", varUserId).
		when().log().all().
			get("/posts").
		then().log().all().
			assertThat().statusCode(200).body("userId", everyItem(equalTo(varUserId)));
		
		
		System.out.println("Thank you");
	}
}
