package day12.sub.ex;

/*
 	학생 10명의 국, 영, 수 점수를 넣고 석차를 구해서 배열에 넣기
 */

public class PlayInter {
	Inter [] in = new Inter[10];
	int [] ra = new int[10];
	int k = 0;
	public PlayInter() {
		setData();

		for(Inter k : in ) {
			k.toPrint();
		}
	}
	
	public void setData() {
		
		// 성적 생성
	

		for(int j = 0; j < in.length; j++) {
			
			int no1 = (int) (Math.random() * 41 + 60);
			int no2 = (int) (Math.random() * 41 + 60);
			int no3 = (int) (Math.random() * 41 + 60);
			
			
			
				in[j] = new Inter() {
					int score;
						@Override
					public void setTotal() {
						score = no1 + no2 + no3;
						
					}
						

					@Override
					public void toPrint() {
						setTotal();
						System.out.printf( (char) (k +'A') + "학생의 국어 점수는 %3d이고, 영어 점수는 %3d이고, 수학 점수는 %3d입니다. 총점은 %3d로 %2d 등입니다. \n", no1, no2, no3, score, 1 );
						k++;
					}


				
				};
				
		}
		

		}
		
	public void setRank() {
		setData();
		for(int i = 0; i < in.length; i++) {
		
			
		}
	}
		
	


	
	public static void main(String[] args) {
		new PlayInter();

	}

}
