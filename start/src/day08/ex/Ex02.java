package day08.ex;

/*
 	7학생의 5과목 점수를 랜덤하게 만들어서 기억시키고
 	각 학생 배열의 맨 마지막에는 총점을 계산해서 입력되게 하고
 	결과를 출력하는데
 	평균도 계산해서 출력하세요 
  
 
 	Ex02 ]
 		Ex01에서 만든 배열의 내용을
 		다섯과목의 7학생 배열로 바꿔서
 		해결하세요
 		
 		bonus ]
 			Ex01의 각 학생의 항목에 석차도 입력되도록 하세요
 			그후 내림차순 정렬하세요.
 		
 */

public class Ex02 {

	public static void main(String[] args) {
		int[][] score = new int[5][8];
		double avg = 0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length - 1; j++) {
				int a = (int) (Math.random() * 41 + 60);
				
				score[i][j] = a;
				score[i][7] += score[i][j];
			}
			
		}
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				avg = score[i][7] / (double)(score[i].length -1) ;
				System.out.print(score[i][j] + " : ");
				
				
				
		
			}
			System.out.print(avg);
			System.out.println();
		}

		
		
		
		
	}

}
