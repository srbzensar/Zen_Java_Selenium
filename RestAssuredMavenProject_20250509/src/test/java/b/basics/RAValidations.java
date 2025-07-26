package b.basics;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;  

import org.apache.http.HttpStatus;

public class RAValidations {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://localhost:3000";
		
		System.out.println("API Testing Started");
		
//		when().
//			get("/posts/1").
//		then().log().all().assertThat().statusCode(200);
		
//		when().
//		get("/posts/102").
//		then().log().all().assertThat().statusCode(200);
		
		
//		when().
//			get("/posts/1").
//		then().log().all().assertThat().statusCode(HttpStatus.SC_OK);

//		when().
//			get("/posts/12").
//		then().log().all().assertThat().statusCode(HttpStatus.SC_OK).contentType("application/json");

//		when().
//		get("/posts/12").
//		then().log().all().assertThat().statusCode(HttpStatus.SC_OK).and().contentType("application/json");
		
//		when().
//		get("/posts/12").
//		then().log().all().assertThat().statusCode(200).body("id", is("12"));
		
//		Title should not be Null
		when().
		get("/posts/12").
		then().log().all().assertThat().statusCode(200).body("title", notNullValue());
		
			
		
		
		System.out.println("Thank you");
	}

}
