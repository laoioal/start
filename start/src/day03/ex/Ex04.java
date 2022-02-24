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
		int b = (int)a;
		double c = a % 365;
		double d =  c * 24; // 일을 시간으로 환산
		
		int e = (int) d;
		double f = (d - e) * 60 ;
		int g = (int) f;
		
		int h = (int)(f % g * 60);
		
		
		
		
		
		
	
		
		
	
	
	
	System.out.println("365.2426일은 " + b + "일 " + e + "시간 " + g + "분 "  + h + "초 입니다.");
	
	}

}
