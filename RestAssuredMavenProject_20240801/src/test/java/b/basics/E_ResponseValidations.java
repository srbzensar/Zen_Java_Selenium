package b.basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
//import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;


public class E_ResponseValidations {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		
		Response response =	when().get("/posts/12");
		
		String responseBody = response.body().asString();
		
		
//		Validations in String format itself
		System.out.println(responseBody); 
		String expectedStr = "odit est";
		
		assertTrue(responseBody.contains(expectedStr));
		
		String expectedId = "\"id\": 12";
		assertTrue(responseBody.contains(expectedId));
		
		
//		JSON value check
		JsonPath jsonObj = response.jsonPath(); // parsing
//		int id = jsonObj.get("id");
//		assertEquals(id, 12);

		assertEquals(jsonObj.getInt("id"), 12);
		
		
		
		
//		----------------------------
	}
	

}
