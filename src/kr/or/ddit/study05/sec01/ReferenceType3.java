package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType3 obj = new ReferenceType3();
		obj.process();
	}

	public void process() {
		method1();
	}
	
	public void method1() {
		int a = 10;
		// 1 스택에 a=10
		{
			int b = 12;
			int[] c;
			// 2 
			//스택에 b=12, int[] c= null
			c = new int[]{1,2,3};
			// 3
			// 힙에 100:1,2,3 그리고 스택에 c=100
		}
		// 4
		// b,c가 사라짐 int A=10 남아있음
		String d = "test";
		// 5
		// 힙에 200:test가 생기고, 스택에 String d = 주소값200
		{
			String[] e = new String[3];
			// 6
			// 힙에 주소값300 공간3개가 생기고, 스택에 String e = 주소값300
			e[0] = d;
			// 7
			// 주소값 200, ㅁ, ㅁ
			String f = "test2";
			// 8
			// 힙에 주소값 test2, 스택에 String f = 주소값 400
			e[1] = f;
			// 9 
			// 힙 주소값 400
			e[2] = "test";
			// 10 
			// 주소값 400에 test
		}
	}
}
