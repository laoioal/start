package day15.ex.self;

import java.util.ArrayList;
import java.util.Collections;

//ArrarList 타입의 list 에 1 ~ 25 사이의 정수 10개를 랜덤하게 만들어서 채워주세요
public class ArrayTest02 {

	public ArrayTest02() {
		
		ArrayList arr = new ArrayList();
		
		for(int i = 0; i < 10; i++) {	
			arr.add((int)(Math.random() * 25 + 1));
		}
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " | ");
		}
		System.out.println();
		// 역순정렬
		
		Collections.reverse(arr);
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " | ");
		}
		System.out.println();
		
		
		Collections.sort(arr);
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " | ");
		}
		System.out.println();
		
		
	}
	
	
	
	

	public static void main(String[] args) {
	new ArrayTest02();
	}

}
