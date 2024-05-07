package kr.or.ddit.homework_test;


import java.util.Scanner;

public class test2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		test2 obj = new test2();
		obj.process();
	}

	public void process() {
		String[] stuName = {"고현", "권협", "이준", "리오", "새별"};
		// 국 영 수 총점 평균 등수
		int[][] score = 
		{{80, 70, 63, 0, 0, 1}, // 총점 213, 평균 71
		 {90, 85, 90, 0, 0, 1}, // 총점 265, 평균 88
		 {90, 70, 75, 0, 0, 1}, // 총점 235, 평균 78
		 {65, 75, 70, 0, 0, 1}, // 총점 210, 평균 70
		 {77, 80, 70, 0, 0, 1}, // 총점 227, 평균 75
		};
		
		// 1. 총점/평균 계산
		for(int i=0; i<score.length; i++) {
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			score[i][4] = score[i][3]/3;
//			System.out.println("총점 : " + score[i][3]);
//			System.out.println("평균 : " + score[i][4]);
		}
		
		// 2. 등수 구하기
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length-1; j++) {
				if(score[i][4]<score[j][4]) {
					score[i][5]++;
				}
			}
		}
		
		
		// 3. 출력
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수");
		System.out.println("====================================================");
		for(int i=0; i<score.length; i++) {
			System.out.print(stuName[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		// 4. 정렬 후 출력 하기(버블정렬)
		
		
	}
}
