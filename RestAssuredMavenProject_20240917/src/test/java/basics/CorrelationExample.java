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
		
		Response res = when().get("/posts/55").then().log().all().statusCode(200).extract().response();
		
		JsonPath jsonObj = res.jsonPath();
		int varUserId = jsonObj.getInt("userId");
		
		System.out.println("Captured userId is " + varUserId);
//		-----------------------------------
		
		given().queryParam("userId", varUserId).
		when().get("/posts").
		then().log().all().statusCode(200).
			body("userId", everyItem(equalTo(varUserId)));
		
		
		System.out.println("Thanks");
		
	}

}
