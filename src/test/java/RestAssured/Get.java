package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Get {
	
	@Test
	public void rest()
	{
		baseURI = "https://reqres.in/api";
		
		given()
		   .get("/users?page=2").
		then().
		    statusCode(200).
		    body("data[2].first_name", equalTo("Tobias")).
		    body("data.first_name",hasItem("Tobias")).
		    body("data.first_name", hasItems("Michael","Tobias"))
		    .log().all();
	}
	

}
