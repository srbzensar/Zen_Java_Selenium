package e.pojoexamples;

import io.restassured.RestAssured;
import e.pojoexamples.models.PostResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;


public class B_FetchPost_POJO {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("Testing Started");
		
		
		PostResponse postR = given().
			get("/posts/12").
		then().log().all()
			.assertThat().statusCode(200)
			.body("id", is(12))
			.body("userId", is(2))
		.extract().as(PostResponse.class);
		
		assertEquals(postR.getTitle(), "in quibusdam tempore odit est dolorem");
		System.out.println(postR.getTitle());
		
		int varUserId = postR.getUserId();
		System.out.println(varUserId);
		
		
		System.out.println("Thanks");
	}

}
