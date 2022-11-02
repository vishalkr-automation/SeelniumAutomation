package propertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PropertyFileClass {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  File f=new File("F:\\Worspacedemo\\SeleniumPractice4\\Configuration\\Config.property");
	  FileInputStream fi=new FileInputStream(f);
	  Properties prop = new Properties();
	  prop.load(fi);
	  
	  String chromepath=prop.getProperty("ChromeDriver");
	  System.out.println(chromepath);
	  String url=prop.getProperty("URL");
	  System.out.println(url);
	  
	  System.setProperty("webdriver.chrome.driver", chromepath);
	  driver=new ChromeDriver();
	  driver.get(url);
	  
  }
}
