package ex;

/*
 	문제 6 ]
 		랜덤하게 정수를 컴퓨터가 만들어 내면
 		그 수를 알아맞추는 게임을 만드세요
 		
 		예 ]
 			
 			발생숫자 : 54
 			
 			사용자 입력숫자 : 45
 			
 			==> "입력한 수가 더 작습니다."
 			로 메세지를 출력해서 사용자가 숫자를 알아맞추는 게임...
 			
 			횟수도 같이 출력되게 하세요.
 
 	
 */

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		
		int num = (int) (Math.random() * (100 - 1 + 1) + 1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();
		
		int result = 1;
		// 1 = 동일합니다.
		// 2 = 입력된 수가 더 작습니다.
		// 3 = 입력된 수가 더 큽니다.
		int b = 0;
		
		if(num == a) {
			result = 1;
		} else if (num > a) {
			result = 2;
		} else {
			result = 3;
		}
		
		System.out.println("컴퓨터의 수 : " + num);
		
		do {System.out.println("실행횟수 : " + (b + 1));
		b++;
			System.out.print("숫자를 다시 입력해주세요 : ");
			a = sc.nextInt();
			
		switch(result) {
			
		case 2: System.out.println("입력된 수가 더 작습니다.");
		
			break;
		
		case 3: System.out.println("입력된 수가 더 큽니다.");
		
			break;
		}
		
		}
		while (num != a) ;
		System.out.println("동일합니다.");
		
	
		

	}

}
