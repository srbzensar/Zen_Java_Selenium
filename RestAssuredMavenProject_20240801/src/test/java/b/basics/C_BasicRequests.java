package b.basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class C_BasicRequests {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
//		given	condition/ pre-requisite  
//		when	get(), post(), put(), delete() 
//		then	perform validations
		
//		given().
//		when().
//			get("/posts/1").
//		then().log().all().assertThat().statusCode(200);
		
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
		
//		----------------------------
//		post with id 12
//		given().
//		when().
//			get("/posts/12").
//		then().log().all().assertThat().statusCode(200);
		
//		----------------------------
//		all posts
//		given().
//		when().
//			get("/posts").
//		then().log().all().assertThat().statusCode(200);
		
//		----------------------------
//		delete a post with id 12
//		given().
//		when().
//			delete("/posts/12").
//		then().log().all().assertThat().statusCode(200);
		
//		----------------------------
//		post with id 101
//		given().
//		when().
//			get("/posts/101").
//		then().log().all().assertThat().statusCode(404);
		
//		----------------------------
//		delete a post with id 101
//		given().
//		when().
//			delete("/posts/101").
//		then().log().all().assertThat().statusCode(200);
		
//		----------------------------
//		delete a post with id 1 but incorrect resource name
		given().
		when().
			delete("/post/12").
		then().log().all().assertThat().statusCode(404);
		
		
		
//		----------------------------
	}
	

}
