package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;

public class RestTesting {
	@Test
	public void api()
	{
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().toString());
		int srt = response.getStatusCode();
		Assert.assertEquals(srt, 201);
		
	}
	@Test
	public void demo2()
	{
		baseURI = "https://reqres.in";
		given().
		get("/api/users?page=2")
		.then()
		.statusCode(200);
	}

}
