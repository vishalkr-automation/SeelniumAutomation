package Important;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class PaytmAssign {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.className("_3ac-")).click();
	  driver.switchTo().frame(0);
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='input_0']")));
	  ele.click();
	  ele.sendKeys("8801805865");
	  driver.switchTo().defaultContent();
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("a[title='Close']")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://paytm.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

}
