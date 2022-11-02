package assertExample;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class VerifyTitleExample {
	WebDriver driver;
	//AssertExmp asrt=new AssertExmp();
  @Test
  public void f() {
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\TestingSoftwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.icicilombard.com/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  AssertExmp.asertExmp(driver);
	  
  }

}
