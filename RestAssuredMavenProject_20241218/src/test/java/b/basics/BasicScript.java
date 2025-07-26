package b.basics;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class BasicScript {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
		given().
		when().log().all().
			get("/posts/1").
		then().log().all().
			assertThat().statusCode(200);		
		
		System.out.println("Thank you");
	}
}
