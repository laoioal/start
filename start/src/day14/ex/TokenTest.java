package day14.ex;

import java.util.StringTokenizer;

public class TokenTest {

	public TokenTest() {
		String str = "a;b;c;d;e;f";
		
		StringTokenizer token = new StringTokenizer(str, ";");
		
		int len = token.countTokens();
		
		String[] to = new String[len];
		
		int idx = 0;
		
		while(token.hasMoreTokens()) {
			
			String black = token.nextToken();
			to[idx] = black;
			idx++;
			System.out.println(black);
		}
	}
	public static void main(String[] args) {
		new TokenTest();
	}

}
