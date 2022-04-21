package day15.ex.self;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test01 {

	public Test01() {
		
		HashSet hs = new HashSet();
		
		hs.add("제니");
		hs.add("리사");
		hs.add("로제");
		hs.add("지수");
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			String name = (String) it.next();
			System.out.println("Iterator" + name);
		}
		
		ArrayList list = new ArrayList(hs);
		
		for(int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);
			System.out.println("List" + name);
		}
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
