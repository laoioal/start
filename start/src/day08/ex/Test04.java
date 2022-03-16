package day08.ex;

/*
	1  2  3  4  5
	5  4  3  2  1
	1  2  3  4  5
	5  4  3  2  1
	1  2  3  4  5
 */

public class Test04 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			
				
				if((i+1) % 2 != 0 ) {
					for(int j = 0; j < 5 ; j++) {
						sum = j + 1;
						System.out.print(sum);
				} 
				
			} else if ((i+1) % 2 == 0 ) {
				for(int j = 5; j > 0 ; j--) {
					sum = j;
					System.out.print(sum);
				}
			}
				
			System.out.println();
		
		}
	}
}