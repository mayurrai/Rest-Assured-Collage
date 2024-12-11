package Prac;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.ArrayList;

import org.json.JSONObject;

public class JsonObj {
	
	public static void main(String[] args) {
	JSONObject jobj = new JSONObject();
	jobj.put("id", "6");
	JSONObject name= new JSONObject();
	name.put("firstName", "John");
	name.put("lastName", "Doe");
	jobj.put("name", name);
	JSONObject address= new JSONObject();
	address.put("House No",301);
	
	}

}
