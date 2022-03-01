package ex;

/*
 	'A' 부터 문자를 10개를 만들어서 출력하세요.
 */
public class Ex02 {

	public static void main(String[] args) {
		 int ch = 'A';
		 
		 for(int i = 0; i < 10; i++ ) {
			 int a = ch + i;
			 char b = (char) a;
			 System.out.println((i+1) + "번째 영문은 " + b + "입니다.");
		 }

	}

}
