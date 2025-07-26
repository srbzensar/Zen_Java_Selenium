package b.basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BasicScript {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
		given().
		when().
			get("/posts/1").
		then().statusCode(200);

		System.out.println("Thank you");
	}

}
