package ex;

/*
 	문제 15]
 		구구단을 다음 형식으로 출력하세요
 		
 		2 X 1 = 2		3 X 1 = 3		4 X 1 = 4		 5 X 1 = 5
 		2 X 2 = 4		3 X 2 = 6		4 X 2 = 8		 5 X 2 = 10
 		...
 		2 X 9 = 18		3 X 9 = 27		4 X 9 = 36		 5 X 9 = 45
 		
 		6 X 1 = 6		7 X 1 = 7		8 X 1 = 8		 9 X 1 = 9
 		6 X 2 = 12		7 X 2 = 14		8 X 2 = 16		 9 X 2 = 18
 		...
 		6 X 9 = 54		7 X 9 = 63		8 X 9 = 72		 9 X 9 = 81
 */

public class Ex15 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 1;
		int k = 1;
		
		for(k = 1 ; k <10; k++) {
		while(b == k && a < 6) {
			System.out.print(a + " X " + b + " = " + (a * b));
			System.out.print("\t");
			a++;
			if( a == 6) {
				System.out.print("\n");
				a = 2;
				b = k + 1;
			
		
			}
		}
		
			
		}
		
		 a = 6;
		 b = 1;
		 k = 1;
		
		for(k = 1 ; k <10; k++) {
		while(b == k && a > 5 && a < 10) {
			System.out.print(a + " X " + b + " = " + (a * b));
			System.out.print("\t");
			a++;
			if( a == 10) {
				System.out.print("\n");
				a = 6;
				b = k + 1;
			
		
			}
		}
		
			
		}
		
		
		
		
		
		
		

	}

}
