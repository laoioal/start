package day08.ex;

/*
	 0  0  0  0  1
	 0  0  0  2  3
	 0  0  4  5  6
	 0  7  8  9 10
	11 12 13 14 15
 */

public class Test10 {

	public static void main(String[] args) {
		int k = 1;
		
		for(int i = 1; i < 6; i++) {
			
			for(int j = 5; j > 0; j--) {
				
			if(i >= j) {
				System.out.print(i + k - j + "\t");
			} else {
				System.out.print(0+"\t");
			}
			
				
			}
			System.out.println();
			k = k + i;
		}
		
		
		

	}

}
