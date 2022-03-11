package day06.exself;

/*
	문제 2 ]
		두 사람이 등산을 한다.
		한사람은 산 입구에서 0.54m/sec 의 속도로 등산을 시작하고
		한사람은 정상에서 1.07m/sec 의 속도로 내려온다.
		산의 높이가 7564m 라고 가정하면
		두 사람이 만나는 시점은 몇분 몇초 후인지 출력하세요.
		 
*/

public class Ex03 {

	public static void main(String[] args) {
		double a = 0.54;
		double b = 1.07;
		int c = 7564;
		double d = 0;
		double e = 0;
		int z = 0;
		
		for(int i = 1; i < c/a +1; i++) {
			
				d = a * i;
				e = c - b * i;
			
				if(d > e) {
					z = i;
					break;
				}
				
		}
		System.out.println(z);
		int h = z / 60;
		int m = (z % 60);
		System.out.println(h + "시간" + m + "분");
	}

}
