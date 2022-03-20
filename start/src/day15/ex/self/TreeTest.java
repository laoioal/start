package day15.ex.self;

import java.util.*;

public class TreeTest {

	public TreeTest() {
		TreeSet ts = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				
				Won w1 = (Won) o1;
				Won w2 = (Won) o2;
				int wo1 = w1.getRad();
				int wo2 = w2.getRad();
				
				result = wo1 - wo2;
				
				return -result;
				
			}
			
			
		});
		
		Won w1 = new Won(5);
		Won w2 = new Won(10);
		
		ts.add(w1);
		ts.add(w2);
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Won w = (Won) it.next();
			System.out.println(w);
		}
		
		
	}

	public static void main(String[] args) {
	new TreeTest();
	}

}
