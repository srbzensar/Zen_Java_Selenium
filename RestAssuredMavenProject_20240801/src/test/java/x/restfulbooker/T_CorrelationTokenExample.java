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

// POST Method: Create new booking
// URL: https://restful-booker.herokuapp.com/booking
// json data in file booking.json
// Header: Content-Type, application/json


//Delete Method: Delete booking by passing token cookie in header 
//URL: https://restful-booker.herokuapp.com/booking/(bookingId)
//Header: Content-Type, application/json
//Header: Cookie, token=(varToken)
//validate: status code 201 (due to a defect, actually it should have been 200) 

public class T_CorrelationTokenExample {

	public static void main(String[] args) {

//		Register: generate token and capture in varToken
		
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
		
//		-------------------------------------------------
		
//		Create new booking, capture bookingid in varBookingId
		
		String filePath = "files/bookingData.json";
		File jsonFile = new File(filePath);
		
		int varBookingId = given().
			header("Content-Type", "application/json").
			body(jsonFile).
		when().
			post("https://restful-booker.herokuapp.com/booking").
		then().log().all().
			assertThat().statusCode(200).
		extract().response().jsonPath().getInt("bookingid");
		
//		------------------------------------------

//		Delete the booking id varBookingId by passing varToken in header Cookie
		
		given().
			header("Content-Type", "application/json").
			header("Cookie", "token="+varToken).
		when().log().all().
			delete("https://restful-booker.herokuapp.com/booking/"+varBookingId).
		then().log().all().
			assertThat().statusCode(201);	// 201 due to defect, it should be 200	
		
	}
	

}
