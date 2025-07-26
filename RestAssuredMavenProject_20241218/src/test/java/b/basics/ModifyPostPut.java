package b.basics;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class ModifyPostPut {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
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
		
		System.out.println("Thank you");
	}
}
