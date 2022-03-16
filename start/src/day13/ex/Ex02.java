package day13.ex;

public class Ex02 {
	
	/*
	 	String[] arr = {"123" , "465", "789", ..};
	 	가 있는 경우
	 	이 배열이 기억하는 숫자형태의 문자열을 정수로 바꾼 데이터들의
	 	합과 평균을 구하는 프로그램을 작성하세요.
	 	
	 	단, 발생할 수 있는 예외를 가정하여 모두 처리하세요
	 		1. 배열의 범위를 벗어나서 사용하는 경우
	 		2. 숫자로 변환이 불가능한 경우
	 		3. 평균을 계산하는데 0으로 나누는 경우
	 		4. 위의 세가지 이외의 경우 ...
	 */

	String[] arr = {"123" , "456", "789" , "0-="};
	
	public Ex02() {
		getSum();
	}

	public void getSum() {
		int num = 0;
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < arr.length; i++) {
			try {
				int a = Integer.parseInt(arr[i]);
				sum += a;
			
			} catch(ArrayIndexOutOfBoundsException e) {
				num = i;
				break;
			} catch(NumberFormatException e) {
				num = i;
				break;
			} catch(ArithmeticException e) {
				num = i;
				break;
			} 
			
			
			
		}
		avg = sum / num;
		System.out.println("배열의 합은 : " + sum);
		System.out.println("배열의 평균은 : " + avg);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Ex02();
	}

}
