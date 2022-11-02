package assertExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	SoftAssert s=new SoftAssert();
	//AssertExmp asrt=new AssertExmp();
	
  @Test
  public void f() {
	 
		  s.assertEquals(10, 20);
		  System.out.println("After Using SoftAssert");
	      s.assertAll();
	      
	      
}
}