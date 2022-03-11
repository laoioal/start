package day10.ex;

/*
 	문제 1	]
 		다음 변수를 가지는 Student 클래스를 제작하세요.
 		
 		String name;
 		int ban, no, kor, eng, math;
 		
 		클래스를 만들고
 		
 		Ex01 클래스에서 
 			한명의 데이터를 입력해서 출력하기
 			5명의 데이터를 배열로 만들어서 데이터 입력하고 출력
 			
 			1. 한개의 함수내에서 처리하기
 			2. 기능별로 분리해서 함수 만들어서 처리
 			
 			
 		
 		
 		보너스 ]
 			int rank, total;
 			double avg;
 		
 */

public class Ex01 {
	Student[] stu;
	String[] name;
	int[] ban;
	int[] no;
	int[] kor;
	int[] eng;
	int[] math;
	int[] rank;
	int[] total;
	double[] avg;
	
	
	
	public Ex01() {
		setData();
		stu();
		toPrint();
		
		
		
	}
	
	
	
	// 함수만들기
	
		// 1. 각 데이터 초기화
	public void setData() {
		name = new String[] {"제니", "리사", "로제", "지수", "둘리"};
		
		ban = new int[] {1, 2, 3, 4, 5 };
		no = new int [] {1, 2, 3, 4, 5 };
		kor = new int[5];
		for(int i = 0; i < kor.length; i++) {
			int score = (int) (Math.random() * 41 + 60);
			kor[i] = score;
		}
		eng = new int[5];
		for(int i = 0; i < eng.length; i++) {
			int score = (int) (Math.random() * 41 + 60);
			eng[i] = score;
		}
		math = new int[5];
		for(int i = 0; i < math.length; i++) {
			int score = (int) (Math.random() * 41 + 60);
			math[i] = score;
		}
	}
	
	
		// 2. 학생 배열 초기화 & 각 방에 데이터 넣기
	public void stu() {
		stu = new Student[5];
	for(int i = 0; i < stu.length; i++) {
		
		
			stu[i] = new Student();
		
	}
	for(int i = 0; i < stu.length; i++) {
		
		
			Student s = stu[i]; 
			
			s.setName(name[i]);
			s.setBan(ban[i]);
			s.setNo(no[i]);
			s.setKor(kor[i]);
			s.setEng(eng[i]);
			s.setMath(math[i]);
		
			

	
	
	}
}
	
	
		// 3. Student 배열 내용 출력해주는 함수
	public void toPrint() {
		
		for(int i = 0; i < stu.length; i++) {
			
				
				String names = stu[i].getName();
				int bans = stu[i].getBan();
				int kor = stu[i].getKor();
				int Eng = stu[i].getEng();
				int math = stu[i].getMath();
				//String name = stu[i].getName();
				
				System.out.println("이름 : " + names);
				System.out.println("반 : " + bans);
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + Eng);
				System.out.println("수학 : " + math);
				//System.out.println("이름 : " + names);
			
		}
		
		
		
	}
	
	// 실행함수
	public static void main(String[] args) {
		new Ex01();

	}

}
