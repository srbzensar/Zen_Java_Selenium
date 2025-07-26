package c.correlation;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

//Fetch a single post (with id 100) and use extract() to extract the response

public class ExtractResponse {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
		Response res = when().get("posts/100").then().log().all().statusCode(200).extract().response();
		
		JsonPath jsonObj = res.jsonPath();
		int id = jsonObj.getInt("id");
		int userId = jsonObj.getInt("userId");
		String title = jsonObj.getString("title");
		
		System.out.println("id userId and title extraced using json path: " + id + " " + userId + " " + title);		
		
		System.out.println("Thank you");
	}
}
