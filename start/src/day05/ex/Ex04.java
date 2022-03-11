package day05.ex;

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
	/*	int a = 3800;
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
		*/
		
		// 할일
		// 1. 입력도구를 준비한다.
		Scanner sc = new Scanner(System.in);
		// 2. 용도 입력 메세지 출력한다.
		while(true) {
		System.out.print("사용용도 코드를 입력하세요!\n\t가정용\t1\n\t산업용\t2\n\t교육용\t3\n\t상업용\t4\n\t종료\t0\n입력코드 : ");
		// 3. 입력받아서 변수에 기억시킨다.
		int code = sc.nextInt();
		/*
		 	블럭킹함수(Blocking Method)
		 		: 특정상황이 될때까지 그 함수에서 실행을 멈추고 기다리는 함수
		 */
		
		if(code == 0 ) {
			// 이 경우는 프로그램을 즉시 종료해야 하므로
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		//System.out.println("입력코드 : " + code);
		// 2 - 1. 사용량 입력 메세지 출력한다.
		System.out.print("사용량 입력 : ");
		// 3 - 1. 입력받아서 변수에 기억시킨다.
		int sayong = sc.nextInt();
		
		// 4. 용도에 맞게 계산해서 변수에 기억시키고 출력
		String yd = "";
		int money = 0;
		
		
		switch(code) {
		case 1:
			yd = "가정용";
			money = 3000 + 245 * sayong;
			System.out.println("입력된 코드는 " + yd + "용으로 사용량은 " + sayong + " 이고\n전기요금은 " + money + "원 입니다.");
			break;
			
		case 2:
			yd = "산업용";
			money = 2400 + 157 * sayong;
			System.out.println("입력된 코드는 " + yd + "용으로 사용량은 " + sayong + " 이고\n전기요금은 " + money + "원 입니다.");
			break;
			
		case 3:
			yd = "교육용";
			money = 2900 + 169 * sayong;
			System.out.println("입력된 코드는 " + yd + "용으로 사용량은 " + sayong + " 이고\n전기요금은 " + (2900 + 169 * sayong) + "원 입니다.");
			break;
			
		case 4:
			yd = "상업용";
			money = 3200 + 174 * sayong;
			System.out.println("입력된 코드는 " + yd + "용으로 사용량은 " + sayong + " 이고\n전기요금은 " + (3200 + 174 * sayong) + "원 입니다.");
			break;
		}
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println();
		}
		
			

	}

}
