package com.hamitmizrak;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class _25_Date {
	
	// date
	public static void dateTutorials() {
		// 1900 ekle çıkar
		Date date = new Date("1999/5/1");
		date.setYear(2000);
		System.out.println(date.getYear() - 1900);
		
		System.out.println(date);
		
		// aylar sıfırdan başlar
		System.out.println(date.getMonth());
		
		int nowYear = date.getYear() + 1900;
		System.out.println(nowYear);
		
		System.out.println(new Date(System.currentTimeMillis()));
	}
	
	// date Turkish time
	public static void dateLocale() {
		// Date
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss ", locale);
		
		Date date = new Date();
		System.out.println(date);
		String turkisDateTime = dateFormat.format(date);
		System.out.println(turkisDateTime);
	}
	
	////////////////////////////////////
	// calendar
	public static void calendarTutorials() {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTime().getHours());
	}
	
	// date Turkish time
	public static void calendarLocale() {
		// Date
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss ", locale);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		String turkisCalendarTime = dateFormat.format(calendar.getTime());
		System.out.println(turkisCalendarTime);
	}
	
	// ana dizin
	public static void main(String[] args) {
		
		// date
		// dateTutorials();
		dateLocale();
		
		System.out.println("*******************");
		
		// calendar
		// calendarTutorials();
		calendarLocale();
	}
	
}
