package sub0504;

public class test01 {
/*
 	1  2  3  4  5
 	6  7  8  9  10
 	11 12 13 14 15
 	16 17 18 19 20
 	21 22 23 24 25
 */
	public test01() {
	}

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0 ; j < 5; j++) {
				int no = 5 * i + 1 + j;
				System.out.printf("%3d", no);
			}
			System.out.println();
		}
		new test01();
	}

}
