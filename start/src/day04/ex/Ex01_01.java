package day04.ex;

/*
	문제 1 ]
		1 ~ 25의 숫자 3개를 랜덤하게 발생시켜서 
		그수들 중 가장 큰 수, 중간수, 작은수를 구분해서 출력하는 프로그램을 작성하세요.
		
		단, 3항 연산자를 사용해서 처리하세요
		
	
*/

public class Ex01_01 {

	public static void main(String[] args) {
		
		
		//랜덤한 정수 생성
		int num1 = (int) (Math.random() * (25 -1 +1) + 1);
		int num2 = (int) (Math.random() * (25) + 1);
		int num3 = (int) (Math.random() * (25) + 1);
		
		//숫자 비교
		int result1 = (num1 > num2) ? (
				(num1 > num3) ? (num1) : (num3)
				) : ( 
						(num2 > num3) ? (num2) : (num3)
						);
		
		int result2 = (num1 > num2) ? (
				(num1 < num3) ? (num1) : ((num2 > num3) ? (num2) : (num3))  
						) : (
							(num2 > num3) ? ((num1 > num3) ? (num1) :(num3) ) : (num2));

		int result3 = (num1 > num2) ? (
				(num2 > num3) ? (num3) : (num2)
				) : (
						(num1 > num3) ? (num3) : (num1)
						);
				
		System.out.println("나온 수" + num1);		
		System.out.println("나온 수" + num2);
		System.out.println("나온 수" + num3);
				
		System.out.println("가장 큰수 : " + result1);
		System.out.println("중간수 : " + result2);		
		System.out.println("작은수 : " + result3);

	}

}
