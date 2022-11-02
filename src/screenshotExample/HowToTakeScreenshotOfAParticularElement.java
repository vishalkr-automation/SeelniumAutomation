package screenshotExample;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HowToTakeScreenshotOfAParticularElement {
	
	//Tutorial - http://automate-apps.com/capture-screen-shot-of-web-element-using-selenium-webdriver/
	
	@Test(enabled=true)
	public void takesScreenShotForSpecificWebElement2() throws IOException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element=driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 // Calculate the width and height of the drop down element
        Point p = element.getLocation();
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();
 
        // Create Rectangle of same width as of drop down Web Element
        Rectangle rect = new Rectangle(width, height);
 
        BufferedImage img = ImageIO.read(screenshot);
 
        //Crop Image of drop down web element from the screen shot
        BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.width, rect.height);
        //BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.height, rect.width);
 
        // write cropped image into File Object
        ImageIO.write(dest, "png", screenshot);
 
        //Copy Image into particular directory
        FileUtils.copyFile(screenshot,new File("./ScreenshotFolder/subImage.jpeg"));
		
		
	}
	
	//https://www.youtube.com/watch?v=SfG-oB9bU4g
	@Test(enabled=false)
	public void takesScreenShotForSpecificWebElement() throws IOException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullImage=ImageIO.read(screenshot);
		
		Point point=ele.getLocation();
		
		int eleWidth=ele.getSize().getWidth();
		int eleHeight=ele.getSize().getHeight();
		
		BufferedImage eleScreenshot=fullImage.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
		
		ImageIO.write(eleScreenshot, ".png", screenshot);
		
		FileUtils.copyFile(screenshot, new File("./ScreenshotFolder/subImage.jpeg"));
		
		driver.quit();
		
		
	}
	

}
