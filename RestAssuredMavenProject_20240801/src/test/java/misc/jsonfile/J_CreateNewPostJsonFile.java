package misc.jsonfile;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*; // given(), ...

import static org.hamcrest.Matchers.*; // static methods from hamcrest lib: is(), ...

import java.io.File;
import java.io.IOException;

// Create a new post using POST method :: header, payload
// Validate: Status code is 201, id is 101, title is "foo"

public class J_CreateNewPostJsonFile {

	public static void main(String[] args)  
	{

		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";

		String filePath = "files/postData.json";
		
		File jsonFile = new File(filePath);
		
		given().
			header("Content-type", "application/json; charset=UTF-8").
			body(jsonFile).
		when().
			post("/posts").
		then().log().all().
			assertThat().statusCode(201).and().
			body("id", is(101)).and().
			body("title", is("foo"));
		
//		----------------------------
	}
	

}
