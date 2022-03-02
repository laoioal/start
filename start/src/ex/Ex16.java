package ex;

/*
	문제 16 ]
		구구단을 다음 형식으로 출력하세요
		
		2 X 1 = 2		4 X 1 = 4		6 X 1 = 6		 8 X 1 = 8
		2 X 2 = 4		4 X 2 = 8		6 X 2 = 12		 8 X 2 = 16
		...
		2 X 9 = 18		4 X 9 = 36		6 X 9 = 54		 8 X 9 = 72
		
		3 X 1 = 3		5 X 1 = 5		7 X 1 = 7		 9 X 1 = 9
		3 X 2 = 6		5 X 2 = 10		7 X 2 = 14		 9 X 2 = 18
		...
		3 X 9 = 9		5 X 9 = 45		7 X 9 = 63		 9 X 9 = 81
		
		주의 ]
			카운터 변수의 사용 위치가 정해져 있는 것은 아니다.
*/

public class Ex16 {

	public static void main(String[] args) {
		
/*
		int i = 2;
		int j = 1;
	
		
		for(int k = 1 ; k < 10 ; k++) {
	
		
		
		while(i % 2 == 0 && i < 10 && j < 10) {
			
			System.out.print(i + " X " + j + " = " + (i * j));
			System.out.print("\t");
			i += 2;
			if(i == 10) {
				System.out.print("\n");
				break;
				}			 
		}
		
	
		i = 2;
		j = k+1;
		while(i % 2 != 0 && i < 10 && j < 10) {
			
			System.out.print(i + " X " + j + " = " + (i * j));
			System.out.print("\t");
			i += 2;
			if(i == 10) {
				System.out.print("\n");
				break;
				}		
		}
		}
	
	
		
		i = 3;
		j = 1;
	
		
		for(int k = 1 ; k < 10 ; k++) {
	
		
		
		while(i % 2 != 0 && i < 10 && j < 10) {
			
			System.out.print(i + " X " + j + " = " + (i * j));
			System.out.print("\t");
			i += 2;
			if(i > 10) {
				System.out.print("\n");
				break;
				}			 
		}
		
	
		i = 3;
		j = k+1;
		while(i % 2 != 0 && i < 10 && j < 10) {
			
			System.out.print(i + " X " + j + " = " + (i * j));
			System.out.print("\t");
			i += 2;
			if(i > 10) {
				System.out.print("\n");
				break;
				}		
		}
		}
	*/
		
		
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 9; j++) {
				
				for(int k = 0; k < 4; k++) {
					int dan = 2 * k + 2 + i;
					int gop = j + 1;
					
					// 출력
					System.out.print(dan + " X " + gop + " = " + (dan * gop) + "\t" );
					
				}
				System.out.println();
			}
			
			System.out.println();
		}
		
		
	}
}

	

	
		
//		System.out.println("i" + i);
//		System.out.println("j" + j);		
		


