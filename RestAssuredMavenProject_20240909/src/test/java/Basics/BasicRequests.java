package Basics;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;


public class BasicRequests {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
//		given().
//		when().log().all().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(200);
		
//		----------------------------
//		post with id 12
		
//		given().
//		when().log().all().
//			get("/posts/12").
//		then().log().all().
//			assertThat().statusCode(200);

//		----------------------------
//		all posts
		
//		given().
//		when().log().all().
//			get("/posts").
//		then().log().all().
//			assertThat().statusCode(200);
		
//		----------------------------
//		delete a post with id 12
		
		given().
		when().log().all().
			delete("/posts/12").
		then().log().all().
			assertThat().statusCode(200);
		
		
		
		System.out.println("Thank you");
	}
}
