package day08.ex;

/*
	5  4  3  2  1
	5  4  3  2  1
	5  4  3  2  1
	5  4  3  2  1
	5  4  3  2  1
 */

public class Test03 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > 0 ; j --) {
				int sum = j ;
				System.out.print(sum);
			}
			System.out.println();
		}

	}

}
