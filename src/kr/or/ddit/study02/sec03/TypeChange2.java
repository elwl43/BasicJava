package kr.or.ddit.study02.sec03;

public class TypeChange2 {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 86;
		int math = 80;

		// 총점과 평균
		int sum = kor + eng + math;
		double avg = sum / 3.0;

		System.out.println("총점 : " + sum + ", 평균: " + avg);

	}
}