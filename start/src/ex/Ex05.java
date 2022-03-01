package ex;

/*
 	문제 5 ]
 		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
 		
 		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
 		가위, 바위, 보로 가정하고 
 		사용자는 키보드를 이용해서 1 ~ 3사이의 숫자를 입력하도록 한다.
 		
 		누가 이겼는지를 확인하는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int str1 = sc.nextInt();
		String str2 = "";
		
		
		if(str1 == 1) {
			str2 = "가위";
		} else if(str1 == 2) {
			str2 = "바위";
		} else { str2 = "보"; }
		
		
	
		int num = (int) (Math.random() * (3 - 1 + 1) + 1 );
		String str = "";
		
		if(num == 1) {
			str = "가위";
		} else if(num == 2) {
			str = "바위";
		} else { str = "보"; }
		
		System.out.println("컴퓨터 : " + str);
		System.out.println("사용자 : " + str2);

		if(str2 == "가위" & str == "가위") {
			System.out.println("무승부");
		} else if(str2 == "가위" & str == "바위") {
			System.out.println("컴퓨터가 승리했다!");
		} else if(str2 == "가위" & str == "보") {
			System.out.println("사용자가 승리했다!");
		} else if(str2 == "바위" & str == "가위") {
			System.out.println("사용자가 승리했다!");
		} else if(str2 == "바위" & str == "바위") {
			System.out.println("무승부");
		} else if(str2 == "바위" & str == "보") {
			System.out.println("컴퓨터가 승리했다!");
		} else if(str2 == "보" & str == "가위") {
			System.out.println("컴퓨터가 승리했다!");
		} else if(str2 == "보" & str == "바위") {
			System.out.println("사용자가 승리했다!");
		} else if(str2 == "보" & str == "보") {
			System.out.println("무승부");
		}
		
		

		

		
		
	}

}
