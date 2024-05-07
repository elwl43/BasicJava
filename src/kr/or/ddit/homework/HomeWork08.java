package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}

	public void process() {
		String[] stuName = {"고현", "권협", "이준", "리오", "새별"};
		// 국 영 수 총점 평균 등수
		int[][] score = 
		{{80, 70, 63, 0, 0, 1},
		 {90, 85, 90, 0, 0, 1},
		 {90, 70, 75, 0, 0, 1},
		 {65, 75, 70, 0, 0, 1},
		 {77, 80, 70, 0, 0, 1},
		};
		
		// 1. 총점/평균 계산
		
		for(int i=0; i<score.length; i++) {
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			score[i][4] = score[i][3]/3;
			}
				
		// 2. 등수 구하기
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length-1; j++) {
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}
		}
		
		// 3. 출력
		System.out.println("이름\t국\t영\t수\t총점\t평균\t등수");
		System.out.println("===================================================");
		for(int i=0; i<score.length; i++) {
			System.out.print(stuName[i]+": \t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		// 4. 정렬 후 출력 하기(버블정렬)
//		System.out.println("===================================================");
//		System.out.println("이름\t국\t영\t수\t총점\t평균\t등수");
		for(int i=0; i<score.length-1; i++) {
			for(int j=0; j<score.length-1; j++) {
				if(score[j][3] < score[j+1][3]) {
					int[] temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
					
					String tempS = stuName[j];
					stuName[j] = stuName[j+1];
					stuName[j+1] = tempS;
				}
			}
		}
		System.out.println("===================================================");
		System.out.println("이름\t국\t영\t수\t총점\t평균\t등수");
		for(int i=0; i<score.length; i++) {
			System.out.print(stuName[i]+": \t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
//		for(int i=0; i<score.length; i++) {
//			System.out.print(stuName[i]+": \t");
//			for(int j=0; j<score[i].length; j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
	}
}
