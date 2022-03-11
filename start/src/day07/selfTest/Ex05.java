package day07.selfTest;

/*
	1 ~ 10까지 정수를 순서대로 배열에 기억시키고
	이 숫자를 랜덤하게 섞어서 출력되도록 하세요
	
	방법 ]
		배열의 특정 위치 2개를 꺼내서 데이터를 바꾼다.
		이 과정을 많이 하면 할수록 데이터가 섞이게 된다.
*/

public class Ex05 {

	public static void main(String[] args) {
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		
		for(int j = 0; j < 100; j++) {
			int b = (int) (Math.random() * 10 );
			int c = (int) (Math.random() * 10 );
			
			if( b == c) {
				j--;
			}
			
			int tmp = a[b];
			a[b] = a[c];
			a[c] = tmp;
			
			
			
		
		}
		for(int no : a) {
		System.out.println(no);
		}
	}

}
