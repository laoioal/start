package day08.ex;



/*
 	7학생의 5과목 점수를 랜덤하게 만들어서 기억시키고
 	각 학생 배열의 맨 마지막에는 총점을 계산해서 입력되게 하고
 	결과를 출력하는데
 	평균도 계산해서 출력하세요
 	
 			bonus ]
 			Ex01의 각 학생의 항목에 석차도 입력되도록 하세요
 			그후 내림차순 정렬하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		// 학생 배열
		int[][] stud = new int[7][6];
		double avg = 0;
		int[] score = new int[7] ;
		
		
		for(int i = 0; i < stud.length; i++) {
			
			for(int j = 0; j < stud[i].length - 1; j ++) {
				int a = (int) (Math.random() * 101 + 1);
				stud[i][j] = a;
				stud[i][5] += stud[i][j];
								
			
				//System.out.print(stud[i][j] + " : ");
		}
		//	System.out.println();
		
		}
		
		for(int i = 0; i < stud.length; i++) {
			
			for(int j = 0; j < stud[i].length; j ++) {
			
						avg = stud[i][5] / (double) (stud[i].length - 1);		
			
				System.out.print(stud[i][j] + " : ");
		}
			System.out.print(avg);
			System.out.println();
		
		}
	
		System.out.println("-------------");
		
		
		for(int i = 0; i < stud.length; i++) {
			for(int j = i + 1; j < stud.length; j++) {
				if(stud[i][5] < stud[j][5]) {
					int tmp[] = new int[1];
					tmp = stud[i];
					stud[i] = stud[j];
					stud[j] = tmp;
					
					
					
				}
			
			}
			
		}
		
		for(int i = 0; i < stud.length; i++) {
			for(int j = 0; j < stud.length; j++)
			if(stud[i][5] < stud[j][5]) {
				score[i] += 1;
				
				
			}
				
		}
		
		
		
		
		
		
		
		for(int i = 0; i < stud.length; i++) {
			for(int j = 0; j < stud[i].length; j++) {
		
				System.out.print(stud[i][j] + " : ");
		
			}
			
			System.out.print(score[i]+1);
			System.out.println();
		}
		
		
	}

}
