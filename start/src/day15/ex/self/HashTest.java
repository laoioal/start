package day15.ex.self;

import java.util.*;

public class HashTest {

	public HashTest() {
		HashSet ha = new HashSet();
		
		ha.add("제니");
		ha.add("로제");
		ha.add("리사");
		ha.add("지수");
		
		Iterator it = ha.iterator();
		
		while(it.hasNext()) {
			String name = (String) it.next();
			System.out.println(name);
		}
		System.out.println("=====================");
		
		Vector vec = new Vector(ha);
		for(int i = 0; i < vec.size(); i++) {
			String str = (String) vec.get(i);
			System.out.println(str);
		}
		
	}

	public static void main(String[] args) {
	new HashTest();
	}

}
