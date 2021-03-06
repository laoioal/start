package day12.sub.ex;

/*
 	학생 10명의 국, 영, 수 점수를 넣고 석차를 구해서 배열에 넣기
 */

public class PlayInterRe {
	Inter [] in = new Inter[10];
	int[] arr = new int[10];
	
	int k = 0;
	int[] rank = new int[10];
	
	
	
	public PlayInterRe() {
		
		for(int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		
		setData();

		for(Inter k : in ) {
			k.toPrint();
		}

	}
	
	public void setData() {
		
		// 랜덤하게 성적 생성
		for(int i = 0; i < in.length; i++) {
			
			int no1 = (int) (Math.random() * 41 + 60);
			int no2 = (int) (Math.random() * 41 + 60);
			int no3 = (int) (Math.random() * 41 + 60);
			
			/*
				10, 50, 20, 30
			 */
			
			
			// 무명 클래스 활용 	
			in[i] = new Inter() {
				int ra;
				int score;
				
				
				
				// 총점 구하기
					@Override
				public void setTotal() {
					score = no1 + no2 + no3;
				
				}
					
	
				@Override
				public void toPrint() {
					setTotal();
					
					System.out.printf( (char) (k +'A') + "학생의 국어 점수는 %3d이고, 영어 점수는 %3d이고, 수학 점수는 %3d입니다. 총점은 %3d로 %2d 등입니다. \n", no1, no2, no3, score, ra);
					
					k++;
				}

			};
			
		}
		
		

	}
	/*  day12.sub.ex.self - StudentPlay에 다시 작성
	public void setRank() {
		setData();
		for(int i = 0; i < in.length; i++) {
			
			for(int j = 0; j < in.length; j++) {
				
				if(in[i]) {
					
				}
			}
		}
	}
	*/

	
	public static void main(String[] args) {
		new PlayInterRe();
	}

}
