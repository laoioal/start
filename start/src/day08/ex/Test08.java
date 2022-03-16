package day08.ex;

/*
	 1  0  0  0  0
	 2  3  0  0  0
	 4  5  6  0  0
	 7  8  9 10  0
	11 12 13 14 15
 */

public class Test08 {

	public static void main(String[] args) {
		int k = 1;
		for(int i = 0; i < 5; i++) {
			int sum = 0;
			
			for(int j = 0; j < 5; j++) {
				
				if(i >= j) {
					sum = j + k + i;
					System.out.print(sum + "\t");
				} else {
					System.out.print("0\t");
				}
				
			}
			k = k + i;
			System.out.println();
		}
		
		
		

	}

}
