package ex;

/* 
 	문제 13 ]
 		랜덤한 두 수를 입력한 후
 		두 수의 최대 공약수를 구하는 프로그램을 작성하세요.
 		
 		최대 공약수 :
 			두 수의 약수중 제일 큰 수.
 			두 수를 나눌 수 있는 수중 제일 큰 수
 			
 		extra ]
 			위 문제가 해결되면 최소 공배수를 구하는 문제로 풀어보세요.
 */

import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		int b = sc.nextInt();
		int c = 0;
		int d = 0;
		int res = 0;
		
		
		for(int i = 0; i <= a; i++) {
			for(int j = 0; j <= b; i ++) {
				if( a / i == 0 && b / j ==0 && i == j) {
					System.out.println(i);
					
				}
				
			}
		}
		
		

		

	}
	}

