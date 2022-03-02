package ex;

/*
 	문제 7 ]
 		5자리의 숫자를 입력한 후
 		각자리의 수의 합을 구하는 프로그램을 작성하세요.
 		
 		힌트 ]
 			
 			***** % 10 ==> 마지막 자리만 꺼낸다.
 			***** / 10 ==> ****
 */

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
	
		/*Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int a = sc.nextInt();
		
		int result = 0;
		
		int result2 = 0;
		int b = a;
	
		int i = 10000;
		
		while(i >= 1) {
			
			result2 = b / i;
			result = result + result2;
			b = b - (result2 * i);
			i = (i / 10);

		}
		System.out.println("입력한 수 " + a + "의 각 자리수의 합은 " + result + "입니다." );
	
		*/
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력하고
		System.out.print("5자리 정수입력 : ");
		// 입력받고 기억하고
		int no = sc.nextInt();
		
		int sum = 0;
		
		int tmp = no;
		// 반복해서 합 구하고
		for(int i = 0; i < 5; i++) {
			sum = sum + tmp % 10;
			tmp = tmp / 10;
			
		}
		// 결과 출력하고
		System.out.println("입력한수 " + no + " 의 각 자리수의 합은 " + sum + " 입니다.");
	}

}
