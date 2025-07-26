package Basics;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;


public class RAValidationThen {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
//		Assert success
//		when().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(200);

//		------------------------------
		
//		Assert failure
//		when().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(201);		

		
//		when().
//			get("/posts/102").
//		then().log().all().
//			assertThat().statusCode(200);		
		
//		----------------------------------
		
//		when().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK);
		
//		----------------------------------
		
//		when().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK).contentType("application/json");
//		----------------------------------
		
//		when().
//		get("/posts/1").
//		then().log().all().
//		assertThat().statusCode(HttpStatus.SC_OK).and().contentType("application/json");
//		----------------------------------
//		validate id
		
//		when().get("/posts/12").then().log().all().
//		assertThat().statusCode(200).and().body("id", is(12));

//		----------------------------------
//		challenge: validate userId
//		when().get("/posts/12").then().log().all().
//		assertThat().statusCode(200).and().body("userId", is(2));
		
//		----------------------------------
//		Challenge: Fetch a post with id 2 and validate title should be "qui est esse"
//		String expTitle = "qui est esse";
//		String expTitle = "QUI est esse";
//		when().get("/posts/2").then().log().all().
//		assertThat().statusCode(200).and().body("title", is(expTitle));
//		assertThat().statusCode(200).and().body("title", equalTo(expTitle));
//		assertThat().statusCode(200).and().body("title", equalToIgnoringCase(expTitle));
		
//		----------------------------
//		challenge: fetch a post with id 2 (using query param): validate the id in response
//		when().get("/posts?id=2").then().log().all().
////		assertThat().statusCode(200).and().body("id", is(2));  // error
//		assertThat().statusCode(200).and().body("id", hasItem(2));  
//		assertThat().statusCode(200).and().body("[0].id", is(2));
		
//		----------------------------
//		check for record count: check for record count when trying to fetch posts using query param (?id=2)
//		given().queryParam("id", 2).
//		when().get("/posts").then().log().all().
//		assertThat().statusCode(200).and().body("size()", is(1));
		
//		----------------------------
//		fetch all the posts for userId 1 (query param) and validate userId 1, id 1,2, 9, 10 and 
////	record count 10
		given().
			queryParam("userId", 1).
		when().
			get("/posts").
		then().log().all().statusCode(200).and().
			body("size()", is(10)).and().body("id", hasItems(1,2,9,10)).and().
			body("userId", everyItem(equalTo(1)));
		
		
		System.out.println("Thank you");
	}
}
