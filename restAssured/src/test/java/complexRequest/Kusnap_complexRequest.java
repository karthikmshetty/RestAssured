package complexRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import kusnap_complexRequest.Description;
import kusnap_complexRequest.Productpojo;

public class Kusnap_complexRequest {
@Test
	public void createprod() throws JsonGenerationException, JsonMappingException, IOException
	{
	
	String []color= {"red","black"};
	Description desc1 = new Description("RAM:8GB,ROM:64GB,48mp Cam", color, 21000);
	Description desc2 = new Description("RAM:16GB,ROM:128GB,48mp Cam", color, 25000);
	ArrayList<Description> list=new ArrayList();
	list.add(desc1);
	list.add(desc2);
	
	Productpojo pojoObj = new Productpojo("Electronics", "phones", "Samsung s 21", "InStock","Samsung", list);
	
	ObjectMapper omp = new ObjectMapper();
	String obj = omp.writerWithDefaultPrettyPrinter().writeValueAsString(pojoObj);
	
	System.out.println(obj);
		
	}
}
