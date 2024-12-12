package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Get2 {
	

	
	public void demo()
	{
		baseURI = "https://reqres.in";
		
		given()
		  .get("/api/users?page=2").
		 then()
		 .statusCode(200).
		 body("data[4].first_name", equalTo("George")).
		 body("data.first_name", hasItems("Michael","Tobias")).log().all();
	}
	@Test
	public void test()
	{
		baseURI = "https://reqres.in/";
		
		given().
		    get("api/users?page=2").
		then().
		   statusCode(200).body("data[2].first_name", equalTo("Tobias")).
		   body("data.first_name", hasItems("Michael","Tobias")).log().all();
	}

}
