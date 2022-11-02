package assertExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert2 {

	WebDriver driver;
	 SoftAssert s=new SoftAssert();
	//AssertExmp asrt=new AssertExmp();
	
  @Test
  public void f() {
	 
		  String actualtitle="ICICI Lombard: Online General Insurance Company in India | Buy Motor, Health, Travel &  ";
		  String expectedTitle=driver.getTitle();
		  s.assertEquals(actualtitle, expectedTitle);
	      s.assertAll();
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
