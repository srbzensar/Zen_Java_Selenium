package pojoexamples;

import io.restassured.RestAssured;
import pojoexamples.models.PostRequest;
import pojoexamples.models.PostResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.List;

import org.apache.http.HttpStatus;

public class FetchPostsUserId_POJO {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("Testing Started");
		
		
		List<PostResponse> posts = 
		when().
			get("/posts?userId=2").
		then().log().all()
			.assertThat().statusCode(200)
		.extract().response().jsonPath().getList(".", PostResponse.class);
		
		assertEquals(posts.get(0).getId(), 11);
		
		int varUserId = posts.get(0).getUserId();
		System.out.println(varUserId);
		
		System.out.println("Thanks");
	}

}
