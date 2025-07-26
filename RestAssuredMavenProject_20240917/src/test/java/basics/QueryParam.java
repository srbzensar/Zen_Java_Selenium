package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class QueryParam {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing started");
		
//		path param
//		given().
//		when().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(200);

//		query param
//		given().
//		when().
//			get("/posts?id=1").
//		then().log().all().
//			assertThat().statusCode(200);
		
//		given().
//			queryParam("id", 1).
//		when().
//			get("/posts").
//		then().log().all().
//			assertThat().statusCode(200);
//		-------------------------------------
		
//		challenge: fetch all posts for userId 1
		
		
//		fetch post for id 102 (status 200 with empty array)
		
//		invalid resource name (/post) 404 Not Found
		
		
		System.out.println("Thanks");
		
	}

}
