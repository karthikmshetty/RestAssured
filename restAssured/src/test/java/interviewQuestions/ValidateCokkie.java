package interviewQuestions;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class ValidateCokkie {
	@Test
	public void cokkie()
	{
		when().get("https://google.com/")
		
		.then().cookie("1P_JAR").log().all();
		
	}

}
