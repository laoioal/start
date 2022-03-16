package day13;

public class Test10 {

	public Test10() {
		Test1001 t01 = new Test1001();
		// 함수 호출
		
		try {
			t01.abc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 예외를 전이하는 함수는 호출하는 곳에서 예외처리를 반드시 해줘야 한다.
		
		
	}

	public static void main(String[] args) {
		new Test10();
	}

}
