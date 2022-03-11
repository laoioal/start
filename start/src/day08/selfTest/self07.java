package day08.selfTest;

/*
	세명의 학생의
	java, db, web, jsp, spring 점수를 기억할 배열을 만들고
	각 과목의 점수를 랜덤하게 만들어서 입력하고
	결과를 출력하는 프로그램을 작성하세요.
	
	+ 총점구하기
	
*/

public class self07 {

	public static void main(String[] args) {
		int[][] stu = new int[3][5];
		int[] total = new int[3];
		for(int i = 0; i < stu.length; i++) {
			
			for(int j = 0; j < stu[i].length; j++) {
				int a = (int) (Math.random() * 41 + 60);
				stu[i][j] = a;
				total[i] += stu[i][j];
				System.out.print(stu[i][j] + " : ");
			}
			System.out.print("총점 : " + total[i]);
			System.out.println();
			
		}
		
		

	}

}
