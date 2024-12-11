package apiframework;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Demo {
	
	@Test
	public void test() {
		Response response = given().contentType(ContentType.JSON).queryParam("id","1")
				.get("http://localhost:3000/mayur");
		response.prettyPrint();
		System.out.println(response.jsonPath().getString("Name"));
		Assert.assertEquals(response.getStatusCode(),200);
	}
	
	@Test
	public void test1() {
		Response response = given().contentType(ContentType.JSON).queryParam("id","1").get("http://localhost:3000/mayur");
	    Object actual =	response.jsonPath().getString("Name").toString();
        Assert.assertEquals(actual,"[Mayur]");
	}
}
