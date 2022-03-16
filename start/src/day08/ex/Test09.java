package day08.ex;

/*
	 0  0  0  0  1
	 0  0  0  1  2
	 0  0  1  2  3
	 0  1  2  3  4
	 1  2  3  4  5
 */

public class Test09 {

	public static void main(String[] args) {
		
		for(int i = 5; i > 0; i--) {
			
			for(int j = 1; j < 6; j++) {
				
				if(j >= i) {
					System.out.print(j - i + 1);
				} else {
					System.out.print(0);
				}
				
			}
			System.out.println();
		}
		
		
		

	}

}
