package xmlSuiteExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTitle {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://selenium4testing.com/hms/");
	  String title=driver.getTitle();
	  String expectedtitle="User Login Page";
	  String expectedtitle1="User Login Pag";
	  if(!title.equalsIgnoreCase(expectedtitle1)){
		  Assert.fail("Page title not matching");
	  }
	  
  }
}
