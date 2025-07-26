package x.restfulbooker;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import java.io.File;

//-----------------------------------------------

// POST Method: Create new booking
// URL: https://restful-booker.herokuapp.com/booking
// json data in file booking.json
// Header: Content-Type, application/json


public class B_CreateNewBooking {

	public static void main(String[] args) {

		
//		Create new booking, validate response, extract and print bookingid 
		
		String filePath = "files/bookingData.json";
		File jsonFile = new File(filePath);
		
		int varBookingId = given().
			header("Content-Type", "application/json").
			body(jsonFile).
		when().
			post("https://restful-booker.herokuapp.com/booking").
		then().log().all().
			assertThat().statusCode(200).
			body("bookingid", notNullValue()).
			body("booking.depositpaid", is(true)).
			body("booking.bookingdates.checkout", containsString("2019")).
			body("booking.additionalneeds", is("Breakfast")).
		extract().response().jsonPath().getInt("bookingid");
		
		System.out.println("Booking Id: " + varBookingId);
	}
	

}
