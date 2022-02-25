package day03.selfTest;

import javax.swing.JOptionPane;

/*
 	1) 'J'에서 두번째 앞에 있는 문자는?
 	2) 'h'에서 세번째 이후 문자는?
 */

public class Self01 {

	public static void main(String[] args) {
	
		// 1번 문제
		int a = 'J' - 2 ;
		System.out.println(a);
		char c = 'J' - 2;
		System.out.println(c);
		String b = "J보다 2개 앞선 문자는? : " + (char)('J' - 2) ;
		JOptionPane.showMessageDialog(null, b);
		
		// 2번 문제
		char num = 'h' + 3;
		System.out.println(num);
		
		/*
		char abc = 'a' + 2;
		System.out.println(abc);
		*/
		
		
		
		
				
		

	}

}
