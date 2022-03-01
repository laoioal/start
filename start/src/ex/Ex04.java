package ex;

/*
 	문제 4]
 		전기요금을 계산해주는 프로그램을 작성하세요.
 		
 		전기요금표
 		
 						코드		기본요금			사용요금
 			가정용		1			3800				245
 			산업용		2			2400				157
 			교육용		3			2900				169
 			상업용		4			3200				174
 			
 		전기요금은
 			기본요금 + 사용량 * 사용요금
 			
 			사용자 코드와 사용량을 입력하면
 			전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		int a = 3800;
		int b = 2400;
		int c = 2900;
		int d = 3200;
		
		int sa1 = 245;
		int sa2 = 157;
		int sa3 = 169;
		int sa4 = 174;
		int result = 0;

		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("코드입력 : ");
		int str1 = sc.nextInt();
		System.out.print("사용량 : ");
		int str2 = sc.nextInt();
		
		

		switch(str1) {
		case 1: result = (a + (str2 * sa1));
		System.out.println("전기 사용요금은 : " + result + " 입니다.");
		break;
		
		case 2: result = (b + (str2 * sa2));
		System.out.println("전기 사용요금은 : " + result + " 입니다.");
		break;
		
		case 3: result = (c + (str2 * sa3));
		System.out.println("전기 사용요금은 : " + result + " 입니다.");
		break;
		
		case 4: result = (d + (str2 * sa4));
		System.out.println("전기 사용요금은 : " + result + " 입니다.");
		break;
		}
		
			

	}

}
