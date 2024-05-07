package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork15 {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork15 obj = new HomeWork15();
		obj.process();
	}

	public void process() {
		Calendar cal = Calendar.getInstance();
		int month = 0;
		
		while(true) {
			// < 이전달     다음달>
	
	
			
			//달 입력
			System.out.println("입력");
			String str = sc.next();
			if (str.equals(">")) {
				cal.add(month, 1);
			}
			else if (str.equals("<")) {
				cal.add(month, -1);
			}
			else {
				month = Integer.parseInt(str);
			}
			//첫날의 요일 구하기
			cal.set(Calendar.DATE, 1);
			int day = cal.get(Calendar.DAY_OF_WEEK);
			
			for (int i = 1; i < day; i++) {
				System.out.print("\t");
			}
			//출력
			System.out.println("--------------------"+cal.get(Calendar.YEAR)+"년" + (cal.get(Calendar.MONTH)+1)+"-----------------------");
			System.out.println("<이전달\t\t\t\t\t다음달>");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("----------------------------------------------");

			//입력달 마지막일
			int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			for (int i = 1; i <= lastDay; i++) {
				int weekDay = cal.get(Calendar.DAY_OF_WEEK);
				System.out.print(i+"\t");
				if (weekDay == 7) {
					System.out.println();	
				}
				if(i != lastDay) cal.add(Calendar.DATE, 1);
				
			}
//			System.out.println();
//			System.out.println("----------------------------------------------");
//			String str = sc.next();
			if(str.equals("<")) cal.add(Calendar.MONTH, -1);
			if(str.equals(">")) cal.add(Calendar.MONTH, 1);
		}
	}
}
