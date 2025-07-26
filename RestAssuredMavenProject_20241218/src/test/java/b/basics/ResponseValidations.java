package b.basics;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResponseValidations {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
		Response response = when().get("/posts/12");
		String responseBody = response.body().asString();
		System.out.println(responseBody);

		String expectedStr = "ea odit";
		assertTrue(responseBody.contains(expectedStr));
		
//		Validate that the id is 12
		String expectedId = "\"id\": 12";
		assertTrue(responseBody.contains(expectedId));
		
//		JSON Value check
		JsonPath jsonObj = response.jsonPath(); // parsing
//		int id = jsonObj.getInt("id");
//		assertEquals(id, 12);
		
		String title = jsonObj.getString("title");
		assertEquals(title, "in quibusdam tempore odit est dolorem");
		
		
		assertEquals(jsonObj.getInt("id"), 12);
		
		
		System.out.println("Thank you");
	}
}
