package day04.ex;

/*
 	문제 4 ]
 		1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서
 		이 숫자를 년도로 하는 해는
 		윤년인지 평년인지를 판별해서 출력해주는
 		프로그램을 작성하세요.
 		
 		참고 ]
 			윤년은 4로 나누어 떨어지고
 				100으로 나누어 떨어지면 안되고
 				400으로 나누어 떨어지는 해를 윤년이라 한다.
 */

public class Ex04 {
	public static void main(String[] args) {
			// 할일
				// 1000~3000년 생성
		int year = (int) (Math.random() * (3000 - 1000 + 1 ) +1000) ;
				// 윤년 평년 확인
		
		
		
		
		
		System.out.println(year);
		
	}
}
