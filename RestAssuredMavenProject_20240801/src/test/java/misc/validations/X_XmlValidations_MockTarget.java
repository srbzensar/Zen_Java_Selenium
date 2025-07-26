package misc.validations;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class X_XmlValidations_MockTarget {

   public static void main(String[] args) {
       // Set base URI
       RestAssured.baseURI = "http://mocktarget.apigee.net";

      
       Response response = RestAssured
           .given()
               .header("Accept", "application/xml")
           .when()
               .get("/xml")
           .then()
               .statusCode(200)
               .extract().response();

    
       String xml = response.asString();
       System.out.println("XML Response:\n" + xml);

       
       XmlPath xmlPath = new XmlPath(xml);

       
       String firstName = xmlPath.getString("root.firstName");
       String lastName = xmlPath.getString("root.lastName");

       
       if ("John".equals(firstName) && "Doe".equals(lastName)) {
           System.out.println("XML response validated successfully.");
       } else {
           System.out.println("XML validation failed.");
           System.out.println("Expected: John Doe");
           System.out.println("Actual: " + firstName + " " + lastName);
       }
   }
}
