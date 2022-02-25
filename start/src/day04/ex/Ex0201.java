package day04.ex;

/*
 	1.
  	알파벳을 입력받아서
  	그 문자가 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요
  
  	2. 숫자 또는 알파벳을 입력받아서
  	그 문자가 숫자인지 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요
 */

import java.util.*;

public class Ex0201 {

	public static void main(String[] args) {
		// 할일
			// 문자입력
		Scanner sc = new Scanner(System.in);
		
			// 문자입력창 노출
		System.out.print("입력된 문자 : ");
		String str = sc.nextLine();
		
			// 소문자 대문자 판별		
		char result1 = str.charAt(0);
		String result2 = (result1 >= 'A' && result1 <= 'Z') ? ("대문자") : ((result1 >= 'a' && result1 <= 'z') ? ("소문자") : ("숫자"));
		
			// 결과 출력
		System.out.println("입력된 문자 : " + result1);
		System.out.println("문자 구분 : " + result2);
		
		
		

	}

}
