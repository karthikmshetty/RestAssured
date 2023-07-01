package de_serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClass_Package.Serlz_Pojo_Nested_Object;
import pojoClass_Package.Serlz_Pojo_Obj_Spouse;

public class Employee_spouse_Desrlz {
	@Test
	public void emp() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper omp = new ObjectMapper();
		Serlz_Pojo_Nested_Object object = omp.readValue(new File("./empSpouse1.json"),Serlz_Pojo_Nested_Object.class);
		
		System.out.println(object.getName());
		System.out.println(object.getAge());
		
		int[] a=object.getPhNo();
		System.out.println(a[0]+" "+a[1]);

		
		Serlz_Pojo_Obj_Spouse sp = object.getSpouse();
		
		System.out.println(sp.getName());
		System.out.println(sp.getAge());

	}

}
