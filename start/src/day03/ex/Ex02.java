package day03.ex;

import java.util.Scanner;

/*
 	문제 2 ]
 		하나의 숫자를 입력받은 후(원의 반지름)
 		그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
 		
 		참고 ]
 			원의 넓이 : 반지름 * 반지름 * 3.14
 			원의 둘레 : 2 * 반지름 * 3.14
 */
public class Ex02 {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in); // 입력도구 준비
		int cir = abc.nextInt(); // 반지름 입력
		System.out.println("원의 넓이 : " + (cir * cir * 3.14)); // 원의 넓이
		System.out.println("원의 넓이 : " + (cir * 2 * 3.14)); // 원의 둘레
	}

}
