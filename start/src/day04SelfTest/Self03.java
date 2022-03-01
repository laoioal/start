package day04SelfTest;

/*
	문제 2 ]
	  		알파벳 문자를 임의로 랜덤하게 입력한 후
	  		그 문자가 대문자이면 소문자로
	  		소문자이면 대문자로 변환하고
	  		만약 특수문자이면 그 문자 그대로
	  		출력하는 프로그램을 작성하세요.
	  		
	  	참고 ]
	  		아스키 코드는
	  		
	  		특수문자 - 숫자(0 ~ 9) - 특수문자 - 영문대문자( A ~ Z) - 특수문자 - 소문자( a ~ z) - 특수문자
	  		
	  	참고 ]
	  		문자열에서 문자를 추출하는 방법
	  		
	  			문자열.charAt(위치값)
	  			
	  		이떄 위치값은 0부터 시작한다.
	  		
	  		예 ]
	  			"abcd" 에서 두번째 문자를 추출하려면
	  			
	  			"abcd".charAt(1) ==> 'b'
	  			
	  			'J' -> 'j'
	  			
	  			(char)('J' + ('a' - 'A'))
	 */

import java.util.*;

public class Self03 {

	public static void main(String[] args) {
	
		//알파벳 입력
		Scanner sc = new Scanner(System.in);
		
		//입력 메세지창
		System.out.print("문자 입력");
		String a = sc.nextLine();
		
		//문자열 char 타입으로 변환
		char b = a.charAt(0);
		
		char result = (char) ((b < 'A') ? (b) : ( (b >= 'A' & b <= 'Z') ? (b + ('a' - 'A') ) : ( (b >= 'a' & b <= 'z') ? (b - ('a' - 'A')) : (b)))) ;
		
		System.out.println("입력값 : " + b);
		System.out.println("변환값 : " + result);
		

	}

}
