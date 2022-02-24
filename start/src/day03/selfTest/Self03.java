package day03.selfTest;

import java.util.*;

/*
	문제 2 ]
		하나의 숫자를 입력받은 후(원의 반지름)
		그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
		
		참고 ]
			원의 넓이 : 반지름 * 반지름 * 3.14
			원의 둘레 : 2 * 반지름 * 3.14
*/

public class Self03 {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("원의 반지름 : ");
		double num = a.nextDouble();
		System.out.println("원의 반지름 : " + num);
		System.out.println("원의 넓이 : " + num * num * 3.14);
		System.out.println("원의 넓이 : " + num * 2 * 3.14);
		
		
		
		
		
	}

}
