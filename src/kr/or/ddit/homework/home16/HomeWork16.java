package kr.or.ddit.homework.home16;

import java.util.Scanner;

public class HomeWork16 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork16 obj = new HomeWork16();
		obj.process();
	}

	public void process() {
		/*
		 *   Stage class를 만들고
		 *   
		 *   game() , gameMoney();
		 *   
		 *   
		 *   StageA StageB StageC 에 상속 받으시오.
		 *   
		 *   StageA 홀짝 게임  
		 *   게임비 2000 보상 4000 
		 *   
		 *   StageB 가위바위보 
		 *   게임비 6000 보상 20000
		 *   
		 *   StageC 주사위 숫자 맞추기 게임
		 *   게임비 1만 보상 100000 
		 *   
		 */
		int money = 10000;
		int result = 0;
		
		while(money<200000) {
			System.out.println("1. Stage A");
			System.out.println("2. Stage B");
			System.out.println("3. Stage C");
			System.out.print("선택>>");
			
			int sel = sc.nextInt();
			Stage stage = null; 
			
			/*
			 *  완성 하시오.
			 */
			if(sel == 1) stage = new StageA();
			if(sel == 2) stage = new StageB();
			if(sel == 3) stage = new StageC();
			
//			int gameMoney = stage.gameMoney();
//			if(gameMoney > money) {
//				System.out.println("보유금액 : " + money + "게임 금액 : " + gameMoney);
//				System.out.println("보유금액이 모자릅니다.");
//				continue;
//			}
//			money -= gameMoney;
//			money += stage.game();
//			if(money == 0) {
//				System.out.println("파산");
//				break;
//			}
			result = stage.game(result);
			stage.gameMoney(result, money);
		}
		
	}
}
