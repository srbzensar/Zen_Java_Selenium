package basics;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;

public class QueryParam_Validations {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("Testing Started");
		
//		2 ways of sending the query param
		
//		challenge: do the validations in case of query param
		String expTitle = "in quibusdam tempore odit est dolorem";
		
//		when().
//			get("/posts?id=12").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK)
//			.body("id", hasItem(12))
//			.body("userId", hasItem(2)).and()
//			.body("title", hasItem(expTitle));
	
		
//		given().
//			param("id", 12).
//		when().
//			get("/posts").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK)
//			.body("[0].id", is(12))
//			.body("userId[0]", is(2)).and()
//			.body("[0].title", is(expTitle));
	

//		challenge: fetch all the posts for userId 2 and validate ids 11, 15, 20, userId 2, size of the array
		given().
			param("userId", 2).
		when().
			get("/posts").
		then().log().all().
			assertThat().statusCode(HttpStatus.SC_OK)
			.body("id", hasItems(11,15,20))
			.body("userId", everyItem(equalTo(2)))
			.body("id", hasSize(10));
//			.body("size()", is(10));

//		Fetch all the posts and check ids 1, 50, 100, userIds 1, 5, 10, number of objects returned 
//		when().
//			get("/posts").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK)
//			.body("id", hasItems(1,50,100))
//			.body("userId", hasItems(1,5,10)).and()
//			.body("id", hasSize(100))
//			.body("userId", hasSize(100))
//			.body("size()", is(100));
		
		
		
		System.out.println("Thanks");
	}

}
