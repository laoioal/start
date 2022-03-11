package day09.ex;

/*
 	문제 3 ]
 		사각형의 넓이를 계산하는 프로그램을 작성하세요
 		
 		길이를 랜덤하게 만들어주는 함수
 		넓이를 계산해주는 함수
 		사각형의 내용을 출력해주는 함수
 		
 */

public class Ex03 {
	int garo;
	int sero;
	

	
	
	public Ex03() {
	garo =	setGaro();
	sero =	setSero();
		int area = area(garo, sero);
		toPrint(garo, sero, area);
		
	}

	public static void main(String[] args) {
		new Ex03();

	}
	
	// 가로를 생성
	public int setGaro() {
		garo = (int) (Math.random() * 45 + 1);
		return garo;
	}
	
	// 세로를 생성
	public int setSero() {
		sero = (int) (Math.random() * 45 + 1);
		
		return sero;
	}

	// 넓이를 계산
	public int area(int a, int b) {
		int area = a * b;
		return area;
	}
	
	// 내용을 출력
	public void toPrint(int a, int b, int c) {
		System.out.print("가로 : " + a + ", 세로 : " + b + "인 사각형의 넓이는 : " + c + " 입니다.");
	}
	
}
