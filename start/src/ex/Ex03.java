package ex;

/*
 	문제 3 ]
 		
 		문자열을 입력받아서
 		문자를 한글자씩 추출해서 출력하세요.
 		
 		참고 ]
 			문자열의 길이를 알아내는 방법
 			
 				int 변수 = 문자열.length();
 */

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자입력 : ") ;
		
		String str = sc.nextLine();
		int a = str.length();
		
		for(int i = 0; i < a ; i++) {
			char b = str.charAt(i);
			System.out.println((i + 1) + "번째 숫자 : " + b);
		}
		
		
		
		
		

	}

}
