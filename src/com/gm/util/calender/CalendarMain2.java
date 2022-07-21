package com.gm.util.calender;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		Calendar birth = Calendar.getInstance();
		
		birth.set(Calendar.YEAR, 1999);
		birth.set(Calendar.MONTH, 04);
		birth.set(Calendar.DATE, 13);
		
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		
		long result = n - b;
		result = result / (1000 * 60 * 60 * 24);
		result = result / 365;
		System.out.println(result);
		
		Date date = now.getTime();
		System.out.println(date);
		
		int y = birth.get(Calendar.YEAR);
		int m = birth.get(Calendar.MONTH);
		int d = birth.get(Calendar.DATE);
		
		System.out.println(y);
		System.out.println(m);
		System.out.println(d);
		
		
		
		
		
//		future.set(Calendar.MINUTE, 15);
//
//		long n = now.getTimeInMillis();
//		long f = future.getTimeInMillis();
//
//		long result = f - n;
//
//		System.out.println(result);
//		System.out.println(result / 1000 * 60);
	}

}
