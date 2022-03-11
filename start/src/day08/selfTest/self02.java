package day08.selfTest;

/*
	랜덤하게 다섯명의 학생의 점수를 만들고 배열에 기억시키고
	각 학생의 석차도 기억할 배열을 만들어서 결과를 출력하세요.
	
	
*/

public class self02 {

	public static void main(String[] args) {
		int[] stu = new int[5];
		int[] b = new int[5];
		
		for(int i = 0; i < stu.length; i++) {
			int a = (int) (Math.random() * 41 + 60);
			
			stu[i] = a;
		}
		
		for(int i = 0; i < stu.length; i++) {
			for(int j = 0; j < stu.length; j++) {
				if(stu[i] < stu[j]) {
					b[i] += 1;
				}
			}
		}
		for(int i = 0; i< stu.length; i++) {
			System.out.println("점수 : " + stu[i] + " 석차 : " + (b[i] + 1));
		}

	}

}
