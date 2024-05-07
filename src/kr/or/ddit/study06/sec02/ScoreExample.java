package kr.or.ddit.study06.sec02;

public class ScoreExample {
	public static void main(String[] args) {
		// 2명의 score 객체를 생성하고 국영수 값을 각각 넣어보시오
		Score score1 = new Score();
		Score score2 = new Score();
		
		score1.kor = 90;
		score1.eng = 84;
		score1.math = 94;
		
		score2.kor = 80;
		score2.eng = 71;
		score2.math = 33;
		
		score1.avg = (score1.kor+score1.eng+score1.math)/3.0;
		score2.avg = (score2.kor+score2.eng+score2.math)/3.0;

		System.out.println("국 : "+score1.kor + " 영 : "+score1.eng+" 수 : " + score1.math + " 평균 : " + score1.avg);
		System.out.println("국 : "+score2.kor + " 영 : "+score2.eng+" 수 : " + score2.math + " 평균 : " + score2.avg);
//		System.out.println("score1 의 평균값 : " + score1.avg);
//		System.out.println("score1 의 평균값 : " + score2.avg);
	}
}
