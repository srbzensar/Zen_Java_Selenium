package b.basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ResponseValidations {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://localhost:3000";

		System.out.println("API Testing Started");

		Response response = when().get("/posts/12");
		
		String responseBody = response.body().asString();
		
		System.out.println(responseBody);
		
		String expectedStr = "odit est";
		assertTrue(responseBody.contains(expectedStr));
		
		String expectedId = "\"id\": \"12\"";
		assertTrue(responseBody.contains(expectedId));
		
//		JSON value check
		JsonPath jsonObj =  response.jsonPath(); // parsing
//		int id = jsonObj.getInt("id");
//		assertEquals(id, 12);
		
		assertEquals(jsonObj.getInt("id"), 12);
		
		System.out.println("Thank you");
	}

}
