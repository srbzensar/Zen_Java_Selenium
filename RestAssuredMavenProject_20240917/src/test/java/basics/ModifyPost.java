package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ModifyPost {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing started");
		
		String reqBody = "{\r\n"
				+ "\"title\": \"foo\",\r\n"
				+ "\"body\": \"bar\",\r\n"
				+ "\"userId\": 1,\r\n"
				+ "\"id\": 1\r\n"
				+ "}";
		
		given().
			header("Content-Type", "application/json; charset=UTF-8").
			body(reqBody).
		when().
			put("/posts/1").
		then().log().all().
			assertThat().statusCode(200).
			body("id", is(1)).
			body("title", is("foo"));
		
		System.out.println("Thanks");
		
	}

}
