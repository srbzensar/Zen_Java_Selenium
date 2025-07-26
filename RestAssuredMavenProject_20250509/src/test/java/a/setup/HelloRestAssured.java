package a.setup;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class HelloRestAssured {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		
//		Gherkin Syntax
//		given	condition/ pre-requisite	(e.g. body data, header, parameter, etc.)  
//		when	get(), post(), put(), delete() 
//		then	perform validations
//		extract	extract response
		
		System.out.println("API Testing Started");
		
//		given().
//		when().
//			get("/posts/1").
//		then().statusCode(200);

//		given().when().log().all().get("/posts/1").then().log().all().statusCode(200);
		given().when().log().uri().get("/posts/1").then().log().body().statusCode(200);
		
////		expected to fail
//		given().
//		when().
//			get("/posts/1").
//		then().statusCode(201);
		
//		-----------------------------
//		sequence is important
//		when().given();
		
//		-----------------------------
		
//		what is mandatory?
		when().get("/posts/1");
		
		System.out.println("Thank you");
	}

}
