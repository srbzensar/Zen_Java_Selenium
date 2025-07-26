package basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; 

public class CorrelationExample {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing started");
		
		Response res = when().get("/posts/5").then().log().all().statusCode(200).extract().response();

		JsonPath jsonObj = res.jsonPath();
		int userId = jsonObj.getInt("userId");
		System.out.println("Captured userId: " + userId);
		
//		-----------------------------
		given().queryParam("userId", userId).
		when().get("/posts").
		then().log().all().statusCode(200).body("userId", everyItem(is(userId)));
		
		
		System.out.println("Thank you");
	}

}
