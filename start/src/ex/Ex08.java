package ex;

/*
 	문제 8 ]
 		숫자형식의 다섯자리 정수형태 문자열을 입력받아서
 		각자리 수의 합을 구하는 프로그램을 작성하세요.
 		
 		문자열로 입력받아서 문자로 변환 후처리하세요.
 */

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("다섯자리 숫자 입력 : ");
		String abc = sc.nextLine();
		int ch = Integer.parseInt(abc);
		
		int a = 0;
		int b = ch;
		int res = 0;
		int result = 10000;
		
		while(result >= 1) {

			a = b / result;
			res = res + a;
			b = b - (a * result);
			result = result / 10;

		}
		
		char aaa = (char) res;
		System.out.println(res);
		System.out.println("다섯자리 수의 합은 : " + aaa + "입니다.");
		

	}

}
