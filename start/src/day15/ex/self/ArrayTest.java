package day15.ex.self;

import java.util.ArrayList;


public class ArrayTest {

	public ArrayTest() {
		
		ArrayList vec = new ArrayList();
		
		vec.add("제니");
		vec.add('F');
		vec.add(27);
		vec.add(160.5);
		vec.add(true);
		

		for(int i = 0; i < vec.size(); i++) {
			Object o = vec.get(i);
			
			if(o instanceof String) {
				String str = (String) o;
				System.out.println(str);
			} else if(o instanceof Character) {
				char ch = (char) o;
				System.out.println(ch);
			} else if(o instanceof Integer) {
				int age = (int) o;
				System.out.println(age);
			} else if(o instanceof Double) {
				double height = (double) o;
				System.out.println(height);
			} else if(o instanceof Boolean) {
				boolean ac = (boolean) o;
				System.out.println(ac);
			}
			
			
		}
		
		
	}
	
	
	
	

	public static void main(String[] args) {
	new ArrayTest();
	}

}
