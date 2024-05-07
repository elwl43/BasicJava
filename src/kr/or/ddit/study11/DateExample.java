package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import sun.util.resources.cldr.aa.CalendarData_aa_DJ;

public class DateExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DateExample obj = new DateExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
	}
	
	public void method6() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 1);
//		cal.set(Calendar.MINUTE, 30);
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		Date date = cal.getTime();
		System.out.println(date);
	}
	
	public void method5() {
		Date date = new Date();
		System.out.println("더할 날짜를 입력하세요 : ");
		int day = sc.nextInt();
		Date date2 = new Date(date.getTime() + 1000L * 60 * 60 * 24 * day);
		System.out.println(date);
		System.out.println(date2);
	}
	
	public void method4() {
		// 날짜를 String으로 입력 받고
		// 몇일 몇분 몇초가 남았는지 출력하시오.
		System.out.println("날짜를 입력하시오.");
		String str = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		try {
			Date cur = new Date();
			Date date = sdf.parse(str);
			long time = date.getTime() - cur.getTime();
			int sec = 1000;
			int min = sec*60;
			int hour = min*60;
			int day = hour*24;
			
			long days = time/day;
			time %= day;

			long hours = time/hour;
			time %= hour;
			
			long mins = time/min;
			time %= min;

			long secs = time/sec;
			time %= sec;
			
			System.out.println(days+"일"+hours+"시"+mins+"분"+secs+"초 남았습니다.");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void method3() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String str = "2024.04.30";
		// String -> Date
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void method2() {
		// Date -> String
		// date2string
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss:SSS");	// MM : month, mm : minute, hh : 12시간, HH : 24시간
		Date date = new Date();
		String str = sdf.format(date);
		System.out.println(str);
	}
	
	public void method1() {
		Date date = new Date();
		System.out.println(date);
		long time = date.getTime();
		System.out.println(time);
		
		// 몇년 몇일 몇시 몇분 몇초
		int sec = 1000;
		int min = sec*60;
		int hour = min*60;
		int day = hour*24;
		int year = day*365;
		
		int years = (int)(time/year);
		time %= year;
		
	}
}
