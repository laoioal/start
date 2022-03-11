package day06.ex;

/*
*****
****
***
**
*

 
 */

public class Ex04_01 {

	public static void main(String[] args) {
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < 5; j++) {
				int c = i - j;
				
				
				if( c > 0) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}
