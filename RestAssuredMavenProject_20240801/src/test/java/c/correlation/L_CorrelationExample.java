package c.correlation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; 
// Fetch a single post, capture userId from the response, and then fetch all posts for captured userId

public class L_CorrelationExample {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		Response res = when().get("/posts/54").then().log().all().statusCode(200).extract().response();
		
		JsonPath jsonObj = res.jsonPath();
		int varUserId = jsonObj.getInt("userId");
		System.out.println("Captured userId: "+ varUserId);
//		----------------------------
		
		given().queryParam("userId", varUserId).
		when().get("/posts").
		then().log().all().statusCode(200)
		.body("userId", everyItem(equalTo(varUserId)));
		
	}
	

}
