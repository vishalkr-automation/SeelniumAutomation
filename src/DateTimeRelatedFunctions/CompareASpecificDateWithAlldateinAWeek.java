package DateTimeRelatedFunctions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareASpecificDateWithAlldateinAWeek {

	
	public String day0(){
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar c = Calendar.getInstance();
		 c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 0); // Adding 5 days
		String day0 = sdf.format(c.getTime());
		//System.out.println(day0);
		return day0;
	}
	
	public String day1(){
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar c = Calendar.getInstance();
		 c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 1); // Adding 5 days
		String day0 = sdf.format(c.getTime());
		//System.out.println(day0);
		return day0;
	}
	
	public String day2(){
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar c = Calendar.getInstance();
		 c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 2); // Adding 5 days
		String day0 = sdf.format(c.getTime());
		//System.out.println(day0);
		return day0;
	}
	
	public String day3(){
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar c = Calendar.getInstance();
		 c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 3); // Adding 5 days
		String day0 = sdf.format(c.getTime());
		//System.out.println(day0);
		return day0;
	}
	
	public String day4(){
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar c = Calendar.getInstance();
		 c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 4); // Adding 5 days
		String day0 = sdf.format(c.getTime());
		//System.out.println(day0);
		return day0;
	}
	
	public String day5(){
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar c = Calendar.getInstance();
		 c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 5); // Adding 5 days
		String day0 = sdf.format(c.getTime());
		//System.out.println(day0);
		return day0;
	}
	
	public String day6(){
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar c = Calendar.getInstance();
		 c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 6); // Adding 5 days
		String day0 = sdf.format(c.getTime());
		//System.out.println(day0);
		return day0;
	}
	
	
	@Test
	public void f3(){
		
		String day1st=day0();
		System.out.println(day1st);
		
       String day2nd=day1();
		System.out.println(day2nd);
		
       String day3rd=day2();
		System.out.println(day3rd);
		

		String day4th=day3();
		System.out.println(day4th);
		
      String day5th=day4();
		System.out.println(day5th);
		
       String day6th=day5();
		System.out.println(day6th);
		
		String day7th=day6();
		System.out.println(day7th);
		
		
		String expectedDate="15/07/2018";
	    
	   
	  if(expectedDate.equals(day1st)){
		  System.out.println("Today date is: " + day1st);
	  }
	  
	  else if(expectedDate.equals(day2nd)){
		  System.out.println("Today date is: " + day2nd);
	  }
	  
	  else if(expectedDate.equals(day3rd)){
		  System.out.println("Today date is: " + day3rd);
	  }
	  
	  else if(expectedDate.equals(day4th)){
		  System.out.println("Today date is: " + day4th);
	  }
	  
	  else if(expectedDate.equals(day5th)){
		  System.out.println("Today date is: " + day5th);
	  }
	  
	  else if(expectedDate.equals(day6th)){
		  System.out.println("Today date is: " + day6th);
	  }
	  
	  else if(expectedDate.equals(day7th)){
		  System.out.println("Today date is: " + day7th);
	  }
	  else{
		 Assert.fail("Excpected Date is being diplayed out of range: " + expectedDate);
	  }
	}
}
