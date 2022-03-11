package day07.selfTest;


/*
 	Ex02 ]
 		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1}
 		을 준비하고
 		
 		79456원을 coin에 기억된 화폐단위로 지불하려고 할 때 각각의 단위가 몇장씩 필요한지
 		배열에 기억시켜서 배열의 내용을 출력하세요
 		
 		출력 예 ]
 		
 			10000	: 7
 			5000	: 1
 			...
 			1		: 6 
 */

public class Ex09 {

	public static void main(String[] args) {
		int[] a = new int[]{10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] b = new int[a.length];
		int money = 79456;
		
		for(int i = 0; i < a.length; i++) {
			b[i] = money / a[i];
			money = money % a[i];
		}
		
		for(int j = 0; j < a.length; j++) {
			int count = b[j];
			
			System.out.print(a[j] + " : " + count);
			System.out.println();
		}
		
		
	}

}
