package pojoexamples;

import io.restassured.RestAssured;
import pojoexamples.models.PostRequest;
import pojoexamples.models.PostResponse;

import static io.restassured.RestAssured.*; // given(), ...

import org.apache.http.HttpStatus; // check HttpStatus.SC_OK

import static org.hamcrest.Matchers.*; // static methods from hamcrest lib: is(), ...
import static org.testng.Assert.assertEquals;

import java.util.List;

public class GetPostsUserId {

	public static void main(String[] args) 
	{

		RestAssured.baseURI = "http://localhost:3000";

		int varUserId = 1;
		int varPostId = 1;
		
		List<PostResponse> posts = 
		given().
			header("Content-type", "application/json; charset=UTF-8").
		when().
			get("/posts?userId="+varUserId).
		then().log().all().
			assertThat().statusCode(200).extract().body().jsonPath().getList(".", PostResponse.class);
		
		for(PostResponse post: posts)
		{
			System.out.println("id: " + post.getId() + "\ttitle: " + post.getTitle());
			assertEquals(post.getUserId(), varUserId);
			assertEquals(post.getId(), varPostId++);
		}
		
//		----------------------------
	}
	

}
