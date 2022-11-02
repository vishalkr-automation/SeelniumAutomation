package JavaScriptExecutor_Handling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Upload_File_using {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  Thread.sleep(2000);
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Registration")).click();
	  Thread.sleep(4000);
	  //driver.findElement(By.xpath("//input[@name='image']")).sendKeys("C:\\Users\\Vishal\\Downloads\\img.jpg");
	  WebElement ele=driver.findElement(By.xpath("//input[@name='image']"));
	  JavascriptExecutor exe=(JavascriptExecutor)driver;
	  exe.executeScript("arguments[0].click()", ele);
	  //exe.executeScript("document.getElementsByName('image')[0].value='C:\\Users\\Vishal\\Downloads\\img.jpg';", ele);
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://selenium4testing.com/hms/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
