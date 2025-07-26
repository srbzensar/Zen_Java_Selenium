package misc.reqresspecification;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class A_ReqResSpecification {

    static RequestSpecification requestSpec;
    static ResponseSpecification responseSpec;

    public static void setup() 
    {
        // Define Request Specification
        requestSpec = new RequestSpecBuilder()
	    			.setBaseUri("http://jsonplaceholder.typicode.com")
	                .setContentType(ContentType.JSON)
	                .build();
        
        // Define Response Specification
        responseSpec = new ResponseSpecBuilder()
	                .expectStatusCode(200)
	                .expectContentType(ContentType.JSON)
	                .build();
    }
    
    public static void main(String[] args) {
        setup();

        System.out.println("API Testing started");
        
        given()
            .spec(requestSpec)
        .when()
            .get("/posts/1")
        .then().log().all()
            .spec(responseSpec)
            .body("id", equalTo(1));
        
        System.out.println("Thank you");
    }
		

}
