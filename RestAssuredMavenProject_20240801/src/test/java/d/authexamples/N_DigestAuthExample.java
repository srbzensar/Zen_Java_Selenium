package d.authexamples;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

//-----------------------------------------------
//Authorization: postman-echo
//Encoding	for usability (not for confidentiality)
//postman:password			encoded		cG9zdG1hbjpwYXNzd29yZA==

//basic Auth
//GET Method
//URL: https://postman-echo.com/basic-auth
//Header: Authorization, Basic cG9zdG1hbjpwYXNzd29yZA==
//validate: status code 200 and response body {"authenticated": true}

public class N_DigestAuthExample 
{

	public static void main(String[] args) {

		given().auth().digest("postman", "password").
		when().log().all().
			get("https://postman-echo.com/digest-auth").
		then().log().all().
			assertThat().statusCode(200).and().
			body("authenticated", is(true));
		
	}
	

}
