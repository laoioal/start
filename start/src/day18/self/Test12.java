package day18.self;

public class Test12 {

	public Test12() {
		jennie je = new jennie();
		Lisa li = new Lisa();
		
		je.start();
		li.start();
		
	}

	public static void main(String[] args) {
	new Test12();
	}

}

class jennie extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Jennie가 " + (i + 1) + "번째 노래를 합니다.");
			
			yield();
		}
	}
}
class Lisa extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t\t\tLisa가 " + (i + 1) + "번째 노래를 합니다.");
			yield();
		}
	}
}