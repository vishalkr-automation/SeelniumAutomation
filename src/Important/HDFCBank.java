package Important;

import org.testng.annotations.Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class HDFCBank {
	WebDriver driver;
	
	public void login(){
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath
				("//div[contains(@class, 'homePageBanner')]/div/img[@alt='Close']")));
		ele.click();
	}
	
	public void DriverHandle() throws Exception{
		String parent = driver.getWindowHandle();
		driver.findElement(By.cssSelector("a[id='loginsubmit']")).click();
		Thread.sleep(2000);
		Set<String> handle = driver.getWindowHandles();
		for(String ch : handle){
		 if(!ch.equalsIgnoreCase(parent)){
			driver.switchTo().window(ch);
			driver.findElement(By.xpath("//div[@class='button']/a/img[@alt='Continue']")).click();
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//td[@valign='bottom']/a/img[@alt='continue']")).click();
			Thread.sleep(1000);
			Alert al = driver.switchTo().alert();
			String str= al.getText();
			System.out.println(str);
			al.accept();
			Thread.sleep(1000);
			driver.close();
			   
		  }
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//div[text()='NetBanking']")).click();
		driver.findElement(By.xpath("//ul[@class='loginOption']/li[@id='creditcardlogin']")).click();
	}
  @Test
  public void f() throws Exception {
	
	  login();
	  DriverHandle();
	
}
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://www.hdfcbank.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

}
