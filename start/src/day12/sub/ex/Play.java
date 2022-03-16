package day12.sub.ex;


/*
	랜덤하게 3 ~ 5 정수를 발생시켜서
		3 이 나오면 삼각형
		4 가 나오면 사각형
		5 가 나오면 원
	의 형태로 10의 도형을 만들어서 
	하나의 변수로 관리하고
	각 도형의 내용을 출력하세요.
	
	단, 인터페이스의 구현은 무명 내부 클래스로 한다.
*/

public class Play {
	Fig[] arr = new Fig[10];
	
	public Play() {
		setData();
		
		for(Fig k : arr) {
			k.toPrint();
		}

		
	}
		
		public void setData() {
			
		for( int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 3 + 3);
			
			int no1 = (int) (Math.random() * 71 + 30);
			int no2 = (int) (Math.random() * 71 + 30);
			int width = no1;
			int height = no2;
			int rad = no1;
		
			switch(num) {
			case 3:
				
				arr[i] = new Fig() {
					double area;
					@Override
					public void setArea() {
						area = width * height * 0.5;
						
					}

					@Override
					public void toPrint() {
						setArea();
						System.out.printf("이 삼각형은 밑변이 %3d 이고, 높이가 %3d이고, 면적이 %6.2f 입니다.\n", width, height, area);
						
					}
					
				};
				
				break;
			case 4:
				arr[i] = new Fig() {
					int area;

					@Override
					public void setArea() {
						area = width * height;
						
					}

					@Override
					public void toPrint() {
						setArea();
						System.out.printf("이 사각형은 가로가 %3d이고, 세로가 %3d이고, 면적이 %6d 입니다.\n", width, height, area);
					}
					
				};
				
				break;
			case 5:
				arr[i] = new Fig() {
					double arround;
					double area;
					
					@Override
					public void setArea() {
						area = rad * rad * Math.PI;
						arround = rad * 2 * Math.PI;
						
					}

					@Override
					public void toPrint() {
						setArea();
						
						System.out.printf("이 원은 반지름이 %3d이고, 둘레가 %6.2f 이고, 면적이 %6.2f 입니다.\n", rad, arround, area);
						
					}
					
				};
				
				break;
			}
			
			
			
			
		}
	}
	
	
	

	public static void main(String[] args) {
	
		new Play();
		
		
	}


		
	

}
