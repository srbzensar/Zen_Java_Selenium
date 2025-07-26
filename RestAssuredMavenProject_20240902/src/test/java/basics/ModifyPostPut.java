package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*; // given(), ...

import org.apache.http.HttpStatus; // check HttpStatus.SC_OK

import static org.hamcrest.Matchers.*; // static methods from hamcrest lib: is(), ...

// Modify an existing post (with id 20)
// Validate the status code, id, userId and body


public class ModifyPostPut {

	public static void main(String[] args) 
	{

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		String reqBody = "{\r\n"
				+ " \"id\": 20,\r\n"
				+ " \"title\": \"foo\",\r\n"
				+ " \"body\": \"bar\",\r\n"
				+ " \"userId\": 1\r\n"
				+ "}";
		
		given().
			header("Content-type", "application/json; charset=UTF-8").
			body(reqBody).
		when().
			put("/posts/20").
		then().log().all().
			assertThat().statusCode(200).and().
			body("id", is(20)).and().
			body("userId", is(1)).and().
			body("body", is("bar"));
		
//		----------------------------
	}
	

}
