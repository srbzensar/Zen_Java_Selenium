package e.pojoexamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import e.pojoexamples.models.PostRequest;

public class A_CreatePost_POJO {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing started");
		
		PostRequest newPost =  new PostRequest("foo", "bar", 10);
				
		
		given().
			contentType(ContentType.JSON).
			body(newPost).
		when().
			post("/posts").
		then().log().all().
			assertThat().statusCode(201).
			body("title", is(newPost.getTitle())).
			body("body", is(newPost.getBody())).
			body("userId", is(newPost.getUserId()));

		
		System.out.println("Thank you");
	}

}
