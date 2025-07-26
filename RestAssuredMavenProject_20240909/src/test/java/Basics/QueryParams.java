package Basics;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;


public class QueryParams {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
//		path param
//		given().
//		when().log().all().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(200);

//		--------------------------------
//		query param
		
//		given().
//		when().log().all().
//			get("/posts?id=1").
//		then().log().all().
//			assertThat().statusCode(200);

		
		given().
			queryParam("id", 1).
		when().log().all().
			get("/posts").
		then().log().all().
			assertThat().statusCode(200);
		
		
		System.out.println("Thank you");
	}
}
