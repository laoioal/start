package day03.ex;

/*
 	1년은 365.2426일
 	이것은 과연 몇일 몇시간 몇분 몇초인지 계산하고 출력하세요.
 	
 	힌트 ]
 		365.2426일은 단위가 일단위이다.
 		하루는 24시간이다.
 		따라서 0.5일은 12시간을 의미한다.
 */

public class Ex04 {

	public static void main(String[] args) {
		double a = 365.2426;
		double b = a - (int) a; //일
		double c = b * 24; // 시간
		double d = c * 60; // 분
		double e = d * 60; // 초
		
		
		System.out.println(c);
	
	
	
	
	System.out.println("365.2426일은 " + (int) a + "일 " + (int) c + "시간 " + (int) d + "분 " + "초 입니다.");
	
	}

}
