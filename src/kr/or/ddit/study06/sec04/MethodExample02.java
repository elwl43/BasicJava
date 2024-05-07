package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MethodExample02 obj = new MethodExample02();
		obj.process();
	}

	public void process() {
		// 스캐너를 통해 a, b 값을 입력 받고
		System.out.println("a 입력 : ");
		int a = sc.nextInt();
		System.out.println("b 입력 : ");
		int b = sc.nextInt();
		add(a, b);
		minus(a, b);
		multiply(a, b);
		divide(a, b);
		// add 메소드를 수정하여 a+b 값을 출력하시오
	}
	
	public void add(int a, int b) {
		System.out.println("a+b = "+(a+b));
	}
	
	public void minus(int a, int b) {
		System.out.println("a-b = "+(a-b));
	}
	public void multiply(int a, int b) {
		System.out.println("a*b = "+(a*b));
	}
	public void divide(int a, int b) {
		System.out.println("a/b = "+(a/b));
	}
}
