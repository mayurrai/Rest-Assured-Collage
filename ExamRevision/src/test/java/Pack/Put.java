package Pack;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Put {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response= given().contentType(ContentType.JSON)
				.body("    {\r\n"
						+ "      \"id\": \"5\",\r\n"
						+ "      \"Roll\": \"A27\",\r\n"
						+ "      \"Section\": \"K21FZ\",\r\n"
						+ "      \"Name\": \"Suryansh\"\r\n"
						+ "    }")
				.put("http://localhost:3000/mayur/5");
		response.prettyPrint();
	}

}
