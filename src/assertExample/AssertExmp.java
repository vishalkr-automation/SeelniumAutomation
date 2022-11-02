package assertExample;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertExmp {
	
	 WebDriver driver;
	 
	 static SoftAssert s=new SoftAssert();
	
	public static void asertExmp(WebDriver driver){
		//this.driver=driver;
		 String actualtitle="ICICI Lombard: Online General Insurance Company in India | Buy Motor, Health, Travel &  ";
		  String expectedTitle=driver.getTitle();
		  s.assertEquals(actualtitle, expectedTitle);
		  s.assertAll();
	}

}
