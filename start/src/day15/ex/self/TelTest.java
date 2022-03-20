package day15.ex.self;

import java.util.*;
import java.util.regex.*;

public class TelTest {

	public TelTest() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호입력 : ");
		String tel = sc.nextLine();
		
		Pattern form = Pattern.compile("010-[\\d]{4}-[\\d]{4}");
		
		Matcher mt = form.matcher(tel);
		
		if(mt.find()) {
			String hp = mt.group();
			System.out.println("전화번호 : " + hp);
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
	}

	public static void main(String[] args) {
	new TelTest();
	}

}
