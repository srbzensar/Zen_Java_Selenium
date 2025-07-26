package b.basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BasicRequests {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
//		given().
//		when().
//			get("/posts/1").
//		then().statusCode(200);
		
//		given().when().log().uri().get("/posts/1").then().log().status().assertThat().statusCode(200);

//		given().when().log().uri().get("/posts/12").then().log().body().assertThat().statusCode(200);

//		given().when().log().uri().get("/posts").then().log().body().assertThat().statusCode(200);
		
//		given().when().log().uri().delete("/posts/12").then().log().body().assertThat().statusCode(200);
		
//		given().when().log().uri().get("/posts/101").then().log().status().assertThat().statusCode(200);

//		given().when().log().uri().delete("/posts/101").then().log().status();

		given().when().log().uri().delete("/post/1").then().log().status();

		
		System.out.println("Thank you");
	}

}
