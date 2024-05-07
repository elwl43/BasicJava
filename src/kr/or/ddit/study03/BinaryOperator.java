package kr.or.ddit.study03;

import java.util.Scanner;

public class BinaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator obj = new BinaryOperator();
		obj.process();
	}

	public void process() {
		// 이항 연산자 : 대부분의 연산자
		// 산술 연산자, 관계 연산자, 논리 연산자, 비트 연산자, 대입 연산자
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
	}
	
	public void method1() {
		// 산술 연산자
		// 종류 : +, -, /, *, %
		// 사칙연산과 마찬가지로 /, * 먼저 적용된다.
		
		int a = 5;
		int b = 3;
		
		System.out.println("덧셈\t"+(a+b));
		System.out.println("뺄셈\t"+(a-b));
		System.out.println("나누기\t"+(a/b));
		System.out.println("곱하기\t"+(a*b));
		
		System.out.println("나머지\t"+(a%b));
	}
	
	public void method2() {
		// 관계연산자
		// 참 거짓으로 결과가 나옴
		// <, >, ==, >=, <=, !=
		
//		System.out.print("점수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		
//		// 90~100점 : A
//		if(num>=90) {
//			System.out.println("A 학점");
//		}
		
		int a = 10;
		int b = 10;
		
		if(a==b) {
			System.out.println("a와 b는 같은 값");
		}
		if(a!=b+1) {
			System.out.println("a와 b+1는 같은 값");
		}
	}
	
	public void method3() {
		// 논리 연산자
		// &&, ||, !|
		// && : 둘 중 하나라도 거짓이면 거짓
		// || : 둘 중 하나라도  참이면 참
		// !  : 부정 => !true = false
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a&&b);
		System.out.println(a&&!b);
		System.out.println(a||b);
		System.out.println(!a||b);
		
		System.out.println("점수를 입력하세요 : ");
		int score = sc.nextInt();
		// B학점
		// 90보다 작으면서 80보다 크거나 같다
		if(score < 90 && score >= 80) {
			System.out.println("B");
		}
		
	}
	
	public void method4() {
		// 대입 연산자
		// = : '=' 오른쪽의 값을 '=' 왼쪽에 저장 우선순위가 가장 늦다
		// '='과 다른 연산자가 결합
		// a=a+b	=> a+=b
		// a-a+b	=> a-=b
		// a=a/b	=> a/=b
		// a=a*b	=> a*=b
		// a=a%b	=> a%=b
		
		int x = 10;
		int y = 15;
		int result = x+y;
		System.out.println(result);
		
		int a = 10;
		int b = 4;
		System.out.println("a=a+b => a+=b : "+(a+=b)); // 10+4=14
		System.out.println("a=a-b => a-=b : "+(a-=b)); // 14-4=10
		System.out.println("a=a/b => a/=b : "+(a/=b)); // 14/4=2.5 -> 2
		System.out.println("a=a*b => a*=b : "+(a*=b)); // 2*4=8
		System.out.println("a=a%b => a%=b : "+(a%=b)); // 8%4=0
		
	}
	
	public void method5() {
		// 논리연산자
		// |, &, ~
		
		int a = 45;
		int b = 25;
		//			&			|			 ~(not)
		// 45	:  00101101    00101101		00101101
		// 25	:  00011001    00011001		
		//		   00001001    00111101		11010010
		//									=> -(10101101)+1 => -46
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~a);
	}
	
	public void method6() {
		// 시프트 연산자
		// >> <<
		
		int a = 12;
		// 1100
		System.out.println(a>>2);
		System.out.println(a<<2);
	}
}
