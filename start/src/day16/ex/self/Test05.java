package day16.ex.self;

import java.util.*;

public class Test05 {

	public Test05() {
		TreeMap map = new TreeMap();
		
		map.put("가", 27);
		map.put("사", 28);
		map.put("라", 26);
		map.put("나", 27);
		
		Set set = map.keySet();
		for(Object key : set) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println();
		
		TreeMap map1 = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String str1 = (String) o1;
				String str2 = (String) o2;
				int result = str1.compareTo(str2);
				
				return -result;
			}
		});
		
		map1.put("가", 27);
		map1.put("사", 28);
		map1.put("라", 26);
		map1.put("나", 27);
		
		Set set1 = map1.keySet();
		Iterator itor1 = set1.iterator();
		while(itor1.hasNext()) {
			Object key = itor1.next();
			Object value = map1.get(key);
			
			System.out.println(key + " : " + value);
		}
		
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
