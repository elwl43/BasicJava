package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();
	}

	public void process() {
		Score s1 = new Score();
		// 값 입력
		s1.name = "고현";
		s1.kor = 80;
		s1.eng = 70;
		s1.math = 63;

		Score s2 = new Score();
		s2.name = "권협";
		s2.kor = 90;
		s2.eng = 85;
		s2.math = 90;

		Score s3 = new Score();
		s3.name = "이준";
		s3.kor = 90;
		s3.eng = 70;
		s3.math = 75;

		Score s4 = new Score();
		s4.name = "리오";
		s4.kor = 65;
		s4.eng = 75;
		s4.math = 70;

		Score s5 = new Score();
		s5.name = "새별";
		s5.kor = 77;
		s5.eng = 80;
		s5.math = 70;
//		System.out.println(scores);
		Score[] scores = { s1, s2, s3, s4, s5 };

		// 1. 총점/평균
		for (int i = 0; i < scores.length; i++) {
			scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
			scores[i].avg = (scores[i].kor + scores[i].eng + scores[i].math) / 3;
		}
		
//		for(Score s: scores) { 		// 향상된 for문 사용
//			s.sum = s.kor+s.eng+s.math;
//			s.avg = s.sum/3.0;
//		}

		// 2. 등수 구하기
//		for(int i=0; i<scores.length; i++) {
//			for(int j=0; j<scores.length; j++) {
//				if(scores[i].sum < scores[j].sum) {
//					scores[i].rank++;
//				}
//			}
//		}
//		int rank = 1;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				if(scores[i].avg < scores[j].avg)
				scores[i].rank++;
//				rank++;
			}
		}

		// 3. 출력
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}

		// 4. 정렬
//		Arrays.sort(scores[i]); // 이렇게하면 왜 안되는거지
		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = 0; j < scores.length - 1; j++) {
				if (scores[j].avg < scores[j + 1].avg) {
					Score temp = scores[j]; // 왜 temp의 타입이 int가 아니라 Score인거지
					scores[j] = scores[j + 1];
					scores[j + 1] = temp;
				}
			}

		}
		// 5. 출력
		
		System.out.println();
		for (int i = 0; i < scores.length; i++) {

			System.out.println(scores[i]);
		}
		
	}
}

class Score {
	// 이름. 국, 영, 수, 총점, 평균, 등수
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank=1;
	// toString 만들기

	@Override
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + rank;
	}
}
