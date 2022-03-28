package day18.self;

/*
 	Runnable 인터페이스를 구현한 스레드 프로그램을 만들어보자.
 */

public class Test10 {

	public Test10() {
		Rb rb = new Rb();
		It it = new It();
		
		Thread t1 = new Thread(rb);
		Thread t2 = new Thread(it);
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
	new Test10();
	}

}

class It implements Runnable {

	@Override
	public void run() {
		quest();
	}
	
	public void quest() {
		for(int i = 0; i < 100; i++) {
			System.out.println("*** io 내가 " + (i + 1) + " 번쨰 질문을 합니다.");
		}
	}
	
	
}

class Rb implements Runnable {

	@Override
	public void run() {
		answer();
	}
	
	public void answer() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t\t\t### 선생님이 " + (i + 1) + " 번째 대답을 합니다.");
		}
	}
	
}
