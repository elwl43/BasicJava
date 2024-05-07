package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class ScanExample {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScanExample obj = new ScanExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}
	
	public void method1() {
		System.out.print("문자를 입력하세요 : ");
		String input = sc.next();
		System.out.println("입력 결과 값 : " + input);
	}
	
	public void method2() {
		System.out.print("숫자를 입력하세요 : ");
		String input = sc.next();
		// input을 int로 바꾼후 10을 더하세요
		int i1 = Integer.valueOf(input)+10;
		System.out.println("결과 값 : "+ i1);
		 
	}
	
	public void method3() {
		// 숫자 2개를 입력 받아 두 수를 더하시요.
		System.out.print("숫자를 입력하세요 : ");
		String a = sc.next();
		
		System.out.print("숫자를 입력하세요 : ");
		String b = sc.next();
		
		int result = Integer.valueOf(a) + Integer.valueOf(b);
		System.out.println("a의 입력값은="+a+"b의 입력값은"+b+"두 수의 합은 :"+result);
		
		
	}
	
	public void method4() {
		System.out.print("환전할 달러를 입력하세요 : ");
		String dollor = sc.next();
		
		double exchangeRate = 1349.88;
		double won = Double.valueOf(dollor)*exchangeRate;
		int won_ = (int)won/10*10; 
		//		int x = Integer.valueOf(x); 
		
		System.out.println(dollor+"$는"+won_+"원 입니다.");
		
		
	}
	
	public void method5() {
		System.out.println("3자리 문자를 입력하세요");
		String word = sc.next();
		// String -> char
		char ch1 = word.charAt(0);
		char ch2 = word.charAt(1);
		char ch3 = word.charAt(2);
		System.out.println("첫번째 문자 : "+ch1);
		System.out.println("두번째 문자 : "+ch2);
		System.out.println("세번째 문자 : "+ch3);
		
	}
}
