package x.restfulbooker;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import java.io.File;

//-----------------------------------------------
//Authorization: send token in header

// Register: Bearer Token Auth
// POST Method: Generate Token and capture in a variable
//URL: https://restful-booker.herokuapp.com/auth   
//Header: Content-Type, application/json
//body: {"username": "admin","password": "password123"}

// PUT Method: Modify particular booking by passing token in the header 
//URL: https://restful-booker.herokuapp.com/booking/(bookingId)
//Header: Content-Type, application/json
//Header: Accept, application/json
//Header: Cookie, token=(varToken)
//validate: status code 200  

public class C_ModifyBookingPut {

	public static void main(String[] args) 
	{

		//	Register: generate token and capture in varToken
		
		String reqBody = "{\"username\": \"admin\",\"password\": \"password123\"}";
		
		String varToken = given().
			header("Content-Type", "application/json").
			body(reqBody).
		when().
			post("https://restful-booker.herokuapp.com/auth").
		then().log().all().
			assertThat().statusCode(200).
		extract().response().jsonPath().getString("token"); 
		
		System.out.println(varToken);
		
		System.out.println("-------------------------------------------------");	
		
		//	Modify booking by passing varToken in header Cookie
		
		String filePath = "files/bookingData.json";
		File jsonFile = new File(filePath);
		
		given().
			header("Content-Type", "application/json").
			header("Accept", "application/json").
			header("Cookie", "token="+varToken).
			body(jsonFile).
		when().log().all().
			put("https://restful-booker.herokuapp.com/booking/1").
		then().log().all().
			assertThat().statusCode(200).
			body("depositpaid", is(true)).
			body("bookingdates.checkout", containsString("2019")).
			body("additionalneeds", is("Breakfast"));		
	}
}
