package day12.sub.ex.self;

public class StudentPlay {
	InterFace[] stu = new InterFace[10];
	int[] rank = new int[10];

	public StudentPlay() {
		int k = 0;
		for(int i = 0; i < stu.length; i++) {
			int no1 = (int) (Math.random() * 41 + 60);
			int no2 = (int) (Math.random() * 41 + 60);
			int no3 = (int) (Math.random() * 41 + 60);
			
			
			stu[i] = new Student(no1, no2, no3);
			
		}
		
		for(int i = 0; i < stu.length; i++) {
			stu[i].toPrint();
			
		}
		
		setRank();
		
		for(int ra : rank) {
			System.out.print(" " + ra + " 등입니다. \n");
		}
		
		for(InterFace s : stu) {
			Student st = (Student) s;
			System.out.println("총점  : " + st.getTotal() + ", 등수 : " + st.getRank());
		}
		
	}	
		
	
	public void setRank() {
		int ra;
		int nk;
		
		// 석차배열 1로 초기화
		for(int i = 0; i < 10; i++) {
			rank[i] = 1;
			stu[i].setRank(1);
		}
		
		// 
		for(int i = 0; i < stu.length; i++) {
			for(int j = 0; j <stu.length; j++) {
				ra = stu[i].getTotal();
				nk = stu[j].getTotal();
				
				if(ra < nk) {
					rank[i] += 1;
					stu[i].setRank(rank[i]);
				}
				
			}
			
		}
		
	}
	
	
	

	public static void main(String[] args) {
		new StudentPlay();
	}

}
