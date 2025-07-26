package basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ExtractResponse {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
//		given()	when()	then()	extract()
		
		System.out.println("API Testing started");
		
		Response res = when().get("/posts/100").then().log().all().statusCode(200).extract().response();
		
		JsonPath jsonObj = res.jsonPath();
		int id = jsonObj.getInt("id");
		
		System.out.println("id is " + id);
		
		System.out.println("Thanks");
		
	}

}
