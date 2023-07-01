package interviewQuestions;

import javax.annotation.meta.When;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Map;

public class ValidateAllcookies {
	
	
	public void cookies()
	{
      
		 Response resp=when().get("https://www.google.com/");
		 
		  Map<String, String> allCookie = resp.getCookies();
		  
		  for(String cookkeyKey:allCookie.keySet())
		  {
			  String cookieValue=resp.getCookie(cookkeyKey);
			  System.out.println(cookkeyKey+" "+cookieValue);
		  }
	}

}
