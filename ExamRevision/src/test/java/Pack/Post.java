package Pack;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String,String> map= new HashMap<String,String>();
//		map.put("id","5");
//		map.put("Name","Suryansh");
//		map.put("Section","K21FZ");
//		map.put("Roll","A27");
		Response response= given().contentType(ContentType.JSON)
				.body("  {\r\n"
						+ "        \"id\": \"3\",\r\n"
						+ "        \"Name\": \"XD\",\r\n"
						+ "        \"Section\": \"K21FZ\",\r\n"
						+ "        \"ROll\": \"A27\"\r\n"
						+ "    },"
						+ "")
//				.body(map)
				.post("http://localhost:3000/mayur");
		response.prettyPrint();
	}

}
