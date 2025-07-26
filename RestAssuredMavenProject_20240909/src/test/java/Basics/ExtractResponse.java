package Basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class ExtractResponse {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing Started");
		
//		given()	when()	then()	extract()
		
		Response res = given().when().get("/posts/1").then().log().all().statusCode(200).extract().response();

		JsonPath jsonObj = res.jsonPath();
		int id = jsonObj.getInt("id");
		int userId = jsonObj.getInt("userId");
		String title = jsonObj.getString("title");
		
		System.out.println("id, userId, title: " + id + " " + userId + " " + title);
		
//		System.out.println(res.asString());
		
		System.out.println("Thank you");
	}
}
