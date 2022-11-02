package TestNg;

import org.testng.annotations.Test;

public class TestNGAnnotationExample1 {
	
	@Test(priority=-1)
	public void f1(){
		System.out.println("Test 1");
	}
	
	@Test(priority=-3)
	public void f2(){
		System.out.println("Test 2");
	}
	
	@Test(priority=-2)
	public void f3(){
		System.out.println("Test 3");
	}
	

}
