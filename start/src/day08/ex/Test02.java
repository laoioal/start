package day08.ex;

/*
 	1  2  3  4  5
	1  2  3  4  5
	1  2  3  4  5
	1  2  3  4  5
	1  2  3  4  5
 */

public class Test02 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 ; j ++) {
				int sum = j + 1;
				System.out.print(sum);
			}
			System.out.println();
		}

	}

}
