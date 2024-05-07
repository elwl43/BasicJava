package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class HomeWork18 {
	public static void main(String[] args) {
		HomeWork18 hw = new HomeWork18();
		hw.process();
	}
	public void process() {
		printHistoGram(10000);
	}
	
	// 주사위 한개
	public int oneDice() {
//		int ran = new Random().nextInt(6) + 1;
//		return ran;
		return new Random().nextInt(6) + 1;
	}
	public int twoDice() {
		return oneDice() + oneDice();
	}
	public Map trialNtimes(int n) {
//		Map<Integer, Integer> map = new HashMap();
//		for(int i=1; i<=n; i++) {
//			// key:주소, value:주소값의 값
//			map.put(i, twoDice());
		Map<Integer, Integer> resultMap = new HashMap();
		for(int i=0;i<n;i++) {
			int number = twoDice();
			int count = 1;
			if(resultMap.containsKey(number)) count += resultMap.get(number);
			resultMap.put(number, count);
		}
		return resultMap;
	}
	public void printHistoGram(int num) {
		Map<Integer, Integer> resultMap = trialNtimes(num);
		
		// 각 시행 횟수의 % 만큼 출력하시오
		for(int i=2; i<= 12; i++) {
			int count = resultMap.get(i);
//			System.out.println(i+"\t"+count);
			System.out.print(i+"\t");
			for(int j=0; j<count*100/num; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
		
//		for(int i=2; i<=12; i++) {
//			System.out.print(i);
//			int cnt = 0;
//			for(int j=1; j<=num; j++) {
//				//System.out.println(resultMap.get(j));
//				if(resultMap.get(j) == i) { 
//					cnt++;
//					if(cnt%100 == 0) {
//						System.out.print("■");
//					}
//				}
//			}
//		System.out.println();	
//		}
	}
}