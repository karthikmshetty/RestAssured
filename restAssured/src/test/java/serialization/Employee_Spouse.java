package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClass_Package.Serialization_Pojo_employee;
import pojoClass_Package.Serlz_Pojo_Nested_Object;
import pojoClass_Package.Serlz_Pojo_Obj_Spouse;

public class Employee_Spouse {

	@Test

public void emp() throws JsonGenerationException, JsonMappingException, IOException
{
	ObjectMapper omp = new ObjectMapper();
	Serlz_Pojo_Obj_Spouse sp = new Serlz_Pojo_Obj_Spouse("ABCD", 30);
	
	int[]phNo= {1234,4567};
	
	Serlz_Pojo_Nested_Object object = new Serlz_Pojo_Nested_Object("Sachin",24,phNo,sp);
		omp.writeValue(new File("./empSpouse1.json"),object);
}

}
