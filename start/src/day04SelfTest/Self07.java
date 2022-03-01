package day04SelfTest;

/*
	문제 5 ]
	3자리 숫자(100~999)를 입력받아서
	이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
	얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
	
	예 ]
		241	은 200에 가까우므로 41을 뺴야한다.
		777 은 800에 가까우므로 23을 더해야한다.
*/

import java.util.*;

public class Self07 {

	public static void main(String[] args) {
	
		// 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력");
		int a = sc.nextInt();
		
		// 필요한 숫자 산출
		int b = (a % 100 == 0) ? (0) : ( (a - ((a / 100) * 100) >= 50 ) ? ((100 - (a % 100))) : (((a/100)*100) - a));
		
		// 출력
		System.out.println("입력받은 숫자 : " + a + "가 100의 배수가 되려면" + b + "가 더해져야합니다.");
		
		
		/*
		 		// 할일
			// 3자리 숫자 받기
		
			int a = (int) (Math.random() * (999 - 100 + 1) + 100);
		
			// 받은 숫자 비교
			int b = (a/100)*100;
			int result1 = (a - b > 50) ? ((b+100) - a) : (b - a);
			
		System.out.println("입력된 문자 : " + a);
		//System.out.println(b);
		System.out.println("100의 배수에 가까운 수 : " + result1); 
		 
		 */
		
		

	}

}
