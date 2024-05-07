package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();
	}

	public void process() {
		/*
		0 -> 가위
		1 -> 바위
		2 -> 보
		
		컴퓨터가 랜덤으로 내는 가위바위보
		내가 입력한 가위바위보를 비교해서 승패를 출력하시오
		if문 사용
		ex) 컴퓨터 : 가위, 사람 : 보, 결과 : 졌다/이겼다/비겼다
		*/
		int ran = new Random().nextInt(3);
//		System.out.println(ran);
		System.out.print("무엇을 내시겠습니까(0-가위 1-바위 2-보) : ");
		int ans = sc.nextInt();
		int sis = 0;
		int rock = 1;
		int pap = 2;
		
		if(ans == 0) {
			if(ran == 0) {
				System.out.println("컴퓨터 : 가위, 사람 : 가위, 결과 : 비겼다");
			} else if(ran == 1) {
				System.out.println("컴퓨터 : 주먹, 사람 : 가위, 결과 : 이겼다");
			} else if(ran == 2) {
				System.out.println("컴퓨터 : 보, 사람 : 가위, 결과 : 졌다");
			}
		}
		if(ans == 1) {
			if(ran == 1) {
				System.out.println("컴퓨터 : 주먹, 사람 : 주먹, 결과 : 비겼다");
			} else if(ran == 2) {
				System.out.println("컴퓨터 : 가위, 사람 : 주먹, 결과 : 이겼다");
			} else if(ran == 0) {
				System.out.println("컴퓨터 : 보, 사람 : 주먹, 결과 : 졌다");
			}
		}
		if(ans == 2) {
			if(ran == 2) {
				System.out.println("컴퓨터 : 보, 사람 : 보, 결과 : 비겼다");
			} else if(ran == 1) {
				System.out.println("컴퓨터 : 주먹, 사람 : 보, 결과 : 이겼다");
			} else if(ran == 0) {
				System.out.println("컴퓨터 : 가위, 사람 : 보, 결과 : 졌다");
			}
		}
	}
}
