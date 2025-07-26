package explanation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.apache.http.HttpStatus;

public class CorrelationExample {

	public static void main(String[] args) {
		
//		RestAssured.baseURI = "http://localhost:3000";
		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		
		System.out.println("Testing Started");
		
//		given()	when()	then()	extract()
		
//		Response res = when().get("/posts/100");
		
		
		Response res =  when().
							get("/posts/100").
						then().log().all().
							statusCode(200).
							body("id", is(100)).
							body("userId", is(10)).
						extract().response();

		JsonPath jsonObj = res.jsonPath();
		int id = jsonObj.getInt("id");
		int userId = jsonObj.getInt("userId");
		String title = jsonObj.getString("title");
		
		System.out.println("Id userId and title extracted: " + id + " " + userId + " " + title);
		
//		-----------------------------------
		
//		JsonPath obj = when().
//			get("/posts/100").
//		then().log().all().
//			statusCode(200).
//			body("id", is(100)).
//			body("userId", is(10)).
//		extract().response().jsonPath();
//		int varUserId = obj.getInt("userId"); 
		
//		 int varUserId = when().
//		 get("/posts/100").
//		 then().log().all().
//		 statusCode(200).
//		 body("id", is(100)).
//		 body("userId", is(10)).
//		 extract().response().jsonPath().getInt("userId");
//		 System.out.println("userId: " + varUserId);
		
		
//		given().param("userId", userId).
//		when().get("/posts").
//		then().log().all().statusCode(200).body("[1].userId", is(userId));
		
		
//		List<JsonPath> obj = given().param("userId", userId).
//		when().get("/posts").
//		then().statusCode(200).
//		extract().response().jsonPath().getList(".");
//		
//		System.out.println(obj);
		
		List<Integer> ids = given().param("userId", userId).
				when().get("/posts").
				then().statusCode(200).body("[1].userId", is(userId)).
				extract().response().jsonPath().getList("id");
				
		System.out.println(ids);
		
		
		
		
		System.out.println("Thanks");
	}

}
