package misc.solutions;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class A_CertificateError {

	public static void main(String[] args) {

//		To ignore certificate related errors for https 
		RestAssured.useRelaxedHTTPSValidation();

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		System.out.println("API Testing started");
		
		given().
		when().
			get("/posts/1").
		then().log().all().
			assertThat().statusCode(200);

		
		System.out.println("Thank you");
	}

}
