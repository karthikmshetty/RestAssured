package interviewQuestions;

import static io.restassured.RestAssured.*;

public class SendCookies
{
	public void cokie()
	{
		// in key value pair we can send cookies , exg we can send usnm pswrd also in cokkies.
      given().cookie("1P_JAR","2023-06-29-07")	
      .when().get("http://www.google.com/")
      .then().log().all();
	}
	
	

}
