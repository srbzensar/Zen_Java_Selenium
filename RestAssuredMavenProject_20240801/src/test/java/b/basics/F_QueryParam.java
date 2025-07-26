package b.basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class F_QueryParam {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
//		path param (/posts/1 : path param)
//		given().
//		when().
//			get("/posts/1").
//		then().log().all().assertThat().statusCode(200);
		
//		----------------------------
		
//		Query param
//		given().
//		when().
//			get("/posts?id=1").
//		then().log().all().assertThat().statusCode(200);
//		----------------------------
		
//		Query param
		
//		given().
//			param("id", 1).
//		when().
//			get("/posts").
//		then().log().all().assertThat().statusCode(200);
	
//		----------------------------
		
//		Query param
		
//		given().
//			queryParam("id", 1).
//		when().
//			get("/posts").
//		then().log().all().assertThat().statusCode(200);
		
//		Note: Specify a query parameter that'll be sent with the request. 
//		Note that this method is the same as param(String, Object)for all http methods 
//		except for POST where param(String, Object) adds a form parameter 
//		and this method sets a query parameter.
//		----------------------------
		
//		given().
//			param("userId", 1).
//		when().
//			get("/posts").
//		then().
//			log().all().assertThat().statusCode(200);
		
//		----------------------------
////		invalid key
//		
//		given().
//			param("check", 1).log().all().
//		when().
//			get("/posts").
//		then().
//			log().all().assertThat().statusCode(200);  // it should have failed. security defect
		
//		----------------------------
		
////	non existing id (empty array with status 200)
	
//	given().
//		param("id", 102).log().all().
//	when().
//		get("/posts").
//	then().
//		log().all().assertThat().statusCode(200);  
	
//	----------------------------
	
//// invalid resource name (404 Not Found)

//given().
//	param("id", 12).log().all().
//when().
//	get("/post").
//then().
//	log().all().assertThat().statusCode(404);  
		
		
	}
	

}
