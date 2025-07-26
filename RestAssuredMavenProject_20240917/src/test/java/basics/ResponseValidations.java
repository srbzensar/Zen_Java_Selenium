package basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class ResponseValidations {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing started");
		
		Response response = when().get("/posts/12");
		
		String responseBody = response.body().asString();
		
		System.out.println(responseBody);
		String expectedStr = "ea odit";
		
		assertTrue(responseBody.contains(expectedStr));
		
		String expectedId = "\"id\": 12";
		assertTrue(responseBody.contains(expectedId));
		
//		JSON Value check
		JsonPath jsonObj = response.jsonPath(); // parsing
		int id = jsonObj.getInt("id");
		assertEquals(id, 12);
		
		
		System.out.println("Thanks");
		
	}

}
