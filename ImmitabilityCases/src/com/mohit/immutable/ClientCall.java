package com.mohit.immutable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ClientCall {
	public static void main(String args[]) {
		List<Integer> noOfDays= new ArrayList<Integer>();
		noOfDays.add(11);
		noOfDays.add(12);
		noOfDays.add(13);
		noOfDays.add(14);
		
		List<String> days= new ArrayList<String>();
		days.add("mon");
		days.add("tue");
		days.add("wed");
		
		Date date1= new Date();
		System.out.println("Date Before ::::"+ date1);
		
		TestImmutable immutable = new TestImmutable(1,"Mohit",40000.0,noOfDays,days,date1);
		
		System.out.println("Original Immutable::::"+ immutable);
		days.add("thrus");
		days.add("friday");
		noOfDays.add(15);
		noOfDays.add(16);
		noOfDays.add(17);
		Calendar c = Calendar.getInstance(); 
		c.setTime(date1); 
		c.add(Calendar.DATE, 3);
		date1 = c.getTime();
		
		System.out.println("Date After ::::"+ date1);
		System.out.println("After Modification Immutable::::"+ immutable);
	}
}
