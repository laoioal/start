package day15.ex;

/*
 	Ex01 ]
 		아이디를 입력받아서
 		입력받은 아이디가 유효한 아이디인지 아닌지를 판별해주는 프로그램을 작성하세요
 		
 		아이디는 
 			첫글자는 영문 대문자로 시작하고
 			두번째부터는 영문숫자를 사용할 수 있다.
 			글자수는 5글자 이상이어야 한다.
 */

import java.util.*;
import java.util.regex.*;

public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		
		String id = sc.nextLine();
		
		Pattern form = Pattern.compile("[A-Z][a-zA-z0-9]{5,}");
		Matcher mt = form.matcher(id);
		
		boolean bool = mt.matches();
		
		String result = bool ? "올바른" : "잘못된";
		
		System.out.println("입력된 [ " + id + " ] 는 " + result + " id 입니다.");
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
