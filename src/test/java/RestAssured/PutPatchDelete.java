package RestAssured;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class PutPatchDelete {
		

	public void put()
	{
		JSONObject json = new JSONObject();
		json.put("name", "morpheus");
		json.put("job", "leader");
		
		baseURI = "https://reqres.in/api";
		
		given().
		
		    header("ContentType","application/json").
		    body(json.toJSONString()).
		when().
		    put("/users/2").
		then().
		    statusCode(200).log().all();
	}
	
	
	public void patch()
	{
		JSONObject json = new JSONObject();
		json.put("name", "morpheus");
		json.put("job", "leader");
		
		baseURI = "https://reqres.in/api";
		
		given().
		
		    header("ContentType","application/json").
		    body(json.toJSONString()).
		when().
		    patch("/users/2").
		then().
		    statusCode(200).log().all();
	}
	
	@Test
	public void delete()
	{
		
		baseURI = "https://reqres.in/api";
		
		
		when().
		    delete("/users/2").
		then().
		    statusCode(204).log().all();
	}
	

}
