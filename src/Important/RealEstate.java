package Important;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class RealEstate {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.linkText("Forgot Password?")).click();
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='email']")));
	  driver.findElement(By.xpath("//button[text()='Submit']")).click();
	  Thread.sleep(5000);
	 Alert a = driver.switchTo().alert();
	 a.accept();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.realestateindia.com/login.php");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

}
