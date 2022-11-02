package Important;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Flipkart {
	WebDriver driver;
	public void Login(){
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
	    WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
				  ("input[class='_2zrpKA']")));
		ele.sendKeys("9091970934");
		WebElement el = driver.findElement(By.cssSelector("input[class='_2zrpKA _3v41xv']"));
		el.click();
		el.sendKeys("NFLIPKARTU");
		driver.findElement(By.cssSelector("button[class $='_7UHT_c']")).click();
	}
	
	public void search() throws Exception{
		driver.findElement(By.cssSelector("input[class='LM6RPg']")).sendKeys("Selenium WebDriver",Keys.ENTER);
	      int i =0;
	      Thread.sleep(1000);
	      String fi = "//div[contains(@class, 'col-3-12')]/div/a[@class='_2cLu-l']";
	      List<WebElement> li =  driver.findElements(By.xpath(fi));
	      List<WebElement> lis =  driver.findElements(By.xpath("//a[@class='_2cLu-l']/following-sibling::a[@class='_1Vfi6u']/div/div[1]"));
	      for (WebElement f : li) {
			
				System.out.println(f.getText());
				
				System.out.println("Price = "+lis.get(i).getText());
				System.out.println();
				i++;
			}
	}

  @Test
  public void f() throws Exception {
	  
	  Login();
	  Thread.sleep(1000);
	  search();
      
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

}
