package day04.selfTest;

/*
	1
	알파벳을 입력받아서
	그 문자가 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요

	2. 숫자 또는 알파벳을 입력받아서
	그 문자가 숫자인지 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요
*/

import java.util.*;

public class Self04 {

	public static void main(String[] args) {
		
		// 알파벳 입력
		Scanner sc = new Scanner(System.in);
		
		// 입력 문구
		System.out.print("알파벳 입력 : ");
		String str =  sc.nextLine();
		char abc = str.charAt(0);
		
		String a = (abc >= 'A' & abc <= 'Z') ? ("대문자") : ( (abc >= 'a' & abc <= 'z')?("소문자"):("숫자"));
		
		System.out.println("입력한 문자 : " + abc);
		System.out.println("문자구분 : " + a);
		

	}

}
