package day14.ex;

import java.util.StringTokenizer;

public class TokenTest01 {

	public TokenTest01() {
		String str = "고구마,감자,치킨,햄버거,피자,회,삼겹살";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		int len = st.countTokens();
		
		String[] i = new String[len];
		
		int idx = 0;
		
		while(st.hasMoreTokens()) {
			
			
		String abc = st.nextToken();	
		
		i[idx] = abc;
		idx++;
		
		
		System.out.println(abc);
		}
	}

	public static void main(String[] args) {
		new TokenTest01();
	}

}
