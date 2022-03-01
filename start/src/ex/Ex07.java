package ex;

/*
 	문제 7 ]
 		5자리의 숫자를 입력한 후
 		각자리의 수의 합을 구하는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int a = sc.nextInt();
		
		int result = 0;
		int result1 = 0;
		int result2 = 0;
		int b = a;
		/*int result3 = 0;
		int result4 = 0;
		int result5 = 0;*/
		int i = 10000;
		
		while(i >= 1) {
			//System.out.println("b : "+b);
			result2 = b / i;
			result = result + result2;
			b = b - (result2 * i);
			i = (i / 10);
			
			//System.out.println("result2 : " + result2);
			//System.out.println("result : " + result);
			//System.out.println("i : " +i);	
			//System.out.println("-----------");
		}
		System.out.println("입력한 수 " + a + "의 각 자리수의 합은 " + result + "입니다." );
		
	}

}
