package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {

	Driver driver;
	Connection connect;
	public void connectDB() throws SQLException
	{
		driver=new Driver();
		DriverManager.registerDriver(driver);
		connect=DriverManager.getConnection(IPathConstant.dbURL,IPathConstant.dbUserName,IPathConstant.dbPassword);
	
	}
	
	public void closeDB() throws SQLException
	{
		
		connect.close();
	}
	
	
	public String readDataFromDBAndValidate(String query,int columnIndex,String expData) throws SQLException
	{
		ResultSet result = connect.createStatement().executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
            {
            	flag=true;
            	break;
            }}
          
		if(flag)
		{
			System.out.println("Verified");
		    return expData;
		}
		else
		{
			System.out.println("Data not verified");
			return "";
	     }
		
		}
	
	
	public int insertIntoDB(String query) throws SQLException
	{
		int status=connect.createStatement().executeUpdate(query);
	    return status;
	}
	

	}
