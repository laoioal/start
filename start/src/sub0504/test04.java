package sub0504;
/*
1  6  11  16  21
2  7  12  17  22
3  8  13  18  23
4  9  14  19  24
5  10 15  20  25

i = 1씩 증가
j = 5씩 증가
 */

public class test04 {

	public test04() {
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				int no = (i + 1) + (j * 5);	
				System.out.print(no + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new test04();
	}

}
