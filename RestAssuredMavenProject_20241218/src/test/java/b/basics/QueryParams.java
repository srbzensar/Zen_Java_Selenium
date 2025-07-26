package b.basics;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class QueryParams {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
//		path param (/posts/1 : path param)
//		given().
//		when().log().all().
//			get("/posts/1").
//		then().log().all().
//			assertThat().statusCode(200);
		
////		-----------------------------------------
//		
////		Query param
//		given().
//		when().log().all().
//			get("/posts?id=1").
//		then().log().all().assertThat().statusCode(200);
		
//		-----------------------------------------
//		Query param
//		given().
//			param("id", 1).
//		when().log().all().
//			get("/posts").
//		then().log().all().assertThat().statusCode(200);
//		
//		-----------------------------------------
//		
////		invalid key
//		given().
//			param("check", 1).log().all().
//		when().log().all().
//			get("/posts").
//		then().log().all().assertThat().statusCode(200); // it should have failed. security defect
		
////		-----------------------------------------
////		non existing id (empty array with status 200)
//		given().
//			param("id", 102).log().all().
//		when().log().all().
//			get("/posts").
//		then().log().all().assertThat().statusCode(200);
		
////		-----------------------------------------
////		invalid resource name
		given().
			param("id", 12).log().all().
		when().log().all().
			get("/post").
		then().log().all().assertThat().statusCode(404);

		
		System.out.println("Thank you");
	}
}
