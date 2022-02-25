package day03.selfTest;

import java.util.*;

import javax.swing.JOptionPane;
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

public class Self02 {
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("가로 : ");
		int width = a.nextInt();
		
		System.out.print("세로 : ");
		int hight = a.nextInt();
		System.out.println("가로 : " + width);
		System.out.println("가로 : " + hight);
		System.out.println("사각형 넓이 : " + (width * hight));
		System.out.println("삼각형 넓이 : " + (width * hight * 0.5));	
		
		
		
		/*
		 * 수정필요
		 * String width = "가로";
		JOptionPane.showInputDialog(null, width);
		
		String hight = "세로";
		JOptionPane.showInputDialog(null, hight);
		
		int a = Integer.parseInt(width);
		int b = Integer.parseInt(hight);
		int ab = a * b;
		JOptionPane.showMessageDialog(null, ab);
		*/
	}

}
