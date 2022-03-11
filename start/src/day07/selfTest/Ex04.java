package day07.selfTest;

/*
 	5과목의 점수를 기억할 배열을 만들고
 	과목 점수를 입력해고
 	총점도 배열의 마지막에 계산해서 입력하고
 	평균을 구하고 출력하세요
 	배열에 담긴 과목 점수도 같이 출력하세요
 */


public class Ex04 {

	public static void main(String[] args) {
		int[] a = new int[6];
		int result = 0;
		
		for(int i = 0; i < a.length -1; i++) {
			int b = (int) (Math.random() * 41 + 60);
				a[i] = b;
			System.out.print(a[i] + " | ");
			
		}
		for(int i = 0; i < a.length -1; i++) {
			result += a[i];
		}
		
		a[a.length -1] = result;
		System.out.println("총점 : " + result);
		System.out.println("평균 : " + (double) result / (a.length- 1));
	}

}
