package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.apache.http.HttpStatus;

import static org.hamcrest.Matchers.*;  // static methods from hamcrest lib: is(), ...

public class RAThenValidations {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing started");
		
		
//		Assertion success
//		when().
//			get("/posts/1").
//		then().log().all().assertThat().statusCode(200);

//		-----------------------------------
		
//		Assertion failure
//		when().
//		get("/posts/1").
//		then().log().all().assertThat().statusCode(201);
		
//		when().
//		get("/posts/102").
//		then().log().all().assertThat().statusCode(200);
		
//		-----------------------------------------		
		
//		when().
//		get("/posts/1").
//		then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
		
//		-----------------------------------------		
		
//		when().
//			get("/posts/12").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK).contentType("application/json");
		
//		-----------------------------------------		
		
//		when().
//		get("/posts/12").
//		then().log().all().
//		assertThat().statusCode(HttpStatus.SC_OK).and().contentType("application/json");
		
//		-----------------------------------------		
//		validate the id
		
//		when().get("/posts/12").then().log().all().
//		assertThat().statusCode(200).and().body("id", is(12));

//		challenge: validate userId

//		when().get("/posts/12").then().log().all().
//		assertThat().statusCode(200).and().body("userId", is(2));

//		----------------------------
////	Challenge: Fetch a post with id 2 and validate title should be "qui est esse"
		
//		String expTitle = "qui est esse";
//		String expTitle = "QUI est esse";
//		String expTitle = "est";
//		String expTitle = "qui";
//		String expTitle = "esse";
//		when().get("/posts/2").then().log().all().
//		assertThat().statusCode(200).and().body("title", is(expTitle));
//		assertThat().statusCode(200).and().body("title", equalTo(expTitle));
//		assertThat().statusCode(200).and().body("title", equalToIgnoringCase(expTitle));
//		assertThat().statusCode(200).and().body("title", containsString(expTitle));
//		assertThat().statusCode(200).and().body("title", startsWith(expTitle));
//		assertThat().statusCode(200).and().body("title", endsWith(expTitle));
		
//		----------------------------
//		challenge: fetch a post with id 2 (using query param): validate the id in responses

//		when().get("/posts?id=2").then().log().all().
//		assertThat().statusCode(200).and().body("[0].id", is(2)); 
//		---------
		
//		when().get("/posts?id=2").then().log().all().
//		assertThat().statusCode(200).and().body("id", hasItem(2));
//		assertThat().statusCode(200).and().body("id", contains(2));

//		----------------------------
//		challenges using query param:
//		----------------------------
		
//		1. for post id 23: validate that userId is 3 and id is 23
//		when().get("/posts?id=23").then().log().all().
//		assertThat().statusCode(200).and().body("id", hasItem(23)).and().body("userId", hasItem(3));
		
//		2. check for record count when trying to fetch posts using query param (?id=2)
//		when().get("/posts?id=2").then().log().all().
//		assertThat().statusCode(200).and().body("id.size()", is(1));
//		OR
//		assertThat().statusCode(200).and().body("size()", is(1));
//		OR
//		assertThat().statusCode(200).and().body("id", hasSize(1));
		
////	3. fetch all the posts for userId 1 (query param) and validate userId 1, id 1,2, 9, 10 and 
////	record count 10  
//		given()
//        	.queryParam("userId", 1)
//        .when()
//        	.get("/posts")
//        .then()
//        	.statusCode(200)
//        	.body("userId", everyItem(equalTo(1))) 
//        	.body("id", hasItems(1, 2, 9, 10)) 
//        	.body("size()", is(10)); 
		
//		4. Fetch all the posts and validate the record count, few ids and few user Ids, and any one title
//	    when()
//	    	.get("/posts")
//	    .then().log().all()
//	    	.statusCode(200)
//	    	.body("userId", hasItems(1, 5, 10)) 
//	    	.body("id", hasItems(1, 22, 89, 100)) 
//	    	.body("size()", is(100))
//	    	.body("title", hasItems("qui est esse"));

		
		System.out.println("Thank you");
	}

}
