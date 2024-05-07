package kr.or.ddit.study06.sec05;

public class StaticExample {
	int a = 10;
	static int b = 10;
	
	public void method1() {	// method1 에서 method3 호출 가능
							// method1 에서 method2 호출 가능
		
	}
	
	public void method2() { // a값 가져올 수 있음
		
	}
	
	public static void method3() { // method3 에서 method4  호출 가능
		
	}
	
	public static void method4() { // a값 못가져옴 객체가 만들어져야함
		
	}
}
