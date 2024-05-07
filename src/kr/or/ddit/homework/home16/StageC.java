package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class StageC extends Stage {
	public int game(int result) {
		Scanner sc = new Scanner(System.in);
		int ran = new Random().nextInt(6) + 1;
		System.out.println(ran);
		System.out.print("무엇을 내시겠습니까(1~6) : ");
		int ans = sc.nextInt();
//		int a0 = 0;
//		int a1 = 1;
//		int a2 = 2;
//		int a3 = 3;
//		int a4 = 4;
//		int a5 = 5;

		if (ran != ans) {

			System.out.println("졌다");
			result = 0;
		} else {
			System.out.println("이겼다");
			result = 1;
		}

		return result;
	}
	public int gameMoney(int result, int money) {
//		int win = 0;
//		게임비 2000 보상 4000
		money -= 10000;
		if(result == 1) money += 100000;
		System.out.println(money);
		return money;
	}
}
