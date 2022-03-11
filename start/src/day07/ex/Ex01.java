package day07.ex;

import java.util.Arrays;

/*
 	Ex01 ]
 		'A' - 'J' 까지의 문자를 랜덤하게 100개를 만들고
 		각 문자의 출현 횟수를 기억할 배열을 만들어서
 		횟수만큼 "*"로 출력해주는 프로그램을 작성하세요
 		
 		예 ]
 			A [5] : *****
 			B [20] : ********************
 			
 			...
 			J [7] : *******
 */

public class Ex01 {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int E = 0;
		int F = 0;
		int G = 0;
		int H = 0;
		int I = 0;
		int J = 0;
		
		int[] a = new int[10];
		
		
		
		for(int i = 0; i < 100; i++) {
			int b = (int) ((Math.random() * ('J' - 'A' + 1) + 'A'));
			
			
			
			for(int j = 'A'; j < 'J' + 1; j++) {
						if(b==j) {			
				switch(j) {
				
				case 'A': A = A + 1;
				break;
				
				case 'B': B = B + 1;
				break;
				
				case 'C' : C = C + 1;
				break;
				
				case 'D' : D = D + 1;
				break;
				
				case 'E' : E = E + 1;
				break;
				
				case 'F' : F = F + 1;
				break;
				
				case 'G' : G = G + 1;
				break;
				
				case 'H' : H = H + 1;
				break;
				
				case 'I' : I = I + 1;
				break;
				
				case 'J' : J = J + 1;
				break;
				
				}
				
				
				}
						
			}
			
				
				}

	for(int i = 0; i < a.length; i++) {
		
	}
	
		
		
		
	}
}



