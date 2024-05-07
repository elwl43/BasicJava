package kr.or.ddit.study06.sec02;

public class TvExample {
	public static void main(String[] args) {
		Tv tv1 = new Tv(); // 스택 : Tv tv1 = 100 주소값 / 힙 : 100 : company = LG, size = 60
		tv1.company = "LG";
		tv1.size = 60;
		
		System.out.println("회사 : " + tv1.company + " 화면 크기 : " + tv1.size);
		
		Tv tv2 = new Tv(); // 힙 : 200 : company = 삼성, size = 65
		tv2.company = "삼성";
		tv2.size = 65;

		System.out.println("회사 : " + tv2.company + " 화면 크기 : " + tv2.size);
	}
}
