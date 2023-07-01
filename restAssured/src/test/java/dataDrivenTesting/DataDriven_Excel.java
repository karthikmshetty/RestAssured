package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClass_Package.PojoClass;

public class DataDriven_Excel {
	
	
	@Test(dataProvider = "data")
	public void getData(String createdBy,String projectName,String status,String teamSize)
	{
		JavaUtility ju = new JavaUtility();
		 float team=Float.parseFloat(teamSize);
		 PojoClass pojoObj = new PojoClass(createdBy, projectName+ju.random(), status, team);
		 
		 baseURI="http://rmgtestingserver";
			port=8084;
			
			given().body(pojoObj).contentType(ContentType.JSON)
			.when().post("/addProject")
			.then().log().all();
		
	}
	
	
	@DataProvider
	
	
	public Object[][] data() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
	Workbook wb = WorkbookFactory.create(new FileInputStream("./src/test/resources/RestAssured_DDT.xlsx"));
	Sheet sheet = wb.getSheet("Sheet1");
	int lastRow = sheet.getLastRowNum();
	int lastCell=sheet.getRow(0).getLastCellNum();
	
	Object [][]obj =new Object[lastRow][lastCell];
	
	for(int i=1;i<=lastRow;i++)
	{
		for(int j=0;j<lastCell;j++)
		{
			
			obj[i-1][j]=sheet.getRow(i).getCell(j).toString();
		}
	}
	return obj;
		
	}

}
