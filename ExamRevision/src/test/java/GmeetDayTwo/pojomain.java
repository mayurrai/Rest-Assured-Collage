package GmeetDayTwo;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class pojomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pojo obj= new pojo("2","Ayush","Saini","India"
				,"Punjab","digh34","Clg",144401);
		obj.setMobile(23424,423423,4234);
		Response response= given().contentType(ContentType.JSON)
				.body(obj).post("http://localhost:3000/mayur");
		response.prettyPrint();
	}

}
