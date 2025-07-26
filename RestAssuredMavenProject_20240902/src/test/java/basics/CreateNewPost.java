package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//Create a new post using POST method :: header, payload
//Validate: Status code is 201, id is 101, title is "foo"


public class CreateNewPost {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing started");
		
		String reqBody = "{\r\n"
				+ " \"title\": \"foo\",\r\n"
				+ " \"body\": \"bar\",\r\n"
				+ " \"userId\": 1\r\n"
				+ "}";
		
		given().
			header("Content-type", "application/json; charset=UTF-8").
			body(reqBody).
		when().
			post("/posts").
		then().log().all().
			assertThat().statusCode(201).
			body("id", is(101)).
			body("title", is("foo"));

		
		System.out.println("Thank you");
	}

}
