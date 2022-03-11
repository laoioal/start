package day08.selfTest;

/*
	+, -, *, / 연산을 하는
	연산식을 입력하면
	결과를 보여주는 계산기 프로그램을 작성하세요
	
	단, 연산식을 문자열 배열에 담아서 처리하세요
	
	예 ]
		2*3 
		
		String[] sik = new String[3];
		sik[0] = 2;
		sik[1] = *;
		sik[2] = 3;
		
		따라서
		연산기호가 오는 위치 이전까지 문자열을 잘라서 첫번째 기억시키고
		연산기호를 두번째 위치에 기억시키고
		나머지를 마지막 위치에 기억시켜서 처리한다.
		
		32342*
		
*/

import java.util.*;

public class self06 {
	
	public static void main(String[] args) {
		
		String[] sik = new String[3];
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산식을 입력하세요");
		String a = sc.nextLine();
		
		for(int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i); 
			
			if(ch < '0' || ch > '9') {
				index = i;
			break;	
			}
				
		}
			sik[0] = a.substring(0,index);
			sik[1] = a.substring(index, index+1);
			sik[2] = a.substring(index+1);
			
			int no1 = Integer.parseInt(sik[0]);
			int no2 = Integer.parseInt(sik[2]);
			double result = 0;
			
		
			switch(sik[1]) {
			case "+" :
				result = no1 + no2;
				break;
				
			case "-" :
				result = no1 - no2;
				break;
				
			case "*" :
				result = no1 * no2;
				break;
				
			case "/" :
				result = no1 / no2;
				break;
			
			}
		
			System.out.println(result);


			
			
		
		
		
	}

}
