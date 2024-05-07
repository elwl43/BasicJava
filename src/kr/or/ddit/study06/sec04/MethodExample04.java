package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MethodExample04 obj = new MethodExample04();
		obj.process();
	}

	public void process() {
		// 스캐너를 통해 a, b 값을 입력 받고
		// add 메소드를 수정하여 a+b 값을 리턴 받아 출력하시오
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("a : ");
		int b = sc.nextInt();
		
		int add = add(a, b);
		int minus = minus(a, b);
		int multiply = multiply(a, b);
		double divide = divide(a, b);
		System.out.println("a + b = "+ add);
		System.out.println("a - b = "+ minus);
		System.out.println("a * b = "+ multiply);
		System.out.println("a / b = "+ divide);
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public double divide(int a, int b) {
		return (double)a/b;
	}
}
