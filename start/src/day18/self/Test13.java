package day18.self;

public class Test13 {

	public Test13() {
		Skyab sk = new Skyab();
		Yong yo = new Yong();
		
		Thread t1 = new Thread(sk);
		Thread t2 = new Thread(yo);
		
		t1.start();
		t2.start();
		
	}

	public static void main(String[] args) {
	new Test13();
	}

}

class Skyab implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("자바를 " + (i + 1) + "번째 코딩합니다.");
			try{
				Thread.sleep(100);
			} catch(Exception e) {
				
			}
			
		}
	}
	
}
class Yong implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t\t\t" + (i + 1) + "번째 복습을 합니다.");
			try{
				Thread.sleep(100);
			} catch(Exception e) {
				
			}
			
		}
	}
	
}