package RestAssured;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class Post2 {

	
	public void post() {
		JSONObject json = new JSONObject();
		json.put("name", "morpheus");
		json.put("job", "leader");

		baseURI = "https://reqres.in/api";

		given().

				header("ContentType", "application/json").body(json.toJSONString()).
		when().post("/users").
		then()
			  .statusCode(201).log().all();
	}
	
	public void demo()
	{
		JSONObject json = new JSONObject();
		json.put("name", "morpheus");
		json.put("job", "leader");
		
		baseURI = "https://reqres.in/api";
		given().
		  header("ContentType", "application/json").
		  body(json.toJSONString()).
		when().
		    post("/users").
		then(). 
		   statusCode(201).log().all();
	}
	
	@Test
	public void testing()
	
	{
		
		JSONObject json = new JSONObject();
		json.put("name", "morpheus");
		json.put("job", "leader");
		
		baseURI = "https://reqres.in/api";
		
		given().
		    header("ContentType","application/json").
		    body(json.toJSONString()).
		when().
		    post("/users").
		then().
		    statusCode(201).log().all();
		
	}

}
