package day07.selfTest;

/*
	5과목의 점수를 기억할 배열을 만들고
	과목 점수를 입력해서
	총점과 평균을 구하고 출력하세요
	배열에 담긴 점수도 같이 출력하세요
*/

public class Ex03 {

	public static void main(String[] args) {
		int[] a = new int[5];
		double result = 0;
		for(int i = 0; i < a.length; i++) {
			int b = (int) (Math.random() * 41 + 60);
			a[i] = b;
			System.out.print(a[i] + " : ");
			result += a[i];
			
			
		}
		System.out.print("총점 : " + result);
		System.out.print("평균 : " + result / a.length);
	}

}
