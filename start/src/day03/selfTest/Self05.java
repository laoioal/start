package day03.selfTest;

/*
	1년은 365.2426일
	이것은 과연 몇일 몇시간 몇분 몇초인지 계산하고 출력하세요.
	
	힌트 ]
		365.2426일은 단위가 일단위이다.
		하루는 24시간이다.
		따라서 0.5일은 12시간을 의미한다.
*/


public class Self05 {
	
	public static void main(String[] args) {
		
		double total = 365.2426;
		
		double temp = total;
		
		int a = (int) temp;
		temp = temp % a;
		
		
		int b = (int) (temp * 24); 
		temp = (temp * 24) % b;
		
		
		int c = (int) (temp * 60);
		temp = (temp * 60) % c;
		
		
		int d = (int) (temp * 60);
		
				
		
		
		
		System.out.println("365.2426일은 " + a + "일 " + b + "시간 " + c + "분 " + d + "초로 이루어져 있습니다.");

	}
}
