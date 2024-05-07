package kr.or.ddit.study06.sec06;

public class SingMain {
	public static void main(String[] args) {
		Sing s1 = new Sing();
		s1.setTitle("인사");
		s1.setLyrics("안녕 멀어지는 나의 하루야\r\n" +	"빛나지 못한 나의 별들아");
		s1.setPubYear("2021");
		s1.setSinger("범진");
		
		System.out.println("제목 : " + s1.getTitle() + "\t가수 : " + s1.getSinger() + "\t발매년도 : " + s1.getPubYear());
		System.out.println(s1.getLyrics());
	}
}
