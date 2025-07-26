package b.basics;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import static org.testng.Assert.assertEquals;


public class D_ValidateHeader {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		
		Response response =	when().get("/posts/1");
		String headerContentType = response.header("Content-Type");
		assertEquals(headerContentType, "application/json; charset=utf-8");
		
		System.out.println(response); // reference
		System.out.println(response.asString()); // json object in string format 
//		System.out.println(response.body().asString()); 
		
		
		
//		----------------------------
	}
	

}
