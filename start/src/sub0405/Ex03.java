package sub0405;

/*
	1
	2  3
	4  5  6
	7  8  9 10
	11 12 13 14 15
	
	
	
	다른 처리방법 
	0			==> o
	1 2			==> i = 1 ==> 1
	3 4 5		==> 0 + 1 + 2 ==> 3
	6 7 8 9
 */

public class Ex03 {

	public Ex03() {
		int no = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(no++ + " ");
			}
				System.out.println();
				
		}
	}
	public static void main(String[] args) {
		new Ex03();
	}

}
