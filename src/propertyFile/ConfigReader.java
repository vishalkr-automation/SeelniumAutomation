package propertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	Properties pro;
	public ConfigReader(){
		try {
			File f=new File("F:\\Worspacedemo\\MukeshOtwani\\Configuration\\Config.property");
			FileInputStream fi = new FileInputStream(f);
		    pro=new Properties();
			pro.load(fi);
		   } 
		
		 catch (Exception e) {

			System.out.println("Exception is:" +e.getMessage() );
		}
	}
	
	public String getChromePath(){
		String str=pro.getProperty("ChromeDriver");
		return str; 
	}
	
	public String getAppUrl(){
		return pro.getProperty("URL");
	}

}
