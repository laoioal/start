package day03.selfTest;

import javax.swing.JOptionPane;

/*
 'J'에서 두번째 앞에 있는 문자는?
 */

public class Self01 {

	public static void main(String[] args) {
	
		int a = (char)('J' - 2) ;
		System.out.println(a);
		char c = 'J' - 2;
		System.out.println(c);
		String b = "J보다 2개 앞선 문자는? : " + (char)('J' - 2) ;
		JOptionPane.showMessageDialog(null, b);
		
		
		
				
		

	}

}
