package c.correlation;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*; 

//Fetch a single post (with id 100) and use extract() to extract the response

public class Correlation {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
		Response res = when().get("posts/100").then().log().all().statusCode(200).extract().response();
		
		JsonPath jsonObj = res.jsonPath();
		int varUserId = jsonObj.getInt("userId");
		
		System.out.println("captured userId: " + varUserId);		
//		-----------------------------------------------
		
		given().queryParam("userId", varUserId).
		when().get("posts").
		then().log().all().statusCode(200).
		body("userId", everyItem(equalTo(varUserId)));
		
		
		System.out.println("Thank you");
	}
}
