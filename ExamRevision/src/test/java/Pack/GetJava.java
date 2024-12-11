package Pack;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response = given().auth().basic("admin","admin").contentType(ContentType.JSON).get("http://localhost:3000/mayur");
		response.prettyPrint();
	}

}
