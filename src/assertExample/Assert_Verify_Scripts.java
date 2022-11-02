package assertExample;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Assert_Verify_Scripts {
	
	public int multiply(int x, int y) {
		  return x / y;
		  }
		  
  @Test(description="Example for assert code")
  public void testMultiply() {
	  
	  System.out.println("Before Error");
	  System.out.println("--------------------------------");
	  Assert.assertEquals(21, multiply(10, 5));
	  System.out.println("After Error");	
	  
	  
 
}
  
@Test(description="Example for verify code")
public void testMultiply1(){
	
	System.out.println("Before Error");
	try{
		Assert.assertEquals(21, multiply(10,5));
	}
	catch(Throwable t){
		System.out.println("After Error");
	}
}
  
 
}
