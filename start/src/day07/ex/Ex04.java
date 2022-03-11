package day07.ex;

/* 
 	5명의 학생의 이름을 기억할 배열을 만들고
 	각 학생의 시험성적을 기억할 배열을 만들고
 	결과를 출력하는 프로그램을 작성하세요
 	
 	출력 예 ]
 	
 		둘리 : 80
 		제니 : 90
 		리사 : 85
 		로제 : 85
 		지수 : 100
 		-----------
 		총점 : 000
 		평균 : 00.00
 */

public class Ex04 {

	public static void main(String[] args) {
		String[] pink = new String[] {"둘리", "제니", "리사", "로제", "지수"};
		int[] score = new int[5];
		int total = 0;
		
		
		for(int i = 0; i < score.length; i++) {
			int a = (int) ((Math.random() * 51) + 50);
			score[i] = a;
			total += score[i];
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(pink[i] + " : " + score[i]);
			System.out.println();
		}
		System.out.println("-------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + total / (double) pink.length);
	}

}
