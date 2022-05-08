package sub0504;

/*
 	 5  4  3  2  1		==> x * i  + a = 5
 	10  9  8  7  6
 	15 14 13 12 11
 	20 19 18 17 16
 */

public class test02 {

	public test02() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				int no = 5 * i + 5 -j;
				System.out.printf("%3d", no);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new test02();
	}

}
