package day05.selfTest;

/*
	문제 3 ]
		
		문자열을 입력받아서
		문자를 한글자씩 추출해서 출력하세요.
		
		참고 ]
			문자열의 길이를 알아내는 방법
			
				int 변수 = 문자열.length();
*/

import java.util.*;

public class self03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요");
		
		String a = sc.nextLine();
		int b = a.length();
		
		
		for(int i = 0; i < b; i++) {
			char c = a.charAt(i);
			System.out.println(c);
		}
		
		
		
		
	}

}
