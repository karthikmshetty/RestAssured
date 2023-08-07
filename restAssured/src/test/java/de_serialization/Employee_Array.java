package de_serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClass_Package.Serialization_Pojo_employee;
import pojoClass_Package.Serlz_Pojo_EmployeeWithArray;

public class Employee_Array {
	
	@Test
	public void emp() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper omp = new ObjectMapper();
		Serlz_Pojo_EmployeeWithArray obj = omp.readValue(new File("./empArray.json"),Serlz_Pojo_EmployeeWithArray.class);
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		int []a=obj.getPhNo();
		System.out.println(a[0]+"  "+a[1]);

}}
