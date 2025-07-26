package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.apache.http.HttpStatus;

public class CreateNewPost {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("Testing Started");
		
		String reqBody = "{\r\n"
				+ "\"userId\": 1,\r\n"
				+ "\"title\": \"foo\",\r\n"
				+ "\"body\": \"bar\"\r\n"
				+ "}";
		
		given().
			header("Content-Type","application/json; charset=utf-8").
			body(reqBody).
		when().log().all().
			post("/posts").
		then().log().all().
			assertThat().statusCode(HttpStatus.SC_CREATED); // 201
		
		
		System.out.println("Thanks");
	}

}
