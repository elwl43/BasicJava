package kr.or.ddit.study07.sec01;

public class PenMain {
	public static void main(String[] args) {
		Ballpen ballpen = new Ballpen();
		ballpen.setAmount(10);
		ballpen.setColor("red");

		System.out.println(ballpen.getAmount() + "," + ballpen.getColor());

	}
}
