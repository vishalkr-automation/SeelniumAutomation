package openPriavteBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Open_Chrome_IcoginitioBrowser {
	
	WebDriver driver;
	
	
	@Test
	public void test(){
	  System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	  
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("-incognito");
	  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	  driver=new ChromeDriver(capabilities);
	  driver.get("http://icicilombard.com/");
	}
}
