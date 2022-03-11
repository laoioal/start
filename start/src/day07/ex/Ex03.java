package day07.ex;

/*
 	반지름 5개를 기억하는 배열을 만들고
 	랜덤하게 반지름을 만들어서 기억시키고
 	각각의 원의 넓이를 계산해서 출력해주는 프로그램을 작성하세요
 	넓이도 배열에 기억시켜주세요 
 */

public class Ex03 {

	public static void main(String[] args) {
		int[] a = new int[5];
		double[] c = new double[5];
		double ban = 3.14;
		
		for(int i = 0; i < a.length ; i++) {
			int b = (int) (Math.random() * 100 + 1);
			a[i] = b;
			
		}
		
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] * a[i] * ban;
			System.out.print((i + 1) + "번째 반지름" + a[i] + "을 가진 원의 넓이 : " + c[i]);
			System.out.println();
			
		}
		

	}

}
