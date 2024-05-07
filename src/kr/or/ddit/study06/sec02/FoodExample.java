package kr.or.ddit.study06.sec02;

public class FoodExample {
	public static void main(String[] args) {
		// 객체 2개 생성후 적절한 값을 넣어보시오
		Food f1 = new Food();
		Food f2 = new Food();
		
		f1.name = "새콤달콤";
		f1.price = 500;
		
		f2.name = "호올스";
		f2.price = 1000;
		
		System.out.println(f1);
	}
}
