package Basics;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class CreateNewPost {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
		String reqBody = "{\r\n"
				+ " \"title\": \"foo\",\r\n"
				+ " \"body\": \"bar\",\r\n"
				+ " \"userId\": 1\r\n"
				+ "}";
		
		given().
			header("Content-type", "application/json; charset=UTF-8").
			body(reqBody).
		when().log().all().
			post("/posts").
		then().log().all().
			assertThat().statusCode(201).body("id", is(101));

		System.out.println("Thank you");
	}
}
