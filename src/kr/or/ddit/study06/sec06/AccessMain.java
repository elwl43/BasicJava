package kr.or.ddit.study06.sec06;

public class AccessMain {
	public static void main(String[] args) {
		AccessPrivate ap = new AccessPrivate();
		
		AccessDefault as = new AccessDefault();
		int a = as.a;
		as.defaultMethod1();
		
		AccessPrivate ap2 = new AccessPrivate();
		int a2 = as.a;
		
		AccessProtect ap3 = new AccessProtect();
		int a3 = ap3.a;
//		ap3.publicMethod();
	}
}
