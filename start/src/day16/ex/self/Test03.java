package day16.ex.self;

/*
	전화번호부를 만들어보자
*/

import java.util.*;

public class Test03 {

	public Test03() {
		HashMap map1 = new HashMap();
		
		map1.put("제니", "010-1111-1111");
		map1.put("리사", "010-2222-2222");
		map1.put("로제", "010-3333-3333");
		map1.put("지수", "010-4444-4444");

	// 데이터만 추출
		Collection col = map1.values();
		Iterator itor = col.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		System.out.println();
	// 키값만 추출
		Set set = map1.keySet();
		Iterator itor1 = set.iterator();
		while(itor1.hasNext()) {
			Object o = itor1.next();
			
			System.out.println(o);
		}
		System.out.println();
		
		Set entry = map1.entrySet();
		Iterator itor3 = entry.iterator();
		while(itor3.hasNext()) {
			Map.Entry en1 = (Map.Entry) itor3.next();
			
			Object o = en1.getKey();
			Object value = en1.getValue();
			System.out.println(o + " : " + value);
		}
		
		
		
		
		System.out.println();
		// 출력
		
		Set set1 = map1.keySet();
		Iterator itor2 = set1.iterator();
		while(itor2.hasNext()) {
			Object o = itor2.next();
			Object value = map1.get(o);
			
			System.out.println(o + " - " + value);
			
		}
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
