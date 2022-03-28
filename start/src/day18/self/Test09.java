package day18.self;

/*
 	스레드 프로그램을 실행해보자.
 	
 	1. 스레드 프로그램은 반드시 New Born 상태로 만들어야 한다.
 	
 		New born 상태란?
 		실행 가능한 프로그램으로 만든다는 의미
 		==> 자바에서는 new 시키는 것이다.
 */

public class Test09 {

	public Test09() {
		Yh yh = new Yh();
		Aa aa = new Aa();
		
		yh.start();
		aa.start();
	}

	public static void main(String[] args) {
	new Test09();
	}

}

class Yh extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("#### 내가 코딩을 합니다! : " + (i + 1 + "회차"));
		}
	}
	
}

class Aa extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t\t\t*** 개가 " + (i + 1) + "번째 스트레칭을 합니다.");
		}
	}
}