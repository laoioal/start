package day06.ex;

/*
 	문제 2 ]
 		두 사람이 등산을 한다.
 		한사람은 산 입구에서 0.54m/sec 의 속도로 등산을 시작하고
 		한사람은 정상에서 1.07m/sec 의 속도로 내려온다.
 		산의 높이가 7564m 라고 가정하면
 		두 사람이 만나는 시점은 몇분 몇초 후인지 출력하세요.
 		 
 */

public class Ex02 {
	
	public static void main(String[] args) {
		double a = 0.54;
		double b = 1.07;
		double c = 7564;
		double d = 0;
		double e = 0;
		int i = 0;
		int time = 0;
		for(i = 0; i < c / a; i ++) {
			 d = (a * i);
			 e = c - (b * i);
			 if(d > e) {
					System.out.println(i);
					break;
			}
		
		}
		time = i / 60;
		System.out.println( time + "분 " + (i - (time * 60)) + "초" );
		
		
	}

}
