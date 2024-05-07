package kr.or.ddit.study02.sec03;

public class TypeChange {
	public static void main(String[] args) {
//		1분=60초, 1시간=3600초, 하루=3600*24
		int a = 424500; // -> 4일21시간55분
		// 
		int year, day, hour, min, sec, ms;
		
		year = a/365/24/60/60/1000;
				
//		int hour = a/3600;
//		int min = (a-3600)/60;
//		int sec = a%100;
//		
//		//기준일로부터 ?년 ?일 ?시 ?분 ?초 지났습니다.
		// -> 1시간10분10초 
		System.out.println(year+"년지났습니다.");
//		System.out.println(year+"년"+day+"일"+hour+"시"+min+"분"+sec+"초 지났습니다.");
		
		
//		int a = 31536000;
//		int b = 60;
//		int year =  a/3600/24/12;
////		int year =  a/12;
////		int date = 
////		int min = a/b;
////		int sec = a-min*b;
//		System.out.println(year+", ");
////		기준일로부터 ?년 ?일 ?시 ?분 ?초 지났습니다.
	}
}
