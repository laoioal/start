package day05.ex;

/*
문제 03_01 ]
	
	0 ~ 255 사이의 정수를 10개를 랜덤하게 만들고
	그 정수를 아스키 코드값으로 하는 문자열을 만들어서
	만들어진 문자열의 문자를 하나씩 추출해서
	추출한 문자가 
		대문자인지 소문자인지 특수문자인지를
	출력하는 프로그램을 작성하세요.
	
	참고 ]
		문자열의 길이를 알아내는 방법
			
			int 변수 = 문자열.length();
*/

public class Ex03_01 {

	public static void main(String[] args) {
		
		String str = "";
		
		
		for(int i = 0; i < 10; i++) {
			char num = (char) (Math.random() * 256 + 1);
			str += num;
		}
		System.out.println("출력된 문자 : " + str + "중");
		for(int i = 0; i < str.length(); i++) {
			
		char str1 = str.charAt(i);
		System.out.print( (i + 1) + "번째 문자 [ " + str1 + " ] 은/는 \n");
		
		if(str1 >= 'A' && str1 <= 'Z') {
			System.out.print("대문자\n");
		} else if(str1 >= 'a' && str1 <= 'z') {
			System.out.print("소문자\n");
		} else {
			System.out.print("특수문자\n");
		}
		}
	


	}

}
