package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample03 obj = new ArrayExample03();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}
	
	public void method5() {
		int[] arr = {1,4,2,3,5};
		
		System.out.println(Arrays.toString(arr)); // 배열에 있는 값을 다 꺼내준다.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); // 배열에 있는 값을 다 꺼내준다.
		
		
	}
	
	public void method4() {
		String[] strList = {"a", "b", "c"};
		
//		for(int i=0; i<strList.length; i++) {
//			String str = strList[i];
//			System.out.println(str);
//		}
		
		for(String str : strList) {
			System.out.println(str);
		}
	}
	
	public void method3() {
		int[][] arr = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[4];
		arr[2] = new int[5];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	
	public void method2() {
		
		// 국영수
		// 홍길동, 강감찬, 이순신
		int[][] score = {{80, 75, 87}, 
						 {88, 90, 91},
						 {77, 73, 65}};
		// 홍길동에 국어 점수 
		int hong_kor = score[0][0];		
		
		System.out.println(hong_kor);
		// 강감찬의 수학 점수
		int kang_math = score[1][2];
		
		// 이순신의 영어 점수
		int lee_eng = score[2][1];
		
		// 홍길동의 총점
		int hong_sum = 0;
		
		for(int i=0; i<score[0].length; i++) {
			hong_sum += score[0][i];
		}
		// 국어 점수 총합  
		int kor_sum = 0;
		
		for(int i=0; i<score.length; i++) {
			kor_sum += score[i][0];
		}
	}
	
	public void method1() {
		int[][] arr = new int[3][5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
//				int[] temp = arr[i];				// 방법1
//				System.out.print(temp[j]+ " ");
				System.out.print(arr[i][j]+ " ");	// 방법2
			}
			System.out.println();
		}
	}
}
