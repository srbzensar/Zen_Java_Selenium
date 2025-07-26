package jsonfile;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.apache.http.HttpStatus;

public class CreateNewPost {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("Testing Started");
		
		String filePath = "files/newPostData.json";
		File jsonFile = new File(filePath);
		
		given().
			header("Content-Type","application/json; charset=utf-8").
			body(jsonFile).
		when().log().all().
			post("/posts").
		then().log().all().
			assertThat().statusCode(HttpStatus.SC_CREATED); // 201
		
		
		System.out.println("Thanks");
	}

}
