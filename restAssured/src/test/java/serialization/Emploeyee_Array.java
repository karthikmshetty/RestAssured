package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClass_Package.Serlz_Pojo_EmployeeWithArray;

public class Emploeyee_Array {
	@Test
	public void emp() throws JsonGenerationException, JsonMappingException, IOException
	{
		int []phNo= {1234,5469};
		Serlz_Pojo_EmployeeWithArray obj = new Serlz_Pojo_EmployeeWithArray("Karthi",25000,phNo);
		
		ObjectMapper omp = new ObjectMapper();
		
		omp.writeValue(new File("./empArray.json"), obj);
		
		
		
		
	}

}
