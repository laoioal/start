package sub0405;

/*
 	3 ~ 10 사이의 정수를 랜덤하게 발생시켜서
	그 정수를 길이로 하는 영어 단어를 랜덤하게 만드세요.
	단, 시작문자는 대문자로 하고 나머지는 소문자로 하세요.
 */

public class Ex02_01 {

	public Ex02_01() {
		String str = "adfspae";
		
		char ch = str.charAt(0);
		String na = str.substring(1);
		
		// ch를 대문자로 
		char ch1 = (char) (ch - ('a' - 'A'));
		
		str = ch1 + na;
		
	
		
	}
	
	public static void main(String[] args) {
		new Ex02_01();
	}

}
