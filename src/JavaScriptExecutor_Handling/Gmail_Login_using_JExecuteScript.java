package JavaScriptExecutor_Handling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Gmail_Login_using_JExecuteScript {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
      WebElement mailid = driver.findElement(By.xpath("//input[@name='Email']"));
      myExecutor.executeScript("arguments[0].value='vishalkr1091@gmail.com';", mailid);
      Thread.sleep(3000);
      WebElement ele=driver.findElement(By.id("next"));
     // myExecutor.executeScript("arguments[0].click()", ele);
      ele.click();
      Thread.sleep(3000);
      WebElement password=driver.findElement(By.name("Passwd"));
      //password.clear();
      myExecutor.executeScript("arguments[0].value='8471054845';", password);
      Thread.sleep(3000);
      
      WebElement signin=driver.findElement(By.id("signIn"));
      signin.click();
      Thread.sleep(10000);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://gmail.com");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
