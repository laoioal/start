package day06.ex;
/*
(4)
1  2  3  4  5
6  7  8  9  10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/

public class Ex03_03 {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < 5; i++ ) {
			
			for(int j = 0; j < 5; j++) {
				b = i * 5;
				a = j + 1 + b;
				
				
				System.out.print(a + "\t");
				
			}
			System.out.println();
		}
	}

}
