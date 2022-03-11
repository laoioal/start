package day04.selfTest;

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

public class Self06 {

	public static void main(String[] args) {

		//랜덤한 년도 발생
		int year = (int) (Math.random() * (3000 - 1000 + 1) + 1);
		
		//윤년 평년 구분
			String a = (year % 4 == 0 && year % 400 == 0) ? ("윤년") : ( (year % 4 == 0 && year % 100 == 0) ? ("평년") : ( (year % 4 == 0) ? ("윤년") : ("평년")));
			
		//출력
			System.out.println("년도 :" + year);
			System.out.println(year + "년은 " + a + "입니다.");

	}

}
