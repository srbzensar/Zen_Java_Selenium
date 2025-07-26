package f.schemavalidation;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class A_PostSchemaValidation {

	public static void main(String[] args) {

			System.out.println("Performing Schema Vaidation");
            
			when().get("http://jsonplaceholder.typicode.com/posts/1")
            .then().assertThat()
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("post-schema.json"));

            System.out.println("Successful. Thanks");
	}

}
