package openNewTab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenNewTab {
	WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	
	@Test(enabled=false, description="method1")
	public void f1(){
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.open('https://www.facebook.com','_blank');");
		
	}
	
	
	@Test(enabled=false, description="method2")
	public void f2(){
	String a = "window.open('about:blank','_blank');";
	((JavascriptExecutor)driver).executeScript(a);
		
		
	}

	@Test(enabled=false, description="method3")
	public void f3() throws AWTException{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
	}
	
	@Test(enabled=false, description="method3")
	public void f4(){
	   ((JavascriptExecutor)driver).executeScript("window.open()");
		
	}
	
	@Test(enabled=false, description="method3")
	public void f5() throws Exception{
		//String parentWindow=driver.getWindowHandle();
		String str = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Gmail")).sendKeys(str);
		
		Thread.sleep(2000);
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(tabs.size());
		System.out.println(tabs.toString());
					
		driver.switchTo().window(tabs.get(1).toString());
		driver.get("https://www.facebook.com");
		
	}
	

}
