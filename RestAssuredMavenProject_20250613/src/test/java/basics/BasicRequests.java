package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BasicRequests {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("Testing Started");
		
		given().
		when().log().all().
			get("/posts/1").
		then().log().all().
			assertThat().statusCode(200);
		
//		challenges:
//		post with id 12
//		all posts
//		delete a post with id 12
//		fetch post with id 101
//		delete a post with id 101
//		delete a post with id 1 but incorrect resource name (post)
		
		
		
		System.out.println("Thanks");
	}

}
