package day12.sub;

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

public class Ex04 {

	Figure[] fi = new Figure[10];

	
	public Ex04() {
		setFigure();
		for(Figure ff : fi) {
			ff.toPrint();
		}
		
	}
	
	
	public void setFigure() {
		
		for(int i = 0; i < fi.length; i++) {
			int soo = (int) (Math.random() * 3 + 3);
			
			int no1 = (int) (Math.random() * 91 + 10);
			int no2 = (int) (Math.random() * 91 + 10);
			int width = no1;
			int height = no2;
			int rad = no1;
			
			switch(soo) {
			case 3:
				
				fi[i] = new Figure() {
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
				
				fi[i] = new Figure() {
					int area;
					@Override
					public void setArea() {
						area = width * height ;	
					}
					@Override
					public void toPrint() {
						setArea();
						System.out.printf("이 사각형은 가로가 %3d이고, 세로가 %3d이고, 면적이 %6d 입니다.\n", width, height, area);
					}
				};
				break;
			case 5:

				fi[i] = new Figure() {
					double area;
					double arround = 2 * rad * Math.PI;	
					@Override
					public void setArea() {
						area = rad * rad * Math.PI;	
					}
					public void setArround() {
						
					}
					@Override
					public void toPrint() {
						setArea();
						setArround();
						System.out.printf("이 원은 반지름이 %3d이고, 둘레가 %6.2f 이고, 면적이 %6.2f 입니다.\n", rad, arround, area);	
					}
				};
				
				break;
			}
		}
	}

	
	public static void main(String[] args) {
		new Ex04();

	}

}
