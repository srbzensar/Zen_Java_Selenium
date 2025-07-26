package b.basics;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;

import io.restassured.RestAssured;

public class RAThenValidations {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
		
//		Assertion success
//		when().
//			get("/posts/1").
//		then().log().all().assertThat().statusCode(200);		
		
//		-----------------------------
		
//		Assertion failure
//		when().
//			get("/posts/1").
//		then().log().all().assertThat().statusCode(201);		
		
//		or
		
//		when().
//			get("/posts/102").
//		then().log().all().assertThat().statusCode(200);
////		-----------------------------
//		
//		when().
//			get("/posts/1").
//		then().log().all().assertThat().statusCode(HttpStatus.SC_OK);	
////		-----------------------------
//		
//		when().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK).contentType("application/json");	
		
//		-----------------------------
//		
//		when().
//		get("/posts/1").
//		then().log().all().
//		assertThat().statusCode(HttpStatus.SC_OK).and().contentType("application/json");	
		
		
//		-----------------------------
//		validate id
		
//		when().get("/posts/12").then().log().all().
//		assertThat().statusCode(200).and().body("id", is(12));	
		
//		-------------------------------
//		validate the userId
//		when().get("/posts/12").then().log().all().
//		assertThat().statusCode(200).and().body("userId", is(2));	

//		-------------------------------
//		validate the title
//		when().get("/posts/12").then().log().all().
//		assertThat().statusCode(200).and().body("title", is("in quibusdam tempore odit est dolorem"));	
		
//		----------------------------
//		challenge: fetch a post with id 2 (using query param): validate the id in responses
//		when().get("/posts?id=12").then().log().all().
//		assertThat().statusCode(200).and().body("[0].id", is(12));	
//		or
//		when().get("/posts?id=12").then().log().all().
//		assertThat().statusCode(200).and().body("id", hasItem(12));
		
//		-----------------------------------------------------------------
//		challenges using query param
//		1. for post id 23: validate that userId is 3 and id is 23
//		when().get("/posts?id=23").then().log().all().
//		assertThat().statusCode(200).and().body("id", hasItem(23)).and().body("userId", hasItems(3));
		
//		2. check for record count when trying to fetch posts using query param (?id=2)
//		given().queryParam("id", 2).
//		when().get("/posts").then().log().all().
////		assertThat().statusCode(200).and().body("id", hasSize(1));
//		assertThat().statusCode(200).and().body("size()", is(1));
		
		
//		3. fetch all the posts for userId 1 (query param) and validate userId 1, id 1,2, 9, 10 and 
//		record count 10  
//		hint: for ids > hasItems()			size(), is()
//		given().
//			queryParam("userId", 1).
//		when().
//			get("/posts").
//		then().log().all().statusCode(200).and().
//			body("userId", hasItem(1)).and().
//			body("id", hasItems(1, 2, 9, 10)).and().body(".", hasSize(10)); 
		
		
//		4. Fetch all the posts and validate the record count, few ids and few user Ids, and any one title
		when().
			get("/posts").
		then().log().all().statusCode(200).and().
			body("size()", is(100)).and().body("id", hasItems(1,52,99,100)).and().
			body("userId", hasItems(1,2,9,10)).and().body("title", hasItems("qui est esse"));
		
		
		
		System.out.println("Thank you");
	}
}
