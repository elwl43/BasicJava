package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
		obj.process();
	}

	public void process() {
				method1();
		//		method2();
		//		method3();
		//		method4();
		//		method5();
		//		method6();
		//		method7();
		//		method8();
		//		method9();
		//		method10();
		//		method11();
	}

	public void method1() {

		//		* 
		//		** 
		//		*** 
		//		**** 
		//		. . . 
		//		***********

		int row = sc.nextInt();
		String result = "";
		for (int i = 0; i < row; i++) {
			result = result + "*";
			System.out.println(result);
		}
	}

	public void method2() {

		//		    * 
		//		   ** 
		//		  *** 
		//		 **** 
		//		***** 
		//		# 힌트 * 앞에 공백 출력하기.

		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method3() {

		//		***** 
		//		 **** 
		//		  *** 
		//		   ** 
		//		    *

		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < row - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method4() {

		//		*****
		//		**** 
		//		*** 
		//		** 
		//		*

		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("");
			}
			for (int k = 0; k < row - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method5() {

		//			* 
		//		   *** 
		//		  ***** 
		//		 ******* 
		//		*********

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j - i > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void method6() {

		//		********* 
		//		 ******* 
		//		  ***** 
		//		   *** 
		//		    *

		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j - i > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method7() {

		//		****** 
		//		* 	 * 
		//		*    * 
		//		*    * 
		//		*    * 
		//		******

		for (int i = 0; i < 6; i++) {
			if (i == 0 || i == 5) {
				System.out.print("******");
			} else {
				for (int j = 0; j < 6; j++) {
					if (j == 0 || j == 5) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	public void method8() {
		// 1  2  3  4  5
		// 6  7  8  9  10 
		// 11 12 13 14 15
		// 16 17 18 19 20 
		// 21 22 23 24 25 
		// 출력하기 
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(5 * i + j + "\t");
			}
			System.out.println();
		}
	}

	public void method9() {
		// 1  6  11 16 21
		// 2  7  . 
		// 3 
		// 4 
		// 5  10       25
		// 출력하기 
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(1 * i + j * 5 + 1 + "\t");
			}
			System.out.println();
		}
	}

	public void method10() {
		// 1  10 11  20 21 9191
		// 2  9  12  19 22 7373
		// 3  8  13  18 23 5555
		// 4  7	 14	 17 24 3737
		// 5  6  15  16 25 1919
		// 출력하기 
		int a = 1;
		int b = 9;
		int c = 1;

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0) {
					a = i;
					System.out.print(a + " ");
				} else if (j % 2 == 1) {
					a = a + b;
					System.out.print(a + " ");
				} else if (j % 2 == 0) {
					a = a + c;
					System.out.print(a + " ");
				}
			}
			System.out.println();
			b = b - 2;
			c = c + 2;
		}
		//		
		//			for(int i=1;i<=5;i++) {
		//			System.out.print(a+" ");0
		//			System.out.print(a+b+" ");1
		//			System.out.print(a+b+c+" ");2
		//			System.out.print(a+b+c+b+" ");3
		//			System.out.print(a+b+c+b+c+" ");4
		//			System.out.println();
		//			a++;
		//			b = b -2;
		//			c = c+2;
		//			} 		
	}

	public void method11() {
		// 1  2  3  4  5
		// 10          6	
		// 11          15  
		// 20          16
		// 21          25 
		// 출력하기 
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 5; j++) {
					System.out.print(5 * i + j + "\t");
				}
			} else {
				for (int k = 5; k > 0; k--) {
					System.out.print(5 * i + k + "\t");
				}
			}

			System.out.println();
		}
	}

}
