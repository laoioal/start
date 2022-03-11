package day07.selfTest;

/*
	Ex01 ]
		'A' - 'J' 까지의 문자를 랜덤하게 100개를 만들고
		각 문자의 출현 횟수를 기억할 배열을 만들어서
		횟수만큼 "*"로 출력해주는 프로그램을 작성하세요
		
		예 ]
			A [5] : *****
			B [20] : ********************
			
			...
			J [7] : *******
*/

public class Ex08 {

	public static void main(String[] args) {
		
		int[] a = new int['J' - 'A' + 1];
		
	
		
		
		for(int j = 0; j < 100; j++) {
			int ch = (int) (Math.random() * ('J' - 'A' + 1) + 'A') ;

			
			int num = ch - 'A';
			a[num] += 1 ; 
		
		}
		for(int i = 'A' - 'A'; i < 'J' - 'A' + 1; i ++ ) {
			int count = a[i];
			System.out.print((char) (i + 'A') + "[ " + count + " ] : " );
			for(int j = 0; j < count; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
