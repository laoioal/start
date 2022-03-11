package day06.exself;

/*
문제 1 ]
	3 ~ 100 사이의 숫자 중에서 소수만 모두 출력하세요.
*/

public class Ex01 {

	public static void main(String[] args) {
		
	int sum = 0;
		for(int i = 3; i < 101; i++) {
			for(int j = 1; j < i + 1; j++) {
				if(i % j == 0) {
					sum += 1;
				}
			}
				if(sum == 2) {
					System.out.println(i + "는 소수");
					sum = 0;
					
				} else {
					sum = 0 ;
					
				}
			
		}

	}

}
