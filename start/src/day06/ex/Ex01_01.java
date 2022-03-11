package day06.ex;

/*
	문제 1 ]
		3 ~ 100 사이의 숫자 중에서 소수만 모두 출력하세요.
*/

public class Ex01_01 {

	public static void main(String[] args) {
		
		int num = 0;
		
		for(int i = 100; i > 2; i--) {
			
			for(int j = i; j > 0; j--) {
				if(i % j == 0 ) {
					num += 1;
					
			
				}
			}
				if(num > 2) {
					num = 0;
					
				}
				if(num == 2) {
					System.out.println(i);
					num = 0;
					
				}
			
				
		}

	}

}
