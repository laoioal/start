package day08.ex;

/*
	 1  2  3  4  5
	10  9  8  7  6
	11 12 13 14 15
	20 19 18 17 16
	21 22 23 24 25
 */

public class Test06 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			
				
				if((i+1) % 2 != 0 ) {
					for(int j = 0; j < 5 ; j++) {
						sum = i * 5 + (j + 1);
						System.out.print(sum + "\t");
				} 
				
			} else if ((i+1) % 2 == 0 ) {
				for(int j = 0; j < 5 ; j++) {
					sum = i * 5 + 5 - j;
					System.out.print(sum + "\t");
				}
			}
				
			System.out.println();
		
		}
	}
}