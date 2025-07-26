package misc.extractresponse;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.apache.http.HttpStatus;

public class ExtractCombinations {

	public static void main(String[] args) {
		
//		RestAssured.baseURI = "http://localhost:3000";
		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
		
		System.out.println("Testing Started");
		
//		given()	when()	then()	extract()
		
//		Response res = when().get("/posts/100");		// when() returns Response object
		
		
		Response res =  when().
							get("/posts/100").
						then().log().all().			// then returns ValidableResponse
							statusCode(200).		// each validation method returns ValidableResponse itself
							body("id", is(100)).
							body("userId", is(10)).
						extract().response();		// extract() returns ExtractableResponse
													// response() returns Response object

//		Here we have taken the response object and then parsed it to json object from which extracted values
		JsonPath jsonObj = res.jsonPath();
		int id = jsonObj.getInt("id");
		int userId = jsonObj.getInt("userId");
		String title = jsonObj.getString("title");
		
		System.out.println("Id userId and title extracted: " + id + " " + userId + " " + title);
		
//		-----------------------------------
		
//		Here we have taken the json object from which extracted values
//		JsonPath obj = when().
//			get("/posts/100").
//		then().log().all().
//			statusCode(200).
//			body("id", is(100)).
//			body("userId", is(10)).
//		extract().response().jsonPath();
//		int varUserId = obj.getInt("userId"); 
		
//		Here we have directly extracted the required value. It would be useful when we are interested in single value
//		 int varUserId = when().
//		 get("/posts/100").
//		 then().log().all().
//		 statusCode(200).
//		 body("id", is(100)).
//		 body("userId", is(10)).
//		 extract().response().jsonPath().getInt("userId");
//		 System.out.println("userId: " + varUserId);
		
//		-------------------------------------------------------------------
		
//		given().param("userId", userId).
//		when().get("/posts").
//		then().log().all().statusCode(200).body("[1].userId", is(userId));
		
//		extract the complete array of json objects and store it in a List
//		List<JsonPath> obj = given().param("userId", userId).
//		when().get("/posts").
//		then().statusCode(200).body("[1].userId", is(userId)).
//		extract().response().jsonPath().getList(".");
//		
//		System.out.println(obj);

//		extract the array of ids and store it in a List
		List<Integer> ids = given().param("userId", userId).
				when().get("/posts").
				then().statusCode(200).body("[1].userId", is(userId)).
				extract().response().jsonPath().getList("id");
				
		System.out.println(ids);
		
		
		
		
		System.out.println("Thanks");
	}

}
