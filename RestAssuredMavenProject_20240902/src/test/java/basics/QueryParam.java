package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class QueryParam {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing started");
		
////		path param (/posts/1)
//		given().
//		when().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(200);

//		---------------------------
		
////		query param (/posts?id=1)
//		given().
//		when().
//		get("/posts?id=1").
//		then().log().all().
//		assertThat().statusCode(200);
		
//		---------------------------
		
////		query param 
//		given().
//			param("id", 1).
//		when().
//			get("/posts").
//		then().log().all().assertThat().statusCode(200);

//		---------------------------
		
////		challenge: fetch all posts for userId 1 
//		given().
//			param("userId", 1).
//		when().
//			get("/posts").
//		then().log().all().assertThat().statusCode(200);
		
//		---------------------------
		
////		challenge: invalid key
//		given().
//			param("ID", 1).
//		when().
//			get("/posts").
//		then().log().all().assertThat().statusCode(200);

//		---------------------------
		
////		challenge: non existing id 
//		given().
//			param("id", 101).
//		when().
//			get("/posts").
//		then().log().all().assertThat().statusCode(200);
		
//		---------------------------
		
//////		challenge: invalid resource name 
//		given().
//			param("id", 12).
//		when().
//			get("/post").
//		then().log().all().assertThat().statusCode(404);
//		
		
		System.out.println("Thank you");
	}

}
