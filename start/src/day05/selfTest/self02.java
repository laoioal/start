package day05.selfTest;

/*
	'A' 부터 문자를 10개를 만들어서 출력하세요.
*/

public class self02 {

	public static void main(String[] args) {
		
		for(int i =0; i < 9; i++) {
			char a = (char) ('A' + i);
			System.out.println(a);
		}

	}

}
