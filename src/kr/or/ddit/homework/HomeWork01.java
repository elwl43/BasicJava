package kr.or.ddit.homework;

import java.util.Date;

public class HomeWork01 {
	public static void main(String[] args) {
		Date date = new Date();

		// 기준일로 부터 지난 시간
		long time = date.getTime();
		System.out.println(time);

//		long year, day, hour, min, sec;
//		
//		year = time / 365 / 24 / 60 / 60 / 1000;
//		time = time - (year * 365 * 24 * 60 * 60 * 1000);
//		
//		day = time / 24 / 60 / 60 / 1000;
//		time = time - (day * 24 * 60 * 60 * 1000);
//		
//		hour = time / 60 / 60 / 1000;
//		time = time - (hour * 60 * 60 * 1000);
//		
//		min = time / 60 / 1000;
//		time = time - (min * 60 * 1000);
//		
//		sec = time / 1000;
		
//		System.out.println(year+"년"+day+"일"+hour+"시"+min+"분"+sec+"초 지났습니다.");
	
		long sec = 1000;
		long min = sec*60;
		long hour = min*60;
		long day = hour*24;
		long year = day*365;
		
		long years = time/year;
		time = time - year*years;
		System.out.println(year);
		System.out.println(time);
		long days = time/day;
		time = time - day * days;
		
		long hours = time/hour;
		time = time - hour * hours;
		
		long mins=time/min;
		time=time-min*mins;
		
		long secs=time/sec;
		time=time-sec*secs;
		// 기준일로부터 ?년 ?일 ?시 ?분 ?초 지났습니다.
		System.out.println(years+"년"+days+"일"+hours+"시"+mins+"분"+secs+"초 지났습니다.");
		
//		System.out.println(day);
		
//		long time2 = 3000;
////		
//		long hour = 
//		long min = time/60;
//		long sec = time-min*60;

//		System.out.println(year);
//		System.out.println(day);
	}
}
