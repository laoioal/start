package day14.ex;

/*
 	문제 2 ]
 		사각형의 정보를 기억하는 클래스 Nemo를 제작하세요
 		필요한 변수와 함수, 생성자는 필요한 만큼 추가하고
 		단, 가로와 세로가 동시에 같은 사각형만 같은 사각형으로 처리가 되도록
 		equals() 함수를 오버라이드 하세요
 		이 클래스 객체를 출력하면 내용이 출력되도록 toString() 을 오버라이드 하세요
 */

public class Ex02 {
	
	

	public Ex02() {
		
		Ex02Squ squ1 = new Ex02Squ(10, 10);
		Ex02Squ squ2 = new Ex02Squ(10, 20);
		
		String result = (squ1.equals(squ2)) ? "같은" : "다른";
		
		System.out.println("사각형 squ1과 squ2는 " + result + " 사각형입니다.");
		System.out.println("squ1 : /n/t" + squ1);
		System.out.println("squ2 : /n/t" + squ2);
		
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
