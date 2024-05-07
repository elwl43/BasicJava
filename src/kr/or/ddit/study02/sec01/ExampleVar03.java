package kr.or.ddit.study02.sec01;

public class ExampleVar03 {
	
	int c = 10;
	
	public static void main(String[] args) {
		// int 타입 변수 x,y 를 선언하시요
		int x;
		int y;
		// x에2 y=3 값을 넣으시요
		x=2;
		y=3;
		{
			int a=10;
			int b=10;
			{
				System.out.println(a);
			}
		}
		int b = 20;
		System.out.println(b);
		
		System.out.println(x+y);
	}
	
	public void test() {
		int x = 30;
		System.out.println(c);
	}
}
