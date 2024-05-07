package kr.or.ddit.homework;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.sun.xml.internal.ws.api.pipe.NextAction;

public class HomeWork14 {
	static Scanner sc = new Scanner(System.in);
	Mem[] memList = new Mem[100];
	int cur = 0;

	public static void main(String[] args) {
		HomeWork14 h14 = new HomeWork14();
		while (true) {
			System.out.println("1. 회원 가입.");
			System.out.println("2. 회원 탈퇴.");
			System.out.println("3. 정보 수정.");
			System.out.println("4. 회원 전체 정보 출력.");
			int sel = sc.nextInt();
			if (sel == 1) {
				h14.addMember();
			}
			if (sel == 2) {
				h14.removeMember();
			}
			
			if (sel == 3) {
				h14.updateMember();
			}
			if (sel == 4) {
				h14.printMemberList();
			}
		}
	}

	public void addMember() {
//		id, pass, name, age
		System.out.println("아이디를 입력해주세요 : ");
		String id = sc.next();

		System.out.println("비밀번호를 입력해주세요 : ");
		String pass = sc.next();

		System.out.println("이름을 입력해주세요 : ");
		String name = sc.next();

		System.out.println("나이를 입력해주세요 : ");
		int age = sc.nextInt();

		Mem m1 = new Mem();
		m1.setId(id);
		m1.setPass(pass);
		m1.setName(name);
		m1.setAge(age);

		memList[cur++] = m1;
		printMemberList();
	}
	
	public void removeMember() {
		Mem[] temp = new Mem[100];
		printMemberList();
		System.out.println("삭제할 회원 번호를 입력하세요 : ");
		int num = sc.nextInt();
		int add = 0;
		
		for(int i = 0; i < cur; i++) {
			if(i==num) add++;
			temp[i] = memList[i+add];
		}
		memList = temp;
		cur--;
		printMemberList();
	}

	/*
	 * 회원 전체 정보 출력하기.
	 */
	public void printMemberList() {
		System.out.println("회원번호\t아이디\t비밀번호\t이름\t나이");
		for (int i = 0; i < cur; i++) {
			Mem mem = memList[i];
			// get 메소드를 이용해서 출력
			System.out.println(i + "\t" + mem.getId() + "\t" + mem.getPass() + "\t" + mem.getName() + "\t" + mem.getAge());

//			System.out.println(i+"\t"+mem);
		}
	}

	/*
	 * 회원 정보 수정하기.
	 */

	public void updateMember() {
		/*
		 * 회원 전체 정보 출력하기.
		 */
		printMemberList();

//		Mem m1 = new Mem();
		System.out.print("수정할 회원 번호 입력.");
		int num = sc.nextInt();
		Mem mem = memList[num];
		/*
		 * 정보 수정.
		 */
		
		System.out.println("수정한 아이디를 입력해주세요 : ");
		String id = sc.next();

		System.out.println("수정한 비밀번호를 입력해주세요 : ");
		String pass = sc.next();

		System.out.println("수정한 이름을 입력해주세요 : ");
		String name = sc.next();

		System.out.println("수정한 나이를 입력해주세요 : ");
		int age = sc.nextInt();

		mem.setId(id);
		mem.setPass(pass);
		mem.setName(name);
		mem.setAge(age);
		printMemberList();
	}
}

class Mem {
	private String id;
	private String pass;
	private String name;
	private int age;

	/*
	 * 생성자 사용x getter setter 이용할것.
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
