package day11.Self;

/*
	랜덤하게 0 ~ 2 사이의 정수를 발생시켜서
		0 -- 원
		1 -- 삼각형
		2 -- 사각형
	을 만들어서 하나의 배열에 넣고 
	각 도형의 내용을 출력하세요
*/

public class play {
	public play() {
		Moyang[] mo = new Moyang[10];
		
		for(int i = 0; i < mo.length; i++) {
			int soo = (int)(Math.random() * 3);
			
			int no1 = (int)(Math.random() * 91 + 10);
			int no2 = (int)(Math.random() * 91 + 10);
			
			if(soo == 0) {
				mo[i] = new Circle(no1);
			} else if( soo == 1) {
				mo[i] = new tri(no1, no2);
			} else if(soo == 2) {
				mo[i] = new Squ(no1, no2);
			}
			
			
			
		}
		
		// 출력
		for(int i = 0; i < mo.length; i++) {
			mo[i].toPrint();
		}
					
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		new play();

	}

}
