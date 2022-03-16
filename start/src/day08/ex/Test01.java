package day08.ex;

/*
	1  1  1  1  1
	2  2  2  2  2
	3  3  3  3  3
	4  4  4  4  4
	5  5  5  5  5
 */

public class Test01 {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 ; j ++) {
				int sum = i + 1;
				System.out.print(sum);
			}
			System.out.println();
		}

	}

}
