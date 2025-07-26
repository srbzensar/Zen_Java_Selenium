package b.basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class QueryParams {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://localhost:3000";
		
		System.out.println("API Testing Started");
		
//		path param
//		given().
//		when().
//			get("/posts/1").
//		then().statusCode(200);

//		--------------------------------------------
//		query param
//		given().
//		when().
//			get("/posts?id=1").
//		then().log().body().assertThat().statusCode(200);

//		--------------------------------------------
//		query param
//		given().
//			param("id", 1).
//		when().
//			get("/posts").
//		then().log().body().assertThat().statusCode(200);

		
//		--------------------------------------------
		given().
			queryParam("id", 1).
		when().
			get("/posts").
		then().log().body().assertThat().statusCode(200);

		System.out.println("Thank you");
	}

}
