package pojoexamples;

import io.restassured.RestAssured;
import pojoexamples.models.PostRequest;

import static io.restassured.RestAssured.*; // given(), ...

import org.apache.http.HttpStatus; // check HttpStatus.SC_OK

import static org.hamcrest.Matchers.*; // static methods from hamcrest lib: is(), ...

// Create a new post using POST method :: header, payload
// Validate: Status code is 201, id is 101, title is "foo"

public class CreatePost_POJO {

	public static void main(String[] args) 
	{

//		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		RestAssured.baseURI = "http://localhost:3000";

		PostRequest newPost = new PostRequest("foo", "bar", 10);
		
		given().
			header("Content-type", "application/json; charset=UTF-8").
			body(newPost).
		when().
			post("/posts").
		then().log().all().
			assertThat().statusCode(201).
			body("title", is(newPost.getTitle())).
			body("body", is(newPost.getBody())).
			body("userId", is(newPost.getUserId()));
		
//		----------------------------
	}
	

}
