package day07.selfTest;

/*
	6개의 메모리를 배열로 만들고
	그안에 랜덤한 숫자(정수)를 입력한 후 출력하세요
	1 ~ 45
*/

public class Ex01 {

	public static void main(String[] args) {
		int[] a = new int[6];
		
		
		//랜덤한수
		loop:
		for(int i = 0 ; i < a.length; i++) {
			int b = (int) (Math.random() * 45 + 1);
			
		
			// 중복 검사
			
				for(int j = 0 ; j < i; j++) {
					int tmp = a[j];
					if(b == tmp) {
						i--;
						continue loop;
					}
					
				}
				a[i] = b;
		}
		for(int j = 0; j < a.length; j++) {
		System.out.println(a[j]);
	}
	}
}
