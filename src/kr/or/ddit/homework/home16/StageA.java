package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class StageA extends Stage{
	public int game(int result) {
		Scanner sc = new Scanner(System.in);
		System.out.print("무엇을 내시겠습니까(홀or짝) : ");
		String sel = sc.next();
		
		Random random = new Random();
		
		int ran = new Random().nextInt(2);
		
		if(sel.equals("홀")) {
			if(ran %2 == 0) {
				System.out.println("승리");
				result = 1;
			}
			else {
				System.out.println("패배");
				result = 0;
			}
		}
		if(sel.equals("짝")) {
			if(ran %2 == 0) 
				{
				System.out.println("패배");
				result =  0;
				}
			else 
				{
				System.out.println("승리");
				result =  1;
				}
		}
		return result;
	}
	public int gameMoney(int result, int money) {
//		int win = 0;
//		게임비 2000 보상 4000
		money -= 2000;
		if(result == 1) money += 4000;
		System.out.println(money);
		return money;
	}
}
