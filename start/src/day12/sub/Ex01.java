package day12.sub;

/*
	랜덤하게 3 ~ 5까지 정수를 발생시켜서
	 	3이 나오면 삼각형
	 	4가 나오면 사각형
	 	5가 나오면 원
	의 형태로 10개의 도형을 만들어서
	하나의 변수로 관리하고
	각 도형의 내용을 출력하세요
*/

public class Ex01 {
	
	Figure[] fi = new Figure[10];

	
	public Ex01() {
		// 숫자 생성 및 배열에 넣기
		for(int i = 0; i < fi.length; i++) {
			int soo = (int) (Math.random() * 3 + 3);
			
			int no1 = (int) (Math.random() * 91 + 10);
			int no2 = (int) (Math.random() * 91 + 10);
			
			switch(soo) {
			case 3:
				fi[i] = new Semo(no1, no2);
				break;
			case 4:
				fi[i] = new Nemo(no1, no2);
				break;
			case 5:
				fi[i] = new Won(no1);
				break;
			}
			
		}
		
		for(int i = 0; i < fi.length; i++) {
			fi[i].toPrint();
		}
		
	}

	
	
	
	// 출력
	

	
	public static void main(String[] args) {
		new Ex01();

	}

}
