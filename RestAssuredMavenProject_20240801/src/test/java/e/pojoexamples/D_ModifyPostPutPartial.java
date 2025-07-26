package e.pojoexamples;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*; // given(), ...

import org.apache.http.HttpStatus; // check HttpStatus.SC_OK

import e.pojoexamples.models.PostResponseVariation;

import static org.hamcrest.Matchers.*; // static methods from hamcrest lib: is(), ...
import static org.testng.Assert.assertEquals;

// Modify an existing post (with id 20)
// Validate the status code, id, userId and body


public class D_ModifyPostPutPartial {

	public static void main(String[] args) 
	{

//		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RestAssured.baseURI = "http://localhost:3000";

		String reqBody = "{\r\n"
				+ " \"id\": 20,\r\n"
				+ " \"title\": \"foo\",\r\n"
				+ " \"keyv\": \"car\",\r\n"
				+ " \"body\": \"bar\"\r\n"
				+ "}";
		
//		PostResponseVariation postR = given().
//			header("Content-type", "application/json; charset=UTF-8").
//			body(reqBody).
//		when().
//			put("/posts/20").
//		then().log().all().
//			assertThat().statusCode(200).and().
//			body("id", is("20")).and().
//			body("body", is("bar")).extract().as(PostResponseVariation.class);
//		
//		assertEquals(postR.getTitle(), "foo");
		
		
//		for post id 19, we have the userId which is mandatory field, so it worked. 
		PostResponseVariation postR = given().
				header("Content-type", "application/json; charset=UTF-8").
			when().
				get("/posts/19").
			then().log().all().
				assertThat().statusCode(200).and().
			extract().as(PostResponseVariation.class);

////		for post id 20, we do not have the userId which is mandatory field, so it should not work.
//		PostResponseVariation postR = given().
//				header("Content-type", "application/json; charset=UTF-8").
//				when().
//				get("/posts/20").
//				then().log().all().
//				assertThat().statusCode(200).and().
//				extract().as(PostResponseVariation.class);
//		
//		System.out.println(postR.getPostBody());
//		----------------------------
	}
	

}
