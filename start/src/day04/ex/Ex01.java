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
			// 숫자 정수 3개 발생시킨다.
		int a = (int) (Math.random() * ( 25 - 1 + 1) +1);
			// 보너스 문제 :  -100 ~ 100사이의 정수를 랜덤하게 발생시켜보세요
		int b = (int) (Math.random() * ( 25 - 1 + 1) +1);
		int c = (int) (Math.random() * ( 25 - 1 + 1) +1);
		
			// 판별해서 변수에 담는다.
		int num = (a > b) ? ((a > c) ? (a) : (c)) : ((b < c) ? (c) : (b));
		
			// 출력
		System.out.println("첫번째 숫자 : " + a + "입니다.");
		System.out.println("두번째 숫자 : " + b + "입니다.");
		System.out.println("세번째 숫자 : " + c + "입니다.");
		
		System.out.println("가장 큰 숫자는 : " + num + "입니다.");
		System.out.println("입력한 세 정수 \n\t" + a + ", " + b + ", " + c + "\n 중 제일 큰수는 " + num + "입니다.");
		
		
		/* 문자열을 표현할 때 문자열 안에 " 기호를 출력하는 방법
		  	==>
		 	\"
		 	이때 사용한 \를 이스케이프문자 라고 부른다.
		 	
		 	많이 사용하는 문자들
		 	
		 		\"	- 문자열 내 " 를 표현한다.
		 		\n	- 한줄 내림
		 		\r	- 캐리지리턴 
		 		\t	- tab을 표현
		 		\b	- backspace
		 		
		 */
		
	}
	//() ? () : ()

}
