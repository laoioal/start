package day03.ex;

/*
 	문제 1 ]
 		두개의 숫자를 입력받은 후(가로, 세로)
 		그 숫자를 이용해서
 		사각형의 넓이와 ==> 가로 * 세로
 		삼각형의 넓이를 구해서 ==> 밑변 * 높이 * 1/2
 		결과를 출력하세요
 		
 		출력형식 ]
 		
 			가로 : xxxx
 			세로 : xxxx
 			사각형 넓이 : xxxx
 			삼각형 넓이 : xxxx.xxx
 			
 	참고 ]
 		자바에서 * 기호의 의미
 			연산자로서 곱하기의 의미
 			모든것 을 의미
 */

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		//입력도구 준비
		//Scanner sc = new Scanner(System.in);
		
		//입력 메세지 출력
		//System.out.print("가로 : ");
		
		/*
		 * 문자열로 입력받아서 처리하는 방법
		String garo = sc.nextLine(); //문자열로 입력받는 방법
		// 정수형태의 문자열을 정수로 변환하는 방법
		// Integer.parseInt(문자열);
		int width = Integer.parseInt(garo);
		
		System.out.println("입력된 가로 : " + (garo + 20));
		
		*/
		
		/*
		 * 정수로 입력받는 방법
		   	int 변수이름 = sc.nextLine(); 
		 */
		
		//int width = sc.nextInt();
			
		
		//출력

		//System.out.println("입력된 정수 가로 : " + width);

		// 메세지 출력
		//System.out.print("세로 : ");
		//int sero = sc.nextInt();
		
		//System.out.println("입력된 세로 : " + sero);
		
		
	/*	
		Scanner sc = new Scanner(System.in); //입력도구 준비
		int width = sc.nextInt(); // 가로 입력
		int hight = sc.nextInt(); // 세로 입력
		
		System.out.println("가로 : " + width); // 가로 출력
		System.out.println("세로 : " + hight); // 세로 출력
		
		
		System.out.println("사각형의 넓이 : " + (width * hight)); // 사각형의 넓이
		System.out.println("삼각형의 넓이 : " + (width * hight * 0.5)); // 삼각형의 넓이
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 : ");
		int width = sc.nextInt();
		System.out.println("가로 : " + width);
		
		System.out.println("세로 : ");
		int hight = sc.nextInt();
		System.out.println("세로 : " + hight);
		
		System.out.println("사각형의 넓이 : " + (width * hight)); // 사각형의 넓이
		System.out.println("삼각형의 넓이 : " + (width * hight * 0.5)); // 삼각형의 넓이
		
		
		
		
		
	}

}
