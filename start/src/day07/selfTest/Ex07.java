package day07.selfTest;

import java.util.Arrays;

/*
	정수 10 랜덤하게 만들어서 기억하는 배열을 만들고
	기억된 정수를 내림차순 정렬해서 다시 기억시키고 
	배열의 데이터를 출력하세요
*/

public class Ex07 {

	public static void main(String[] args) {
		int[] a = new int[10];
		
		loop:
		for(int i = 0; i < a.length; i++) {
			int b = (int) (Math.random() * 100 + 1);
		
			for(int j = 0; j < i; j++) {
				if(b == a[j]) {
					i--;
					continue loop;
				}
			}
			a[i] = b;
			
			
		}
		System.out.println(Arrays.toString(a));
		
		
		for(int i = 0; i < a.length - 1; i++) {
			
			for(int j = i + 1; j < a.length; j++) {
				
				if(a[j] > a[i]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					
					
				}
				
				
		
			
			}
		}
		
		for(int no : a) {
			System.out.print(no + " | ");
		}
		
		
	}

}
