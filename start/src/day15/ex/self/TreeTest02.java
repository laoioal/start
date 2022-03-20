package day15.ex.self;

/*
	삼각형의 정보를 기억하는 Semo 클래스를 만들고
	15개의 삼각형을 높이가 큰 삼각형부터 정렬되어서 저장되도록
	TreeSet을 만들고
	내용을 출력하세요
	
	이 예제에서는 Semo클래스를 정렬가능한 클래스로 만들어서 저장하는 2번 방식으로 해결하기로 한다.
	
	2. Won을 정렬가능한 클래스로 만든 후 입력해주는 방법	==> 정렬 가능한 클래스로 만들어서 입력하는 방법
					==> 정렬가능한 클래스로 만드는 방법은
						
							Comparable 인터페이스를 구현하는 클래스로 제작한다.
							소속 함수 중 compareTo(Object o) 함수를 오버라이드 해서 만들어야 한다.
*/

import java.util.*;

public class TreeTest02 {

	public TreeTest02() {
		TreeSet ts = new TreeSet();
		
		while(true) {
			Semo se = new Semo((int) (Math.random() * 21 + 10),(int) (Math.random() * 21 + 10));
			
			ts.add(se);
			
			if(ts.size() == 15) {
				break;
			}

		}
		
		ArrayList al = new ArrayList(ts);
		
		for(Object o : al) {
			
			System.out.println(o);
		}
	
		
	}

	public static void main(String[] args) {
	new TreeTest02();
	}

}
