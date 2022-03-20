package day15.ex.self;
/*
	5 ~ 25 사이의 랜덤한 정수를 반지름으로 하는 원을 기억할 클래스를 만들고
	원 10개를 리스트에 채워서 
	넓이가 넓은 원부터 내림차순으로 정렬해서 
	내용을 출력하세요
*/

import java.util.*;

public class WonTest {

	public WonTest() {
		ArrayList arr = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			Won w = new Won((int)(Math.random() * 21 + 5));
			arr.add(w);
		}
		System.out.println("1. 내림차순 정렬 전");
		for(Object o : arr) {
			Won ww = (Won) o;
			System.out.println(ww);
		}
		
		Collections.sort(arr,new Down());
		
		System.out.println("2. 내림차순 정렬 후");
		for(Object o : arr) {
			Won ww = (Won) o;
			System.out.println(ww);
		}
		

		
	}

	public static void main(String[] args) {
	new WonTest();
	}

}

class Down implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;

		Won w1 = (Won) o1;
		Won w2 = (Won) o2;
		
		double no1 = (double) w1.getArea();
		double no2 = (double) w2.getArea();
		result = (no1 - no2 < 0) ? -1 : 1; 
		return -result;
		
	}
	
}