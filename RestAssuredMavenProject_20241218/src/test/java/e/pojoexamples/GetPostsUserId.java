package e.pojoexamples;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.util.List;

import e.pojoexamples.models.PostResponse;

public class GetPostsUserId {

	public static void main(String[] args) {
		
		int varUserId = 1;
		int varPostId = 1;
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
		List<PostResponse> posts = given().
			contentType(ContentType.JSON).
		when().
			get("/posts?userId="+varUserId).
		then().
			assertThat().statusCode(200).
		extract().
			body().jsonPath().getList(".", PostResponse.class);
					
		for(PostResponse post: posts)
		{
			System.out.println("id: " + post.getId() + "\ttitle: " + post.getTitle());
			assertEquals(post.getUserId(), varUserId, "userId did not match!");
			assertEquals(post.getId(), varPostId++, "id did not match!");
		}
		
		
		System.out.println("Thank you");
	}
}
