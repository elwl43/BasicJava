package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
	}
	
	public void method6() {
		// 구구단 
		for(int i=1; i<=9; i++) {
			System.out.println("===="+i+"단====");
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
//				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
		
		
	}
	
	public void method5() {
		// i, j = 30일때부터 출력하지않기
		
		END: // label
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				System.out.println(i+", "+j);
				if(i==30 && j==30) {
					break END; // END에 대한 반복문 종료
				}
			}
			
		}
	}
	public void method4() {
		// i, j = 30일때부터 출력하지않기
		
		boolean flag = true;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				
				if(flag) {
					System.out.println(i+", "+j);					
				}
				if(i==30 && j==30) flag = false;
			}
			
		}
	}
	
	public void method3() {
		
		// break 문
		// 반복문을 종료한다
		for(char ch = 'a'; ch <= 'z'; ch++) {
			if(ch == 'o') break;
			System.out.print(ch);
		}
		
	}
	
	public void method2() {
		// 영어를 입력하고 모음을 제거하시오
		// abcde -> bcd
		String word = sc.next();
		
//		for(int i=0; i<word.length(); i++) {
//			if(word == 'a'|| word=='e' || word=='i' || word=='o' || word=='u') continue;
//			System.out.println(word);
//		}
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(ch == 'a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') continue;
			System.out.println(ch);
		}
		
	}
	
	public void method1() {
		// continue 문
		// 해당 loop를 종료시키고 다음 loop로 진행시킨다.
		for(int i=0; i<10; i++) {
			if(i%2==0)continue;
			System.out.println(i);
		}
	}
}
