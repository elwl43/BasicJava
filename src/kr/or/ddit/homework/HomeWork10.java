package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork10 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork10 obj = new HomeWork10();
		obj.process();
	}

	public void process() {
		Student[] stuList = new Student[100];
		int cur = 0;
		while(true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 전체 출력");
			System.out.println("3. 종료");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("지역, 이름, 나이 입력 : ");
				String region = sc.next();
				Student stu;
				
				if(region.equals("대전")) { // stu에 내가 만든 생성자 저장
					// 지역을 입력 받고 지역이 대전이라면 
					// 파라미터 "이름", "나이" 인 생성자
					
					String name = sc.next();
					int age = sc.nextInt();
					
					stu = new Student(name, age);
					
//					System.out.println(stu);
				}else {
					// 지역이 대전이 아니라면 "지역", "이름", "나이"인 생성자 호출
					String name = sc.next();
					int age = sc.nextInt();
					
					stu = new Student(region, name, age);
				}
				stuList[cur++] = stu;
			}
			
			
			if(sel == 2) {
				for(int i=0; i<cur; i++) {
					System.out.println(stuList[i]);
				}
			}
			if(sel == 3) break;
		}
	}
}

class Student{
	// 나라, 지역, 이름, 나이 필드
	String country;
	String region;
	String name;
	int age;
	
	public Student() {
		
	}
	
	// 지역이 대전일 경우 생성자?
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.country = "대한민국";
		this.region = "대전";
//		this("대한민국", "대전", name, age");
	}
	
	// 지역이 대전이 아닐 경우 생성자?
	public Student(String region, String name, int age) {
		this.region = region;
		this.name = name;
		this.age = age;
		this.country = "대한민국";
//		this("대한민국", region, name, age);
	}
//	public Student(String country, String region, String name, int age) {
//		this.country = country;
//		this.region = region;
//		this.name = name;
//		this.age = age;
//	}
	
	// toString 메소드 만들기
	
	@Override
	public String toString() {
		return "Student [country=" + country + ", region=" + region + ", name=" + name + ", age=" + age + "]";
	}
}
