package day18.self;

public class Test11 {

	public Test11() {
		Name t1 = new Name("리사");
		Name t2 = new Name();
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test11();
	}
}

class Name extends Thread {
	
	public Name() {
		super("\t\t\t제니");
		
	}
	public Name(String name) {
		super(name);
		
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			Thread t = Thread.currentThread();
			String name = t.getName();
			System.out.println(name + " 가 " + (i + 1) + " 번째 노래를 합니다.");
		}
	}
	
}