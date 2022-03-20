package day12.sub.ex.self;

public class Student implements InterFace {
	
	private int no1, no2, no3, rank;
	private int total;
	int k = 0;
	
	public Student() {
		
	}

	public Student(int no1, int no2, int no3) {
		this.no1 = no1;
		this.no2 = no2;
		this.no3 = no3;
		rank = 1;
		setTotal();
	}
	
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getRank() {
		return rank;
	}

	@Override
	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public void toPrint() {
	//	System.out.printf( (char) (k +'A') + "학생의 국어 점수는 %3d이고, 영어 점수는 %3d이고, 수학 점수는 %3d입니다. 총점은 %3d로 %2d 등입니다. ", no1, no2, no3, total, rank);
	}

	@Override
	public int setTotal() {
		total = no1 + no2 + no3;
		return total;
	}

}
