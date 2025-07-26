package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BasicRequests {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing started");
		
//		given().
//		when().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(200);
		
	
		
//		challenge: post with id 12
//		given().
//		when().
//			get("/posts/12").
//		then().log().all().
//			assertThat().statusCode(200);
		
//		all posts
//		given().
//		when().
//			get("/posts").
//		then().log().all().
//			assertThat().statusCode(200);
		
		
//		delete post with id 12
//		given().
//		when().
//			delete("/posts/12").
//		then().log().all().
//			assertThat().statusCode(200);
		
//		fetch a post with id 101
		given().
		when().
			get("/posts/101").
		then().log().all().
			assertThat().statusCode(404);
		
		
		System.out.println("Thanks");
		
	}

}
