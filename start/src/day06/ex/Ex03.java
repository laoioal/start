package day06.ex;

/*
 	문제 3 ]

 중첩된 for 명령으로 처리하세요.		
(1) 		
 1 1 1 1 1
 2 2 2 2 2
 3 3 3 3 3
 4 4 4 4 4
 5 5 5 5 5
 
 
(2) 
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5


(3)
 1 2 3 4 5 
 2 3 4 5 6
 3 4 5 6 7
 4 5 6 7 8
 5 6 7 8 9
 
 
 (4)
 1  2  3  4  5
 6  7  8  9  10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 
 
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 
 1
 2  3
 4  5  6
 7  8  9  10
 11 12 13 14 15
 */

public class Ex03 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				a = i + 1;
				
				System.out.print(a + "\t");
				if(j == 4) {
					System.out.println();
				}
			}
			
		}

	}

}