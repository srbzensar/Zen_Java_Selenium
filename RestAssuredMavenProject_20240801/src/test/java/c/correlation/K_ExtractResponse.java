package c.correlation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

// Fetch a single post (with id 100) and use extract() to extract the response

public class K_ExtractResponse {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
//		given()	when()	then()	extract()
		
		Response res = when().get("/posts/100").then().log().all().statusCode(200).extract().response();
		
		JsonPath jsonObj = res.jsonPath();
		int id = jsonObj.getInt("id");
		int userId = jsonObj.getInt("userId");
		String title = jsonObj.getString("title");
		
		System.out.println("Id userId and title extracted json path "+ id + " " + userId + " " + title);
//		----------------------------
	}
	

}
