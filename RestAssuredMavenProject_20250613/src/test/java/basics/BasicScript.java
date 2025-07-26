package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicScript {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("Testing Started");
		
		given().
		when().log().all().
			get("/posts/1").
		then().log().all().
			assertThat().statusCode(200);
		
		
		System.out.println("Thanks");
	}

}
