package complexRequest;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_Class_Complex.Adress;
import pojo_Class_Complex.Nested_Pojo;
import pojo_Class_Complex.Spouse;

public class Complex_Request {

	@Test
	public void complexRequest() throws JsonGenerationException, JsonMappingException, IOException
	{
		//inner object "adress"

		Adress objAdress = new Adress("13-A","No Street","Mangalore");
		Spouse objSpouse = new Spouse("ABCD",21);
		Spouse objSpouse2 = new Spouse("XYZ",24);
		
		//To add objetcs inside the array
		ArrayList<Spouse> allSpouse = new ArrayList<Spouse>();
		allSpouse.add(objSpouse);
		allSpouse.add(objSpouse2);
		
		String []name= {"Karthik","Likith"};
		String []email= {"abcd@gmail.com","xyz@gmail.com"};
		
		Nested_Pojo pojoObj = new Nested_Pojo(name, email, 213, 96325582,35000, objAdress, allSpouse);
		
		
		ObjectMapper omp = new ObjectMapper();
		String obj = omp.writerWithDefaultPrettyPrinter().writeValueAsString(pojoObj);
		
		System.out.println(obj);
		
		
		

		
		
	}
}
