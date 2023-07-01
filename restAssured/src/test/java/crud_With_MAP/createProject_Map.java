package crud_With_MAP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class createProject_Map {
	
	//@Test
	public HashMap<String,Object> createProj() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		
		JavaUtility ju = new JavaUtility();
		
		//create HashMap object
		HashMap<String,Object> mapObj = new HashMap<String,Object>();
		
		//Fetch data from excel
		Workbook wb = WorkbookFactory.create(new FileInputStream("./src/test/resources/RestAssured_Map.xlsx"));
		
		Sheet sheet = wb.getSheet("Sheet1");
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		
		DataFormatter dataformmatter = new DataFormatter();
		
		for(int j=0;j<lastCellNum;j++)
		{
			String key=sheet.getRow(0).getCell(j).toString();
				 
			//To append random number only to projectName
			
			if(key.equals("projectName"))
			{
				String value=sheet.getRow(1).getCell(j).toString();
				mapObj.put(key, value+ju.random());
			}
			else
			
			{
				//hre team size is integer so used dataformaatter
				
				 Cell cell = sheet.getRow(1).getCell(j);
				String value = dataformmatter.formatCellValue(cell);
				mapObj.put(key, value);
}
		}
			
		
		return mapObj;

		
//			given().body(mapObj).contentType(ContentType.JSON)
//			.when().post("http://rmgtestingserver:8084/addProject")
//			.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
//			
			
		
		
		
		
	}

}