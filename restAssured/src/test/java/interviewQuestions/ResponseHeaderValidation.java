package interviewQuestions;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import junit.framework.Assert;

public class ResponseHeaderValidation {

	@Test
	public void validate()
	{
     
	 baseURI="http://rmgtestingserver";
     port=8084;
     
     String expected_statusLine="HTTP/1.1 200 ";
     String expected_Vary="Access-Control-Request-Headers";
     String expected_contentType="application/json";
     String expected_pragma="no-cache";
     String expected_connection="keep-alive";
     
     Response resp = when().get("/projects/TY_PROJ_6379");
    
     
     Headers headers = resp.getHeaders();
     System.out.println("-----"+headers+"-----");
     
     String statusLine = resp.statusLine();
     System.out.println("-----"+statusLine+"-----");
     Assert.assertEquals(statusLine,expected_statusLine);
     
     String Act_Vary = resp.getHeader("Vary");
     Assert.assertEquals(expected_Vary,Act_Vary);
     
     
     String act_content = resp.contentType();
     Assert.assertEquals(act_content, expected_contentType);
     
     String act_Pragma = resp.getHeader("Pragma");
     Assert.assertEquals(act_Pragma, expected_pragma);
     
     String act_Connection=resp.getHeader("Connection");
     Assert.assertEquals(act_Connection, expected_connection);
     
     
	}
	
}
