package day15.ex.self;

import java.util.Vector;

public class VecTest02 {

	public VecTest02() {
		Vector vec = new Vector();
		
		vec.add("제니");
		vec.add('F');
		vec.add(27);
		vec.add(160.5);
		vec.add(true);
		
		
		String name = (String) vec.get(0);
		char se = (char) vec.get(1);
		int age = (int) vec.get(2);
		double height = (double) vec.get(3);
		boolean bool = (boolean) vec.get(4);
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + se);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("학원 : " + bool);
		System.out.println();
		
		for(Object o : vec) {
			System.out.println(o);
		}
		
		
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
	new VecTest02();
	}

}
