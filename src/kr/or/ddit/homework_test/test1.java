package kr.or.ddit.homework_test;

import java.util.Scanner;

public class test1 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		test1 obj = new test1();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
	}
	
	public void method4() {
//		양의 정수 n이 매개변수로 주어질때
//		n이 홀수라면 n이하의 홀수인 모든 양의 정수 합
//		-> n = 5
//			1 + 3 + 5 = 9
//		n이 짝수라면n 이하의 짝수인 모든 양의 정수 제곱의 합
//		-> n = 4
//			2*2 + 4*4 = 20
		int n = (int)(Math.random()*100)+1; // 0 ~ 100 사이의 난수 1개 발생
		System.out.println(n);
		
		int sum = 0;
		
		if(n%2 == 1) {
			for(int i=1; i<=n; i+=2) {
				sum += i;
			}
		}
		else {
			for(int i=2; i<=n; i+=2) {
				sum += i*i;
			}
		}
		System.out.println(sum);
		
	}
	
	public void method3() {
		// for문 2개를 이용하여 구구단 전체를 출력하시오.
		// 스캐너를 통해 숫자를 입력 받고 해당 숫자에 해당하는 구구단은 제외.
		// ex) 입력 3
		System.out.print("단을 입력하세요 : ");
		
		int dan = sc.nextInt();
		
		
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int j=2; j<=9; j++) {
				if(j == dan) continue;
				System.out.print(j+" * "+i+" = "+j*i);
				System.out.print("\t");
			}
		}
	}
	
	public void method2() {
		// for문 2개를 이용하여 구구단 전체를 출력하시오
		// 오른쪽부터 출력
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int j=2; j<=9; j++) {
				System.out.print(j+" * "+i+" = "+j*i);
				System.out.print("\t");
			}
		}
		
		
	}
	
	public void method1() {
//		스캐너를 통해 숫자를 입력 받고 해당 숫자에 해당하는 구구단을 출력학시오
//		3 * 1 = 3
//		3 * 2 = 6
//			.
//			.
//			.
//		3 * 9 = 27
		System.out.print("단을 입력하세요 : ");

		int dan = sc.nextInt();
		
		for(int i=dan; i<=dan; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+i * j);
			}
		}
		
	}
}

