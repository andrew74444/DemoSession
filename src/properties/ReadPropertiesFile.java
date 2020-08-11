package properties;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws Exception {
		

		
		
		
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\properties\\config.properties");
		prop.load(fis);
		
		System.out.println(prop.get("website"));
		System.out.println(prop.get("userName"));
		System.out.println(prop.get("password"));
		
		System.out.println(System.getProperty("user.dir"));
			
		
	}

}
