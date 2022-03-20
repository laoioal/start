package day15.ex.self;
/*
	이름을 입력받아서
	입력한 이름이 한글이름인지를 검사하는 프로그램을 작성하세요
	이름 글자수는 2글자에서 5글자까지만 허용하기로 한다.
*/

import java.util.*;
import java.util.regex.*;

public class NameTest {

	public NameTest() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이릅입력 : ");
		String name = sc.nextLine();
		
		Pattern form = Pattern.compile("[가-힣]{2,5}");
		Matcher mc = form.matcher(name);
	
		boolean bool = mc.matches();
		
		String result = bool ? "올바른" : "잘못된";
		
		System.out.println("입력된 [ " + name + " ] 은 " + result + "입니다.");
		
	}

	public static void main(String[] args) {
	new NameTest();
	}

}
