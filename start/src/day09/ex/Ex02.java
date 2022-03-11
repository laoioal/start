package day09.ex;

/*
 	문제 2]
 		반지름 하나를 랜덤하게 입력한 후
 		원의 넓이
 		원의 둘레
 		를 계산해서
 		출력하는 프로그램을 작성하세요
 	
 		반지름 랜덤하게 만들어주는 함수
 		넓이 계산함수, 둘레 계산함수, 출력을 해주는 함수
 		를 각각 만들어서 작성하세요
 		
 		
 */

public class Ex02 {
	public Ex02() {
		int no1 = cir();
		
		double area = area(no1);
		
		double dool = dool(no1);
		
		toPrint(no1, area, dool);
		
	}
	
	

	public static void main(String[] args) {
		new Ex02();

	}

	// 반지름 만들어주는 함수
	
	public int cir() {
		int no = (int) (Math.random() * 100 + 1);
		
		return no;
		
	}
	
	// 원의 넓이 계산
	public double area(int a) {
		double area = a * a * 3.14;
		
		return area;
	}
	
	// 원의 둘레 계산
	public double dool(int a) {
		double dool = a * 2 * 3.14;
		
		return dool;
	}
	
	// 출력
	public void toPrint(int a, double b, double c) {
		System.out.print("반지름이 " + a + " 인 원의 넓이는 " + b + " 이고 원의 둘레는 " + c + "이다.");
	}
	
}
