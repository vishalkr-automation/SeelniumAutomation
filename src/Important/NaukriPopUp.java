package Important;

import org.testng.annotations.Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class NaukriPopUp {
	WebDriver driver;
	String Parent = " ";
  @Test
  public void f() {
	  String url = "https://www.naukri.com/";
	  Set<String> handle= driver.getWindowHandles();
	  System.out.println(handle.size());
	  for (String han : handle) {
		  
		  driver.switchTo().window(han);
		  if(!driver.getCurrentUrl().equalsIgnoreCase(url)){
			  
			  driver.close();
		}
		  else{
			  Parent = han;
		  }
		  
  }	
	  driver.switchTo().window(Parent);
	  driver.findElement(By.id("input_resumeParser")).click();
}
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.naukri.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

}
