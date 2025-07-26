package correlation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.apache.http.HttpStatus;

public class ExtractResponseArray {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://localhost:3000";
		
		System.out.println("Testing Started");
		
//		given()	when()	then()	extract()
		
		
		Response res =  when().get("/posts?userId=1").then().log().all().statusCode(200).extract().response();

		JsonPath jsonObj = res.jsonPath();
		int id = jsonObj.getInt("[0].id");
		int userId = jsonObj.getInt("[0].userId");
		String title = jsonObj.getString("[0].title");
		
		System.out.println("Id userId and title extracted: " + id + " " + userId + " " + title);
		
//		System.out.println(jsonObj.getList("id").size());
		System.out.println(jsonObj.getList(".").size());
		
		System.out.println("Thanks");
	}

}
