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
	
		int k = 0;
		for(int i = 0; i < 5; i++) {
			
			k++;
			for(int j = 0; j < i + 1; j++) {
				int b = i + k ;
				int c = i + j ;
				int t = b + c;
		
						
				
				
				System.out.print(t + "\t");
				
			}
			System.out.println();
		}

	}

}
