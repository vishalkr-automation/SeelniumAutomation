package xmlSuiteExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
	
	public static boolean status;
	
	public static boolean verifyIfPresent(WebDriver driver, By locator){
		
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
		    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		    if(element != null){
		    	return true;
		    }
		    
		}catch(Exception e)
		{
			System.err.println("Element not found by locator "+locator);
		}
		return false;
	}

}
