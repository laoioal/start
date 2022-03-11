package day06.exself;

/*
	문제 1 ]
		3 ~ 100 사이의 정수를 입력받아서
		이 정수가 소수인지 판단하는 프로그램을 작성하세요.
		
		참고 ]
			소수
				1과 자신으로만 나누어지는 수
				
	보너스 ]
		3 ~ 100 사이의 숫자 중에서 소수만 모두 출력하세요.
*/
import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3 ~ 100 사이의 정수를 입력해주세요 : ");
		
		int a = sc.nextInt();
		
		for(int i = 1; i < 101; i++) {
			if( a % i == 0) {
				sum += 1;
			}
			
		}
		if( sum == 2) {
			System.out.println(a + "는 소수입니다.");
			sum = 0; 
		} else  {System.out.println( a + "는 소수가 아닙니다.");
		sum = 0;}

	}

}
