package b.basics;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateHeader {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
		Response response = when().get("/posts/1");
		String headerContentType = response.header("Content-Type");	
		
		assertEquals(headerContentType, "application/json; charset=utf-8");
		
		System.out.println(response); // reference
		System.out.println(response.asString()); // json object in string format
//		System.out.println(response.body().asString()); // json object in string format
		
		
		System.out.println("Thank you");
	}
}
