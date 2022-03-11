package day12;

import java.util.Calendar;

public class Test04 {
	
	public Test04() {
//		Calendar cal = new Calendar();	// ==> 이 클래스는 추상클래스로 new 시켜서 객체를 만들수 없는 클래스이다.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
	}
	
	public static void main(String[] args) {
		
		new Test04();
	}



}
