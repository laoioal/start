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
			
			
			
			
			// 무명 클래스 활용 	
				in[i] = new Inter() {
					int ra;
					int score;
					
					
					
					// 총점 구하기
						@Override
					public void setTotal() {
						score = no1 + no2 + no3;
						for(int j = 0; j < 10; j++) {
							arr[j] = score;
						}
					}
					// 석차 구하기
						@Override
						public void setRank() {
							setTotal();
							
							for(int i = 0; i < 10; i++) {
								for(int j = 0; j < 10; j++) {
								
									if(arr[i] < arr[j]) {
										rank[i] += 1;
									}
									ra = rank[i];
		
								}
							}
							for(int k :rank) {
								System.out.println(k);
							}
						}

					@Override
					public void toPrint() {
						setTotal();
						setRank();

						System.out.printf( (char) (k +'A') + "학생의 국어 점수는 %3d이고, 영어 점수는 %3d이고, 수학 점수는 %3d입니다. 총점은 %3d로 %2d 등입니다. \n", no1, no2, no3, score, ra);
						
						k++;
					}

				};
			}

		}

	
	public static void main(String[] args) {
		new PlayInterRe();
	}

}
