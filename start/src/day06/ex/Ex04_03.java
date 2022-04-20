package day06.ex;

/*
 
   *			  (0,3)				- 1
  ***		 (1,2)(1,3)(1,4)		- 3
 *****	(2,1)(2,2)(2,3)(2,4)(2,5)	- 5
 */

public class Ex04_03 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				int no = 1 + (2 * i); // i번째때 해당 갯수만큼 * 출력
				System.out.println();
			}
		}
		

	}

}
