package day06.ex;

/*
 	문제 1 ]
 		3 ~ 100 사이의 정수를 입력받아서
 		이 정수가 소수인지 판단하는 프로그램을 작성하세요.
 		
 		참고 ]
 			소수
 				1과 자신으로만 나누어지는 수
 				
 	보너스 ]
 		3 ~ 100 사이의 숫자 중에서 소수만 모두 출력하세요.
 */

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		//정수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("3 ~ 100 사이의 수를 입력해주세요 : ");
		int a = sc.nextInt();
		int num = 0;
		
		//소수를 구분한다.
		
		for(int i = a; i > 1; i--) {
			if(a % i !=0) {
				
			}
		}

	}

}
