package JavaScriptExecutor_Handling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Search_Textbox {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
	  JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
	  myExecutor.executeScript("document.getElementsByName('q')[0].value='Kirtesh'", searchbox);
	  
  }
  @BeforeTest
  public void beforeTest() {
	   driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
