package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		HomeWork17 obj = new HomeWork17();
		obj.process();
	}

	public void process() {
		while(true) {
			System.out.println("1. 회원 가입.");
			System.out.println("2. 회원 탈퇴.");
			System.out.println("3. 정보 수정.");
			System.out.println("4. 회원 전체 정보 출력.");
			int sel = sc.nextInt();
			if(sel==1) {
				addMember();
			}
			if(sel==2) {
				removeMember();
			}
			if(sel==3) {
				updateMember();
			}
			if(sel==4) {
				printMemberList();
			}
		}
	}
	
	int cur = 0;
	Member[] memList = new Member[100];

	public void addMember() {
		// id 입력시 4~8자 입력 받을것.
		String id; 
		while(true) {
			try {
				System.out.println("아이디를 입력해주세요");
				id = sc.next();
				idCheck(id);
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
				continue;
			}
		}
		
		// pass 입력시 4~8자 입력 
		String pass;
		while(true) {
			pass = sc.next();
			try {
				System.out.println("비밀번호를 입력해주세요");
				pass = sc.next();
				passCheck(pass);
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
				continue;
			}
		}
		
		String name;
		while(true) {
			name = sc.next();
			try {
				System.out.println("이름을 입력해주세요");
				name = sc.next();
				nameCheck(name);
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
				continue;
			}
		}
		
		String nickName;
		while(true) {
			nickName = sc.next();
			try {
				System.out.println("닉네임을 입력해주세요");
				nickName = sc.next();
				nickNameCheck(nickName);
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
				continue;
			}
		}
		
		int age;
		while(true) {
			age = sc.nextInt();
			try {
				System.out.println("나이를 입력해주세요");
				age = sc.nextInt();
				ageCheck(age);
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
				continue;
			}
		}
		
	}
	
	public void idCheck(String id) throws Exception {
		if(id.length() <4 || id.length() > 8) {
			throw new Exception("아이디를 4~8자로 입력해주세요.");
		}
	}
	public void passCheck(String pass) throws Exception {
		if(pass.length() <4 || pass.length() > 8) {
			throw new Exception("비밀번호를 4~8자로 입력해주세요.");
		}
	}
	public void nameCheck(String name) throws Exception {
		if(name.length() < 2 || name.length() > 5) {
			throw new Exception("이름을 2~5자로 입력해주세요");
		}
	}
	public void nickNameCheck(String nickName) throws Exception {
		String str = "개새";
		if(nickName.length() < 2 || nickName.length() > 8 ) {
			throw new Exception("닉네임을 2~8자로 입력해주세요.");
		}
		if(str.contains("개새")) {
			System.out.println("부적절한 단어가 포함되어있습니다.");
		}
	}
	public void ageCheck(int age) throws Exception {
		try {
			int int_age = sc.nextInt();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	public void removeMember() {
//		Mem[] temp = new Mem[100];
//		printMemberList();
//		System.out.println("삭제할 회원 번호를 입력하세요 : ");
//		int num = sc.nextInt();
//		int add = 0;
//		
//		for(int i = 0; i < cur; i++) {
//			if(i==num) add++;
//			temp[i] = memList[i+add];
//		}
//		memList = temp;
//		cur--;
//		printMemberList();
	}
	

	public void updateMember() {
		printMemberList();

//		Mem m1 = new Mem();
		System.out.print("수정할 회원 번호 입력.");
		int num = sc.nextInt();
//		Mem mem = memList[num];
		/*
		 * 정보 수정.
		 */
		
//		System.out.println("수정한 아이디를 입력해주세요 : ");
//		String id = sc.next();
//
//		System.out.println("수정한 비밀번호를 입력해주세요 : ");
//		String pass = sc.next();
//
//		System.out.println("수정한 이름을 입력해주세요 : ");
//		String name = sc.next();
//
//		System.out.println("수정한 나이를 입력해주세요 : ");
//		int age = sc.nextInt();
//
//		mem.setId(id);
//		mem.setPass(pass);
//		mem.setName(name);
//		mem.setAge(age);
//		printMemberList();
	}
	
	public void printMemberList() {
		System.out.println("회원번호\t아이디\t비밀번호\t이름\t나이");
		for (int i = 0; i < cur; i++) {
			Member mem = memList[i];
			// get 메소드를 이용해서 출력
			System.out.println(i + "\t" + mem.getId() + "\t" + mem.getPass() + "\t" + mem.getName() + "\t" + mem.getAge());

			System.out.println(i+"\t"+mem);
		}
	}

	
}

class Member{
	private String id;
	private String pass;
	private String name;
	private String nickName;
	private int age;
	
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}