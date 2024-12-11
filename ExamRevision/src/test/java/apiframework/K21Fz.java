package apiframework;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class K21Fz {
	public static void main(String[] args) {
		Response response = given().contentType(ContentType.JSON).get("http://localhost:3000/mayur");
        System.out.println(response.prettyPrint());
	}

}
