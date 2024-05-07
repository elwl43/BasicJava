package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
//		obj.method1();
//		obj.mehtod2();
//		obj.mehtod3();
//		obj.mehtod4();
		obj.mehtod5();
	}
	
	public void method1() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 버림  
		 *  ex ) 12.23123 - > 12.23
		 */
		System.out.println("실수 를 입력해주세요.");
		String str = sc.next();
		
//		double d1 = Double.valueOf(str);
//		
//		int i100 = (int)(d1*100);
//		double d100 = i100/100.0;
//		System.out.println("소수점 두자리 출력 : "+d100);
		double num = Double.valueOf(str);
		int num100 = (int)(num*100);
		double result = num100/100.0;
		System.out.println(result);
	}
	
	public void mehtod2() {
		/* 
		 *  스캐너를 통해서 대문자를 입력 받고 소문자로 변환 
		 *  ex) A-> a  
		 */
		System.out.print("대문자를 입력 해주세요 : ");
		String s = sc.next();
		
//		char ch = s.charAt(0);
//		int i1 = Integer.valueOf(ch);
//		int c = i1;
//		char c1 = (char)(c+32);
//		
//		System.out.println("변환된 문자 : "+c1);
		char ch = (char)(s.charAt(0)+32);
	
		System.out.println("변환된 문자 : "+ch);
	}
	public void mehtod3() {
		/*
		 *  스캐너를 통해서 소문자를 입력 받고 대문자로 변환 
		 *  ex) f-> F  
		 */
		System.out.print("소문자를 입력 해주세요 : ");
		String s = sc.next();
		
//		char ch1 = s.charAt(0);
//		int i2 = Integer.valueOf(ch1);
//		int c1 = i2;
//		char ch2 = (char)(c1-32);
//		
//		System.out.println("변환된 문자 : "+ch2);
		char ch = (char)(s.charAt(0)-32);
		
		System.out.println("변환된 문자 : "+ch);
	}
	
	public void mehtod4() {
		/*
		 *  스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오
		 *  ex) 123 -> 1+2+3
		 */
		System.out.println("세자리 숫자를 입력해주세요.");
		String s = sc.next();
		
//		int ch1 = s.charAt(0);
//		int ch2 = s.charAt(1);
//		int ch3 = s.charAt(2);
//
//		int x = (char)(ch1-48);
//		int y = (char)(ch2-48);
//		int z = (char)(ch3-48);
//		int sum = x+y+z;
//		System.out.println(sum);
		
		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		char c3 = s.charAt(2);
		int i1 = c1-'0';
		int i2 = c2-'0';
		int i3 = c3-'0';
		
		System.out.println(i1+i2+i3);
		
		
		
		
		
//		int sum=i1+i2+i3;
		
//		System.out.println(sum);
		
//		char ch = Character.valueOf(s); 
//		int i = Integer.valueOf(s);
//		System.out.println(i);
		
//		int c1 = i.charAt(0);
//		int i2 = i.charAt(1);
//		int i3 = i.charAt(2);
//		System.out.println(c1);
//		System.out.println(i2);
//		System.out.println(i3);
//		System.out.println(s);
//		char c1
	}
	
	public void mehtod5() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 반올림  
		 *  ex ) 12.2623 - > 12.3
		 */
		
		System.out.println("세자리 숫자를 입력해주세요.");
		String d = sc.next(); 
		
//		double d1 = Double.valueOf(d);
//		double num = d1*10;
//		int numInt = (int)num;
//		double numRound = numInt+(int)((num-numInt)*2);
//		double result = numRound /10;
//		
//		System.out.println(result);
		double num = 12.4;
		
		int result = (int)(num+0.5);
	
	}
	
	
}
