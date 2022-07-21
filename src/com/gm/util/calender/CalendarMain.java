package com.gm.util.calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		// Calendar ca = new GregorianCalendar();
		// 현재 년 월 일 시 분 초 밀리세컨즈
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);

		ca.set(Calendar.YEAR, 2002);
		ca.set(Calendar.MONTH, 11);
		ca.set(Calendar.DATE, 25);
		
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DAY_OF_MONTH);
		int h = ca.get(Calendar.HOUR);
		int min = ca.get(Calendar.MINUTE);
		int sec = ca.get(Calendar.SECOND);

		System.out.println(y);
		System.out.println(m + 1);
		System.out.println(d);
		System.out.println(h);
		System.out.println(min);
		System.out.println(sec);
		
		long milis = ca.getTimeInMillis();
		System.out.println(milis);
	}

}
