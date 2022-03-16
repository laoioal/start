package day08.ex;

/*
	 1  2  3  4  5
	 6  7  8  9 10
	11 12 13 14 15
	16 17 18 19 20
	21 22 23 24 25
 */

public class Test05 {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 ; j ++) {
				int sum = i * 5 + (j + 1);
				System.out.print(sum + "\t");
			}
			System.out.println();
		}

	}

}
