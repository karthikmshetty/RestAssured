package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileUtility {
	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream file = new FileInputStream("./src/test/resources/Propertyfile_Yantra.properties");
		Properties properties = new Properties();
		properties.load(file);
		String value=properties.getProperty(key);
		return value;

}}
