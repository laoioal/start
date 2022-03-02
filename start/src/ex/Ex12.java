package ex;



/*
 	문제 12 ]
 		5자리(10000~99999) 숫자 하나를 입력받아서 
 		이 숫자가 회문수인지 아닌지 판별하는 프로그램을 작성하세요.
 		
 		
 		참고 ]
 			회문수란?
 				첫번째 자리수와 마지막 자리수
 				두번째 자리수와 마지막 자리수에서 두번째 자리수
 				...
 				가 동일한 수를 말한다.
 				
 				abcde 
 				이 숫자가 회문수가 되려면
 				a == e
 				b == d
 				
 */

public class Ex12 {

	public static void main(String[] args) {
		
		int a = (int) (Math.random() * (99999-10000+1)+10000);
		
		
		int su1 = 0;
		int su2 = 0;
		int su3 = 0;
		int su4 = 0;
		int su5 = 0;

		int b = 10000;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;

		
	
			d = (a / b);
			su1 = a - (d * b);
			b = b / 10;
			
			e = (su1 / b);
			su2 = su1 - (e * b);
			b = b / 10;
			
			f = (su2 / b);
			su3 = su2 - (f * b);
			b = b / 10;
			
			g = (su3 / b);
			su4 = su3 - (g * b);
			b = b / 10;
			
			h = (su4 / b);
			su5 = su4 - (h * b);
			b = b / 10;
			
		
			if(d == h && e == g) {
				System.out.println("입력한 " + a + "는 회문수입니다.");
				} else {
					System.out.println("입력한 " + a + "는 회문수가 아닙니다.");
				}
			

			
		
		

		 
	}

	
}
