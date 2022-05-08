package sub0504;

import java.util.Scanner;

/*
 			 *			5+0보다 작을때까지 반복 / 4보다 작을때까지는 공백-> '' 4이상일 경우 *	5 - i(0) -1 = 4 
 			***			5+1보다 작을때까지		/ 3 					 		3이상일 경우 *	5 - i(1) -1 = 3
 		   *****		5+2보다 작을때까지		/ 2
 		  *******
 		 *********
 		 
 		 
 		 
 j < no -1 + i + 1
 
 j < no + i
 */

public class test03 {

	public test03() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자입력 : ");
			String sno = sc.nextLine();
			if(sno.equals("q")) break;
			
			int no = 0;
			try {
				no = Integer.parseInt(sno);
				
				for(int i = 0; i < no; i++) {
					for(int j = 0; j < no + i; j++) {
						char ch = '*';
						if(j < no -1 - i) {
							ch = ' ';
						}
						System.out.print(ch);
					}
					System.out.println();
				}
				
			} catch(Exception e) {
				continue;
			}
			
			
		}
	}

	public static void main(String[] args) {
		new test03();
	}

}
