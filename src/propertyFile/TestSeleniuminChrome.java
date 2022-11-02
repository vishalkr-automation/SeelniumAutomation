package propertyFile;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestSeleniuminChrome {
    WebDriver driver;
	ConfigReader config;
	
	@BeforeTest
	public void Setup(){
		config=new ConfigReader();
		  System.setProperty("webdriver.chrome.driver", config.getChromePath());
		  driver=new ChromeDriver();		  
	}
  
  @Test
  public void f() {
	  
	  driver.get(config.getAppUrl());
  }

}
