package requestChaining;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class ReqChain_Recres2 {

	@Test
	public void getAllUserTakeOneUser()
	{
		baseURI="https://reqres.in";
		
		//get all the user
      Response resp = when().get("/api/users?page=2");
      resp.then().log().all();
      
      int id=resp.jsonPath().get("data[1].id");
      
      //get single user
      when().get("/api/users?page=2"+id)
      .then().log().all();
        
        
      
		
	}
	
}
