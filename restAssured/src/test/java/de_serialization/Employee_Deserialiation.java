package de_serialization;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClass_Package.DummyPojo;
import pojoClass_Package.Serialization_Pojo_employee;

public class Employee_Deserialiation {
@Test
	public void emp() throws JsonParseException, JsonMappingException, IOException
	{
	
	
	   //No need of pojoclass only any 
		ObjectMapper omp = new ObjectMapper();
		DummyPojo obj = omp.readValue(new File("./emp.json"),DummyPojo.class);
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());
		System.out.println(obj.getAge());
	}
}
