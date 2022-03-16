package day08.ex;

/*
	1  0  0  0  0
	1  2  0  0  0
	1  2  3  0  0
	1  2  3  4  0
	1  2  3  4  5
 */

public class Test07 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			int sum = 0;
			for(int j = 0; j < 5; j++) {
				
				if(i >= j) {
					sum = j + 1;
					System.out.print(sum);
				} else {
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
		
		
		

	}

}
