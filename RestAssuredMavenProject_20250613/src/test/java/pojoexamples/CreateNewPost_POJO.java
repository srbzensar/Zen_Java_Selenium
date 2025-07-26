package pojoexamples;

import io.restassured.RestAssured;
import pojoexamples.models.PostRequest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.apache.http.HttpStatus;

public class CreateNewPost_POJO {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("Testing Started");
		
		PostRequest newPost = new PostRequest("foo", "bar", 10);
		
		given().
			header("Content-Type","application/json; charset=utf-8").
			body(newPost).
		when().log().all().
			post("/posts").
		then().log().all().
			assertThat().statusCode(HttpStatus.SC_CREATED)
			.body("title", is(newPost.getTitle()))
			.body("body", is(newPost.getBody()))
			.body("userId", is(newPost.getUserId()));
		
		
		System.out.println("Thanks");
	}

}
