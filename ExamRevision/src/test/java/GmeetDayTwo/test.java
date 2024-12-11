package GmeetDayTwo;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class test {
	
	@Test
	public void test() {
		pojo obj= new pojo("2","Ayush","Saini","India"
				,"Punjab","digh34","Clg",144401);
		obj.setMobile(23424,423423,4234);
		Response response= given().contentType(ContentType.JSON)
				.body(obj).get("http://localhost:3000/mayur");
		response.prettyPrint();
		int actual=response.getStatusCode();
		Assert.assertEquals(actual, 200);
	}
}
