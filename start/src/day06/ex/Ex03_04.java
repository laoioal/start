package day06.ex;
/*
 (5)
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 */

public class Ex03_04 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++ ) {
				int a = j + 1 ;
				
				System.out.print(a + "\t");				
				
			}
			System.out.println();
		}

	}

}
