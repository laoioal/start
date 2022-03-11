package day07.selfTest;

/*
	10개의 정수를 랜덤하게 발생시켜서 기억하는 배역을 만들고
	기억된 수중 가장 큰수를 알아내는 프로그램을 작성하세요
*/

public class Ex06 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		loop:
		for(int i = 0; i < a.length; i++) {
			int b = (int) (Math.random() * 100 + 1);
			
			for(int j = 0; j < i; j++) {
				if(b == a[j]) {
					i--;
					continue loop;
				}
			}
			a[i] = b;
		}
		int max = a[0];
		
		for(int i = 1; i <a.length; i++) {
			
				int tmp = a[i];
				if(tmp > max) {
				max = tmp;
						
			}
			
			
			
	
			
			
		}
		for(int abc : a) {
			System.out.print(abc + " | ");
		}
		System.out.println("max : " + max);

	}

}
