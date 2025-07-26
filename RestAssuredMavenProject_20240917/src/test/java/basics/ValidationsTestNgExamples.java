package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ValidationsTestNgExamples {
  
	
  @Test
  public void successStatus() {
	when().
		get("/posts/1").
	then().log().all().assertThat().statusCode(200);
  }
  
  @Test
  public void failureStatusOne() {
	when().
		get("/posts/1").
	then().log().all().assertThat().statusCode(201);
  }
  
  @Test
  public void failureStatusTwo() {
	when().
		get("/posts/102").
	then().log().all().assertThat().statusCode(200);
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	  System.out.println("API Testing started");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Thanks");
  }

}
