package correlation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.apache.http.HttpStatus;

public class ExtractResponse {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://localhost:3000";
		
		System.out.println("Testing Started");
		
//		given()	when()	then()	extract()
		
		
		Response res =  when().get("/posts/100").then().log().all().statusCode(200).extract().response();

		JsonPath jsonObj = res.jsonPath();
		int id = jsonObj.getInt("id");
		int userId = jsonObj.getInt("userId");
		String title = jsonObj.getString("title");
		
		System.out.println("Id userId and title extracted: " + id + " " + userId + " " + title);
		
		System.out.println("Thanks");
	}

}
