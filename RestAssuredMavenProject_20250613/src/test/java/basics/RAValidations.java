package basics;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;

public class RAValidations {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("Testing Started");
		
//		given().
//		when().log().all().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(200);
		
//		given().
//		when().log().all().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK);
		
//		when().
//			get("/posts/12").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK).contentType("application/JSON");
		
//		when().
//			get("/posts/12").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK).body("id", is(12));
		
//		challenges:
//		1. validate userId
//		2. validate title
		
//		when().
//			get("/posts/12").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK).body("userId", is(2)).and().body("title", is("qui est esse"));
		
		
//		challenge: do the validations in case of query param
		when().
			get("/posts?id=12").
		then().log().all().
			assertThat().statusCode(HttpStatus.SC_OK).body("userId", is(2)).and().body("title", is("qui est esse"));
		
	
		
		
		System.out.println("Thanks");
	}

}
