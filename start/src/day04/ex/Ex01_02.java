package day04.ex;

/*
	문제 1 ]
		1 ~ 25의 숫자 3개를 랜덤하게 발생시켜서 
		그수들 중 가장 가장 큰 수만 출력하는 프로그램을 작성하세요.
		
*/

public class Ex01_02 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * (25-1+1)+1);
		int b = (int) (Math.random() * (25-1+1)+1);
		int c = (int) (Math.random() * (25-1+1)+1);
		
		int result = c;
		
		if(a > b) {
			if(a > c) {
				result = a;
			}
		} else if(b > a) {
			if(b > c) {
				result = b;
			} else { 
				result = result;
				}
			}
			
	

	
		System.out.println("첫번째 수 : " + a);
		System.out.println("두번째 수 : " + b);
		System.out.println("세번째 수 : " + c);
		System.out.println("제일 큰 수 : " + result);
		
	}

}
