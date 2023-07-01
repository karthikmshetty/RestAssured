package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClass_Package.Serialization_Pojo_employee;

public class EmployeeSerialization {
	
	@Test
	public void empSerialization() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		
	    Serialization_Pojo_employee object = new Serialization_Pojo_employee("Karthik",25000,24);
	
	    ObjectMapper omp = new ObjectMapper();
        omp.writeValue(new File("./emp.json"),object);
		
		
	}

}
