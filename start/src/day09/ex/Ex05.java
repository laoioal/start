package day09.ex;

/*
 	문제 5 ]
 		10 학생의 국어, 영어, 수학 점수를 랜덤하게 입력받아서
 		총점과 석차를 구하는 프로그램을 작성하세요
 		
 		각 학생의 점수입력, 총점계산, 석차계산, 출력은 함수로 처리하세요
 */

public class Ex05 {
	
	public Ex05() {
		int[][] stud = new int[10][5];
	

	arr(stud);
	sum(stud);
	rank(stud);
	toPrint(stud);
	
	}
	
	public static void main(String[] args) {
		new Ex05();

	}
	
	// 랜덤하게 점수 입력해서 배열에 넣기
	public int[][] arr(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length - 2; j++) {
				arr[i][j] = (int) (Math.random() * 41 + 60);
			}
		}
		return arr;
	}
	
	// 총점 계산하기
	public int[][] sum(int[][] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length - 2; j++) {
				arr[i][3] += arr[i][j];
			}
		}
		return arr;
	}
	
	// 석차 계산하기
	public int[][] rank(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i][3] > arr[j][3]) {
					arr[j][4] += 1;
				}
			}
				
		}
		return arr;
	}
	
	// 출력
	public void toPrint(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print((char) ('A' + i) + " 학생의 점수는");
			for(int j = 0; j < arr[i].length -2; j++) {
			
			System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
			System.out.print("총점과 석차는 : " + arr[i][3] + ", " + (arr[i][4] + 1));
			System.out.println();
		}
	}

}
