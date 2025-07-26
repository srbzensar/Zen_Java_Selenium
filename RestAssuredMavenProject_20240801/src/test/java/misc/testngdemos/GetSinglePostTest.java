package misc.testngdemos;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSinglePostTest {

	@BeforeClass
	public void setup()
	{
	    // Base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	}
	
	
    @Test
    public void fetchSinglePost() {
    
        // Send GET request to /posts/1
        Response response = RestAssured
                .given()
                .when()
                	.get("/posts/12")
                .then()
                	.statusCode(200) // Validate status code
                .extract()
                	.response();

        // Print response
        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());

        // Validate specific fields
        int userId = response.jsonPath().getInt("userId");
        int id = response.jsonPath().getInt("id");
        String title = response.jsonPath().getString("title");

        assertEquals(userId, 2, "User ID should be 1");
        assertEquals(id, 12, "Post ID should be 1");
        assertNotNull(title, "Title should not be null");
    }
}
