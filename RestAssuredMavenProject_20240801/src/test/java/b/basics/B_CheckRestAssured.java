package b.basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class B_CheckRestAssured {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
//		Gherkin Syntax
//		given	condition/ pre-requisite  (e.g. body data, header, parameter, etc.)
//		when	get(), post(), put(), delete() 
//		then	perform validations
//		extract	extract response
		
		given().
		when().
			get("/posts/1").
		then().log().all().assertThat().statusCode(200);
		
//		----------------------------
		
//		given().when().get("/posts/1").then().log().all().assertThat().statusCode(200);
		
//		----------------------------
//		sequence is important
		
//		when().
//			get("/posts/1").
//		given().
//		then().log().all().assertThat().statusCode(200);
//		----------------------------
//		when is mandatory, other parts are optional 
//		
//		when().
//			get("/posts/1");
		
	}
	

}
