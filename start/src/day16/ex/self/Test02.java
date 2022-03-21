package day16.ex.self;
//HashTable에 친구의 정보를 기억시켜보자.

import java.util.*;

public class Test02 {

	public Test02() {
		Hashtable table = new Hashtable();
		table.put("이름", "제니");
		table.put("나이", "27");
		table.put("성별", "여");
		
		// 데이터만 추출
		Collection col = table.values();
		Iterator itor = col.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		// 키만 추출 1
		Enumeration en = table.keys();
		while(en.hasMoreElements()) {
			Object o = en.nextElement();
			System.out.println(o);
		}
		
		// 키만 추출 2
		Set set = table.entrySet();
		Iterator itor1 = set.iterator();
		while(itor1.hasNext()) {
		Map.Entry en1 = (Map.Entry) itor1.next();
		
		Object key = en1.getKey();
		Object value = en1.getValue();
		System.out.println(key + " : " + value);
		}
		
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
