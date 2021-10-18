package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class getProperty {

	public Properties getPropertyn() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\resources\\java\\config\\config.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		return pro;
	}
	
}
