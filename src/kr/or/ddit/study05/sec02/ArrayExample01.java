package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
	}
	
	public void method7() {
		// 거스름돈을 입력 받아 화폐 단위별로 개수를 구하시오.
		// ex) 77670 => 10000 7개, 5000 1개, 1000 2개, 500 1개, 100 1개, 50 1개
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10};
		System.out.println("거스름돈 입력 : ");
		int money = sc.nextInt();
				
		for(int i=0; i<coin.length; i++) {
			int result = money/coin[i];
			money %= coin[i];
			if(result == 0) continue;
			System.out.println(coin[i] + " " + result + "개");
		}
		
	}
	
	public void method6() {
		int[] score = {80, 90, 87, 60, 94};
		// 최대값 구하기
//		int max = 0; // 0을 넣는것은 매우 위험
		int max = Integer.MIN_VALUE;
		for(int i=0; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}
		System.out.println("최대값은 : " + max);
		// 최소값 구하기
		
		int min = score[0];
		for(int i=0; i<score.length; i++) {
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최소값은 : " + min);
	}
	
	public void method5() {
		int a = 10;
		int b = 7;
		
		// a값과 b값을 바꿔보기
		
		int swap = a;
		a = b;
		b = swap;
		
		System.out.println("a: "+ a + ", b : " + b);
		
	}
	
	public void method4() {
		 
		int[] array = {1,2,3,4,5};
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
//		역순으로 출력
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[array.length-1-i]+"\t");
		}
	}
	
	public void method3() {
		// 크기 3짜리 배열을 만들고
		// 3개의 값을 입력 해보시오
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void method2() {
		// int[] students = new int[5];
		// int[] <= 1차원 배열
		// students <= 배열 이름(변수)
		// new int[배열 크기] <= 배열 생성
		int[] students = new int[5]; // []를 앞에 쓰자
		students[0] = 100;
		students[1] = 89;
		students[2] = 77;
		students[3] = 94;
		students[4] = 62;
		
		int sum = 0;
		for(int i=0; i<students.length; i++) {
			sum += students[i];
		}
	}
	
	public void method1() {
		// 변수 5개 만들고 각각에 0~100 사이 값을 넣을 것.
		int a1 = 100;
		int a2 = 89;
		int a3 = 77;
		int a4 = 94;
		int a5 = 62;
		// 총합 구하기
		int sum = a1+a2+a3+a4+a5;
		
	}
}
