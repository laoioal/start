package day08.selfTest;

/*
	"Black Pink" 라는 문자열을 기억하는 변수 str을 만들고
	그중에서
		1. Black만 주출해서 출력
		2. Pink만 추출해서 출력
		
*/

	

public class self05 {

	public static void main(String[] args) {
		String str = "Black Pink";
		
		String word1, word2;
		
		int a = str.indexOf(' ');
		
		word1 = str.substring(0, a);
		word2 = str.substring(a + 1);
		
		System.out.println(word1);
		System.out.println(word2);

	}

}
