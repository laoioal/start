package day09.ex;

/*
 	문제 4 ]
 		1차원 배열에 정수 10개를 입력한 후
 		합계와 평균을 구해주는 프로그램을 작성하세요
 		
 		배열에 정수를 랜덤하게 채워주는 함수
 		합계를 계산해주는 함수
 		평균을 계산해주는 함수
 		출력해주는 함수
 */

public class Ex04 {
	public Ex04() {
		int[] score = new int[10];
		
		arr(score);
		int sum = sum(score);
		double avg = avg(score);
		toPrint(score, sum, avg);
		
	}

	public static void main(String[] args) {
		new Ex04();
	}
	
	// 랜덤하게 배열에 정수를 넣기
	public int[] arr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		return arr;
		
	}
	// 합계
	public int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public double avg(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
	}
		double avg = sum / (double) (arr.length );
		return avg;	
	}
	
	// 출력
	public void toPrint(int[] arr, int a, double b) {
		
		System.out.print("10개의 정수 : ");
		for(int k : arr) {
		System.out.print(k + " : ");
		}
		System.out.print(" 의 합은" + a + "이고 평균은 " + b + " 이다.");
	}
	
}
