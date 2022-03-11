package day06.ex;
/*
 (3)
 1 2 3 4 5 
 2 3 4 5 6
 3 4 5 6 7
 4 5 6 7 8
 5 6 7 8 9
 */

public class Ex03_02 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int a = 0;
		
		
		for(i = 0; i < 5; i++) {
			
			for(j = 0; j < 5; j++) {
				
				a = j + 1 + i;
				
				System.out.print(a + "\t");
			}
			System.out.println();
		
		}

	}

}
