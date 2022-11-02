package TestNg;

import org.testng.annotations.Test;

public class TestNgAnnotationExample2 {

	@Test(priority=0)
	public void f1(){
		System.out.println("Test 0");
	}
	
	@Test(priority=-1)
	public void f2(){
		System.out.println("Test -1");
	}
	
	@Test(priority=1)
	public void f3(){
		System.out.println("Test 1");
	}
}
