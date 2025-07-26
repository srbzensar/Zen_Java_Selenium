package b.basics;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

public class ValidateHeader {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";

		System.out.println("API Testing Started");

		Response response = when().get("/posts/12");
		String headerContentType = response.header("Content-Type");
		assertEquals(headerContentType, "application/json; charset=utf-8");
		
//		System.out.println(response); 
//		System.out.println(response.asString()); 
		System.out.println(response.body().asString()); 
		
		
		
		System.out.println("Thank you");
	}

}
