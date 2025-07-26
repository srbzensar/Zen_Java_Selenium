package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.apache.http.HttpStatus;
import static org.hamcrest.Matchers.*;

public class ValidationsThen {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing started");
		
//		Assertion success
//		when().
//			get("/posts/1").
//		then().log().all().assertThat().statusCode(200);
		
//		Assertion Failure
//		when().
//			get("/posts/1").
//		then().log().all().assertThat().statusCode(201);
		
//		--------------------------
//		when().
//			get("/posts/12").
//		then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
		
//		--------------------------
//		when().
//			get("/posts/12").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK).contentType("application/json");
//		
//		when().
//			get("/posts/12").
//		then().log().all().
//			assertThat().statusCode(HttpStatus.SC_OK).and().contentType("application/json");
//		------------------------------------------

//		Validate the id
//		when().get("/posts/12").then().log().all().
//		assertThat().statusCode(200).and().body("id", is(12));

//		validate userId
//		when().get("/posts/12").then().log().all().
//		assertThat().statusCode(200).and().body("userId", is(2));
//		--------------------------------------
		
//		validate the title
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
//		--------------------------------------
		
//		challenge: fetch a post with id 2 (using query param): validate the id in responses
//		when().get("/posts?id=2").then().log().all().
//		assertThat().statusCode(200).and().body("id", hasItem(2));
////		assertThat().statusCode(200).and().body("id", is(2)); // error: id doesn't match
		
//		or
//		when().get("/posts?id=2").then().log().all().
//		assertThat().statusCode(200).and().body("[0].id", is(2));
		
//		--------------------------------------
//		challenges: query param:
//		1. for post id 23: validate that userId is 3 and id is 23
		when().get("/posts?id=23").then().log().all().
		assertThat().statusCode(200).and().body("id", hasItem(23)).and().body("userId", hasItems(3));
		
//		2. fetch all the posts for userId 1 (query param) and validate for each record userId 1, id 1,2, 9,10 and record count is 10
		when().get("/posts?userId=1").then().log().all().
		assertThat().
		statusCode(200).
		body("userId", everyItem(equalTo(1))).
		body("id", hasItems(1, 2, 9, 10)).
		body("size()", is(10));
		
//		assignment: 3. Fetch all the posts and validate the record count, few ids and few user Ids, and any one title 
		
		
		System.out.println("Thanks");
		
	}

}
