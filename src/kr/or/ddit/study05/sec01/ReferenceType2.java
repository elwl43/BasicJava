package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType2 obj = new ReferenceType2();
		obj.process();
	}

	public void process() {
//		method1();
		method2();
		
	}
	
	public void method2() {
//		String a = "";
		String a = null;
		
		if(a == null || a.isEmpty()) {
			System.out.println("빈 문자열");
		}
//		if(a.isEmpty()|| a == null) {
//			System.out.println("빈 문자열");
//		}
	}
	
	public void method1() {
		int a = 10;
		// 1
		int b = 15;
		{
			// 2
			String c = "test";
			// 3
		}
		// 4
		String d = "test";
		{
			int e = 4;
			// 5
			{
				int f = 10;
				// 6
			}
			int g = 3;
			// 7
			d = "test2";
			// 8
		}
		System.out.println(a);
	}
}
