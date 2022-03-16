package day06.ex;

/*
 1
 2  3
 4  5  6
 7  8  9  10
 11 12 13 14 15
 */

public class Ex03_05 {

	public static void main(String[] args) {
		int k = 1;

		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				
				if(i >= j) {
				int sum = i + k + j;
				System.out.print(sum + "\t");
				}
				
				
				
				
			}
			
			
			
			System.out.println();		
			k = k + i;
			
		}
		
	}

}
