package day14.ex;

import java.util.StringTokenizer;

public class TokenTest02 {

	public TokenTest02() {
		String str = "고구마,감자,치킨,햄버거,피자,회,삼겹살";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		int len = st.countTokens();
		String[] abc = new String[len];
		
		int idx = 0;
		while(st.hasMoreTokens()) {
			
			String black = st.nextToken();
			abc[idx] = black;
			idx++;
			
			System.out.println(black);
			
		}
		
	}

	public static void main(String[] args) {
		new TokenTest02();
	}

}
