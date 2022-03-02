package ex;

/*
Ex02_01 ]
	3 ~ 10 사이의 정수를 랜덤하게 발생시켜서
	그 정수를 길이로 하는 영어 단어를 랜덤하게 만드세요.
	단, 시작문자는 대문자로 하고 나머지는 소문자로 하세요.
*/



public class Ex02_01 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * (10 - 3 + 1) +3);
		int b = 0;
		int c = 0;
		
		//정수의 길이
		for(c = 0; c <= a; c++) {
		while(c <= a) {
			b = 10^c;
			
		}
				System.out.println(c);
				System.out.println(b);
				
			}
					
					
	}
		

	

}
