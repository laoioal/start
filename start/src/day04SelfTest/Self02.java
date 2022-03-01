package day04SelfTest;

/*
	문제 1 ]
		1 ~ 25의 숫자 3개를 랜덤하게 발생시켜서 
		그수들 중 가장 가장 큰 수만 출력하는 프로그램을 작성하세요.
		
		단, 3항 연산자를 사용해서 처리하세요
		
	
*/

public class Self02 {
	
	public static void main(String[] args) {
		// 랜덤한 숫자 발생
		int a = (int) (Math.random() * (25 - 1 + 1) + 1);
		int b = (int) (Math.random() * (25 - 1 + 1) + 1);
		int c = (int) (Math.random() * (25 - 1 + 1) + 1);
		
		int result = (a > b) ? ( (a > c) ? (a) : (c) ) : ( (b < c) ? (c) : (b) );
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(result);
		
	}

}
