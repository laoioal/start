package day16.ex.self;

import java.util.*;

public class Test01 {
/*
 	Nemo 클래스를 만들고 가로가 같은 네모면 같은 네모로 처리되도록 하세요.
 */

	public Test01() {
		Nemo n1 = new Nemo(5, 10);
		Nemo n2 = new Nemo(5, 20);
		Nemo n3 = new Nemo(10, 10);
		
		HashSet set = new HashSet();
		
		set.add(n1);
		set.add(n2);
		set.add(n3);
		
		for(Object o : new ArrayList(set)) {
			System.out.println(o);
		}
		
	}

	public static void main(String[] args) {
		new Test01();
	}
	
}
