package day04.ex;

/*
 	문제 1 ]
 		1 ~ 25의 숫자 3개를 랜덤하게 발생시켜서 
 		그수들 중 가장 가장 큰 수만 출력하는 프로그램을 작성하세요.
 		
 		단, 3항 연산자를 사용해서 처리하세요
 		
 	
 */
public class Ex01 {
	public static void main(String[] args) {
		//할일
			// 숫자 랜덤하게 발생
		int a = (int) (Math.random() * ( 25 - 1 + 1) +1);
		int b = (int) (Math.random() * ( 25 - 1 + 1) +1);
		int c = (int) (Math.random() * ( 25 - 1 + 1) +1);
		
			// 큰수 
		int num = (a > b) ? ((a > c) ? (a) : (c)) : ((b < c) ? (c) : (b));
		
			// 출력
		System.out.println("첫번째 숫자 : " + a + "입니다.");
		System.out.println("두번째 숫자 : " + b + "입니다.");
		System.out.println("세번째 숫자 : " + c + "입니다.");
		
		System.out.println("가장 큰 숫자는 : " + num + "입니다.");
		
	}
	//() ? () : ()

}
