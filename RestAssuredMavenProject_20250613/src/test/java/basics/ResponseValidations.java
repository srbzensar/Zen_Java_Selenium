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
		
		System.out.println("Testing Started");
		
		Response response = when().get("/posts/12");
		
		String responseBody = response.body().asString();
		
		
		System.out.println(responseBody);
		String expStr = "odit est";
		
		assertTrue(responseBody.contains(expStr));
		
//		challenge: to check if the value of id is 12
		String expectedId = "\"id\": 12";
		assertTrue(responseBody.contains(expectedId));
		
//		JSON value check
		JsonPath jsonObj = response.jsonPath();  // deserialization/ parsing
		int id = jsonObj.get("id");
		assertEquals(id, 12);
		
		System.out.println("Thanks");
	}

}
