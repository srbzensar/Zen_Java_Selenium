package a.setup;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;


public class HelloRestAssured {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
//		Gherkin Syntax
		
//		given  	condition/ pre-requisite	(e.g. body data, header, parameter, etc.)
//		when	get(), post(), put(), delete() 
//		then	perform validations
//		extract	extract response
		
		System.out.println("API Testing Started");
		
//		given().
//		when().log().all().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(200);

//		-------------------
		given().when().log().all().get("/posts/1").then().log().all().assertThat().statusCode(200);
//		-------------
		
//		sequence is important
		
//		when().given();
		
//		--------------------------
//		when is mandatory, other parts are optional 
		when().get("/posts/1");

		
		
		System.out.println("Thank you");
	}
}
