package misc.soap;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class S_SOAPExampleAddCalc {

	public static void main(String[] args) {
		
		 	String requestBody = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n"
		 			+ "<soap12:Envelope xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\r\n"
		 			+ "  <soap12:Body>\r\n"
		 			+ "    <Add xmlns=\"http://tempuri.org/\">\r\n"
		 			+ "      <a>10</a>\r\n"
		 			+ "      <b>4</b>\r\n"
		 			+ "    </Add>\r\n"
		 			+ "  </soap12:Body>\r\n"
		 			+ "</soap12:Envelope>";
		
		 	 Response response = 
		 			given()
			        	.header("Content-Type", "text/xml; charset=utf-8")
			        	.body(requestBody).
			        when().log().all().
			        	post("https://ecs.syr.edu/faculty/fawcett/Handouts/cse775/code/calcWebService/Calc.asmx").
			        then().log().all().extract().response();
				 	
//		 	 TestNg assertions
		 	 assertEquals(response.statusCode(), 200);
		 	 assertTrue(response.getBody().asString().contains("<AddResult>14</AddResult>"));

	}

}
