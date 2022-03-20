package day15.ex.self;

import java.util.Vector;

public class VecTest {

	public VecTest() {
		Vector vec = new Vector(20,10);
		System.out.println("입력전 공간 : " + vec.capacity());
		
		for(int i = 0; i < 21; i++) {
			vec.add(i + 1);
		}
		System.out.println("입력후 공간 : " + vec.capacity());
		
		System.out.println("------------------------------");
		
		Vector vec1 = new Vector();
		System.out.println("입력전 공간 : " + vec1.capacity());
		
		for(int i = 0; i < 21; i++) {
			vec1.add(i + 1);
		}
		System.out.println("입력후 공간 : " + vec1.capacity());
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
	new VecTest();
	}

}
