package day08.selfTest;

/*
	문자와 출현수를 기억한 배열들 10개를 관리하는 배열을 만들고
	'A' - 'J' 를 랜덤하게 100번 반복해서 만들고
	배열에 카운트를 기억시켜서
	결과를 출력하세요.
*/

public class self08 {

	public static void main(String[] args) {
		int[][] mu = new int['J'-'A'+1][2];
		
		for(int i = 0; i < 100; i++) {
			int a = (int) (Math.random() * ('J' - 'A' + 1) + 'A');
			mu[a - 'A'][1] += 1; 
		}

		for(int i = 'A'; i < 'J' - 'A' + 1; i++) {
			mu[i - 'A'][i] = i;
		}
		
		for(int i = 'A' - 'A'; i < 'J' - 'A' + 1; i++) {
			
				
			System.out.println((char)(i + 'A') + "는 " + mu[i][1] + "개 입니다.");
			
			
		}
	}

}
