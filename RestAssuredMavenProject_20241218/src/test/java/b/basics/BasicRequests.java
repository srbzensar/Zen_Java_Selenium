package b.basics;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class BasicRequests {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
//		given().
//		when().log().all().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(200);		
		
//		---------------------------------------------
		
//		given().when().get("/posts/1").then().log().all().assertThat().statusCode(200);		
		
//		---------------------------------------------
//		challenges
		
//		post with id 12
		
		given().
		when().log().all().
			get("/posts/12").
		then().log().all().
			assertThat().statusCode(200);
//		---------------------------------------------

//		all posts

		given().
		when().log().all().
			get("/posts").
		then().log().all().
			assertThat().statusCode(200);
		
//		---------------------------------------------
//		delete a post with id 12
		given().
		when().log().all().
			delete("/posts/12").
		then().log().all().
			assertThat().statusCode(200);
		
//		---------------------------------------------
//		post with id 101
		
		given().
		when().
			get("/posts/101").
		then().log().all().assertThat().statusCode(404);
		
//		---------------------------------------------
//		delete a post with id 101
		
		given().
		when().
			delete("/posts/101").
		then().log().all().assertThat().statusCode(200);
		
		
//		---------------------------------------------
//		delete a post with id 1 but incorrect resource name
		
		given().
		when().
			delete("/post/12").
		then().log().all().assertThat().statusCode(404);
		
//		---------------------------------------------

		
		
		
		System.out.println("Thank you");
	}
}
