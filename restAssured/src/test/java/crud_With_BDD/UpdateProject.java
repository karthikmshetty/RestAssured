package crud_With_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import genericUtility.JavaUtility;
import io.restassured.http.ContentType;

public class UpdateProject {

	
	@Test
	public void updateProj()
	{
		JavaUtility ju = new JavaUtility();
		
		JSONObject jObj = new JSONObject();
		
		jObj.put("createdBy","Sachin_Sachi");
		jObj.put("projectName","Magento"+ju.random());
        jObj.put("status","Completed");
        jObj.put("teamSize",15);
        
        
        given().body(jObj).contentType(ContentType.JSON)
        .when().put("http://rmgtestingserver:8084/projects/TY_PROJ_7837")
        .then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
        
        
        
	}
}
