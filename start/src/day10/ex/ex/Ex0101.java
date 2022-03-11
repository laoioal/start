package day10.ex.ex;

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

public class Ex0101 {
	// 변수
	Student01[] stud;
	String[] name;
	int[] ban;
	int[] kor;
	int[] eng;
	int[] math;
	int[] rank;
	int[] total;
	double[] avg;
	
	
	
	public Ex0101(){
		setData();
		student();
		toPrint();
		
	}
		
		// 배열 초기화
	public void student() {
		stud = new Student01[5];
		for(int i = 0; i < stud.length; i++) {
			stud[i] = new Student01();
			
		}
		for(int i = 0; i < stud.length; i++) {
			
			Student01 sd = stud[i];
			
			sd.setName(name[i]);
			sd.setBan(ban[i]);
			sd.setKor(kor[i]);
			sd.setEng(eng[i]);
			sd.setMath(math[i]);
			sd.setTotal(total[i]);
			sd.setRank(rank[i]);
			
		}
		
		
		
		
	}
		// 데이터 넣기
	public void setData() {
		name = new String[] {"제니", "둘리", "지수", "로제", "리사"};
		ban = new int[5];
		for(int i = 0; i < ban.length; i++) {
			ban[i] = (int) (Math.random() * 9 + 1);
			
		}
		kor = new int[5];
		for(int i = 0; i < kor.length; i++) {
			kor[i] = (int) (Math.random() * 41 + 60);
			
		}
		eng = new int[5];
		for(int i = 0; i < eng.length; i++) {
			eng[i] = (int) (Math.random() * 41 + 60);
			
		}
		math = new int[5];
		for(int i = 0; i < math.length; i++) {
			math[i] = (int) (Math.random() * 41 + 60);
			
		}
		total = new int[5];
		for(int i = 0; i < total.length; i++) {
			total[i] = kor[i] + eng[i] + math[i] ;
			
		}
		avg = new double[5];
		for(int i = 0; i < avg.length; i++) {
			avg[i] = (kor[i] + eng[i] + math[i]) / 3.0 ;
			
		}
		
		rank = new int[5];
		for(int i = 0; i < rank.length; i++) {
			rank[i] = 1;
			for(int j = 0; j < rank.length; j++) {
				if(total[i] < total[j]) {
					rank[i] += 1;
				}
			}
			
		}
		
		
		
	}
	
	// 출력
	public void toPrint() {
		
		for(int i = 0; i < 5; i++) {
		System.out.println("이름 : " + name[i]);
		System.out.println("반 : " + ban[i]);
		System.out.println("국어 : " + kor[i]);
		System.out.println("영어 : " + eng[i]);
		System.out.println("수학 : " + math[i]);
		System.out.println("총점 : " + total[i]);
		System.out.println("평균 : " + avg[i]);
		System.out.println("순위 : " + rank[i]);
		System.out.println();
	
		
		}
	}
		
		
		
	
	
	
	

	public static void main(String[] args) {
		new Ex0101();
	}
}
