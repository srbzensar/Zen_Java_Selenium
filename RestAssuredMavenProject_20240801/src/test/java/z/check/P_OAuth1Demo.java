package z.check;

import static io.restassured.RestAssured.*;

//import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;

//----------------------------------------------- Not working 
//Authorization: postman-echo
//postman:password			encoded		cG9zdG1hbjpwYXNzd29yZA==

//OAuth
//GET Method
//URL: https://postman-echo.com/oauth1
//Consumer Key: RKCGzna7bv9YD57c
//Consumer Secret: D+EdQ-gs$-%@2Nu7
//validate: status code 200 and response body {"authenticated": true}

public class P_OAuth1Demo 
{

	public static void main(String[] args) {

		
		String varConsumerKey = "RKCGzna7bv9YD57c";
		String varConsumerSecret = "D+EdQ-gs$-%@2Nu7";
		

		Response response = 
				given().auth().oauth(varConsumerKey, varConsumerSecret, "","").
				when().get("https://postman-echo.com/oauth1");

		System.out.println("Status Code: " + response.getStatusCode());
		System.out.println("Response Body:\n" + response.asPrettyString());



//		String varConsumerKey = "RKCGzna7bv9YD57c";
//		String varConsumerSecret = "D+EdQ-gs$-%@2Nu7";
		
//		given().
//			auth().
//			oauth(varConsumerKey, varConsumerSecret,"","").
//		when().log().all().
//			get("https://postman-echo.com/oauth1").
//		then().log().all().
//			assertThat().statusCode(200).and().
//			body("status", is("pass"));

		
	}
	

}
