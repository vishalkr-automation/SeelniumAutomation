package DateTimeRelatedFunctions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class HowToGetdaysBasedOnTodayDateAndCompareToSpecificDate {

	@Test
	public void f(){
		Date now = new Date();
		 
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
        System.out.println(simpleDateformat.format(now));
 
        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(now));
 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // the day of the week in numerical format
        
	}
}
