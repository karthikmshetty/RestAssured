package requestChaining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import pojoClass_Package.PojoClass;

public class ReqChain_RMG {
@Test
	public void reqChain1()
	{
		JavaUtility ju = new JavaUtility();
		PojoClass pojoObj = new PojoClass("KartikM","smartsale"+ju.random(),"on Going",8);
		
		
     baseURI="http://rmgtestingserver";
     port=8084;
     
     //we need jsonpath for get the created project, so stored in response, we know that 
     //http methods returs response interface
    Response resp = given().body(pojoObj).contentType(ContentType.JSON )
                   .when().post("/addProject");
    
    //now in response only one project is there so directly given project Id
    String projId=resp.jsonPath().get("projectId");
    resp.then().assertThat().statusCode(201).log().all();
    System.out.println("Created successfuly");
    
    
    //create get request pass previous created projID 
    given().pathParam("var_projId", projId)
    .when().get("/projects/{var_projId}")
    .then().log().all();
    
   
    //create update request
    
	PojoClass pojoObj2 = new PojoClass("KartikMShetty","smartsales","on Going",8);
     given().pathParam("var_projId",projId).body(pojoObj2).contentType(ContentType.JSON)
	 .when().put("/projects/{var_projId}")
	.then().assertThat().statusCode(200).log().all();
	System.out.println("updated successfuly");
	
	//create Delete request
	given().pathParam("var_projId", projId)
	.when().delete("/projects/{var_projId}")
	.then().assertThat().statusCode(204).log().all();
	System.out.println("deleted successfuly");
	
	
	    
		
	}
}
