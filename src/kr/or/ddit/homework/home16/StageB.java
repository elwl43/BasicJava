package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class StageB extends Stage {
	public int game(int result) {
		Scanner sc = new Scanner(System.in);
		int ran = new Random().nextInt(3);
		System.out.println(ran);
		System.out.print("무엇을 내시겠습니까(0-가위 1-바위 2-보) : ");
		int ans = sc.nextInt();
		
		if(ans == 0) {
			if(ran == 0 || ran == 1) {
				System.out.println("졌다");
				result = 0;
			} else if(ran == 2) {
				System.out.println("이겼다");
				result = 1;
			}
		}
		if(ans == 1) {
			if(ran == 1 || ran == 2) {
				System.out.println("졌다");
				result = 0;
			} else if(ran == 0) {
				System.out.println("이겼다");
				result = 1;
			}
		}
		if(ans == 2) {
			if(ran == 2 || ran == 0) {
				System.out.println("졌다");
				result = 0;
			} else if(ran == 1) {
				System.out.println("이겼다");
				result = 1;
			}
		}
		return result;
	}
	
	public int gameMoney(int result, int money) {
//		int win = 0;
		money -= 6000;
		if(result == 1) money += 20000;
		System.out.println(money);
		return money;
	}
	
	
}
