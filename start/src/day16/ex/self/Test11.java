package day16.ex.self;
/*
	blackpink 멤버의 이름을 기억하는 Set을 만들어서 출력해보자.
	이때 문자열만 입력되도록 처리하세요
*/

import java.util.*;

public class Test11 {
	
	

	public Test11() {
		HashSet<String> set = new HashSet<String>();
		set.add("제니");
		set.add("리사");
		set.add("로제");
		set.add("지수");
		
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println("####");
		
		ArrayList<String> blackpink = new ArrayList<String>(set);
		for(int i = 0; i < blackpink.size(); i++) {
			String name = blackpink.get(i);
			
			System.out.println(name);
		}
		System.out.println("####");
		
		Iterator<String> itor = blackpink.iterator();
		while(itor.hasNext()) {
			String str = itor.next();
			System.out.println(str);
		}
		
	}

	public static void main(String[] args) {
	new Test11();
	}

}
