package day05.selfTest;

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

public class self04 {

	public static void main(String[] args) {
		//입력프로그램
		Scanner sc = new Scanner(System.in);
		
		
		
		String str = "가정용";
		
		
		while(true) {
			System.out.println("코드를 입력해주세요.\n\t가정용\t1\n\t산업용\t2\n\t교육용\t3\n\t상업용\t4\n\t종료\t0");
			int num = sc.nextInt();
			
			
			
			
			if(num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.println("사용량을입력해주세요.");
			int num2 = sc.nextInt();
			
			switch(num) {
			case 1:
				str = "가정용";
				System.out.println("용도 : " + str + ", 사용량 : " + num2 + "이며, " + "요금은 " + (3800 + (num2 * 245)) + "입니다.");
				break;
			case 2:
				str = "산업용";
				System.out.println("용도 : " + str + ", 사용량 : " + num2 + "이며, " + "요금은 " + (2400 + (num2 * 157)) + "입니다.");
				break;
			case 3:
				str = "교육용";
				System.out.println("용도 : " + str + ", 사용량 : " + num2 + "이며, " + "요금은 " + (2900 + (num2 * 169)) + "입니다.");
				break;
			case 4:
				str = "상업용";
				System.out.println("용도 : " + str + ", 사용량 : " + num2 + "이며, " + "요금은 " + (3200 + (num2 * 174)) + "입니다.");
				break;
			}
			
		}
		
		
		

	}

}
