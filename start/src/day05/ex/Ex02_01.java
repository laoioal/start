package day05.ex;

/*
Ex02_01 ]
	3 ~ 10 사이의 정수를 랜덤하게 발생시켜서
	그 정수를 길이로 하는 영어 단어를 랜덤하게 만드세요.
	단, 시작문자는 대문자로 하고 나머지는 소문자로 하세요.
*/



public class Ex02_01 {

	public static void main(String[] args) {

		String str = "";
		String str1 = "";
		int a = (int) (Math.random()* 8 + 1 );
		System.out.println(a);
		
		for(int i = 0; i < a-1; i++) {
	
			char b = (char) ((Math.random() * ('z' - 'A' + 1) + 'A'));
			
			if( b >= 'a' && b <= 'z') {
				str += b;

			} else {
				i--;
			 }
			
		}

		
		for(int i = 0; i < 1; i++) {
			
			char b = (char) ((Math.random() * ('z' - 'A' + 1) + 'A'));
			
			if( b >= 'A' && b <= 'Z') {
				str1 += b;

			} else {
				i--;
			 }
			
		}
		System.out.println(str1 + str);
		
		
	}

}
