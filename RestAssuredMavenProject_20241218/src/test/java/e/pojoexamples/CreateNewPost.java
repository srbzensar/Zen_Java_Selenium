package e.pojoexamples;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.*;

import e.pojoexamples.models.PostRequest;

public class CreateNewPost {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
		PostRequest newPost = new PostRequest("foo", "bar", 10);
		
		given().
			contentType(ContentType.JSON).
			body(newPost).
		when().log().all().
			post("/posts").
		then().log().all().
			assertThat().statusCode(201).
			body("id", is(101)).
			body("title", is(newPost.getTitle())).		
			body("body", is(newPost.getBody())).		
			body("userId", is(newPost.getUserId()));		
		
		System.out.println("Thank you");
	}
}
