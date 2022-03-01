package day04SelfTest;

/*
 	입력된 숫자가 홀수인지 짝수인지
 */

import java.util.*;
public class Self01 {

	public static void main(String[] args) {

		// 입력키 생성
		Scanner sc = new Scanner(System.in);
		
		//입력메세지
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		String a = "0";
		
		// 홀수
		if (num % 2 != 0 ) { a = "홀수";
			
		}
		
		// 짝수
		if (num % 2 == 0 && num != 0 ) {
			a = "짝수";
		}
		
		System.out.println("입력한 숫자 : " + num + "은/는 " + a + "입니다.");

	}

}
