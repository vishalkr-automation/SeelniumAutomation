package xmlSuiteExample;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReusableAssertMethod extends CommonFunctions{
	WebDriver driver; 
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://selenium4testing.com/hms/");
	  status = verifyIfPresent(driver,By.xpath("//input[@name='username']"));
	  if(status == false){
		  Assert.fail("Element not Present");
	  }
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("user1");
	  
  }
}
