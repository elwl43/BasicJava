package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample obj = new WhileExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}
	
	public void method5() {
		
		do {
			System.out.println("실행"); // 최초 한번은 실행 보장
		} while(false);
		
	}
	
	public void method4() {
		// 숫자를 입력 받고 모든 자리수의 합을 구하시오.
		// while 문 이용
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("각 자리수의 합은 : "+sum);
	}
	
	
	public void method3() {
		
		while(true) {
			System.out.println("1. 계속");
			System.out.println("2. 종료");
			int num = sc.nextInt();
			if(num==1) {
				continue;
			}
			if(num==2) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	public void method2() {
		
		int i = 0;
		while(i > 0) {
			i++;
			System.out.println(i);
		}
		
	}
	
	public void method1() {
		
//		while(true) {
//			System.out.println("a");
//		}
		for(;true;) {
			System.out.println("a");
		}
	}
}
