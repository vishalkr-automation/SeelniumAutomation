package readDataFromPropertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertiesFile {
	
	@Test
	public void f() throws IOException{
		File file = new File(System.getProperty("user.dir")+".\\config\\datafile.properties");
		  
		FileInputStream fileInput = new FileInputStream(file);
		
		Properties prop = new Properties();
		
		prop.load(fileInput);
		
		String str=prop.getProperty("URL");
		
		System.err.println(str);
		
		
	}

}
