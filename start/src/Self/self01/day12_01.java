package Self.self01;

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

public class day12_01 {
	Figure[] fig = new Figure[10];
	public day12_01() {
		setData();
		for(Figure k : fig) {
			k.toPrint();
		}
	}
	
	public void setData() {
		
		for(int i = 0; i < fig.length; i++) {
			int num = (int) (Math.random() * 3 + 3);
			int no1 = (int) (Math.random() * 151 + 50);
			int no2 = (int) (Math.random() * 151 + 50);
			
			int height = no1;
			int width = no2;
			int rad = no1;
			
			
			switch (num) {
			case 3:
				
				fig[i] = new Figure() {
					double area;
					@Override
					public void setArea() {
						
						area = height * width * 0.5;
						
					}

					@Override
					public void toPrint() {
						setArea();
						System.out.printf("밑변이 %3d이고 높이가 %3d인 삼각형의 넓이는 %6.2f이다.\n", width, height, area);
						
					}
					
				};
				break;
			}
			switch (num) {
			case 4:
				
				fig[i] = new Figure() {
					double area;
					@Override
					public void setArea() {
						
						area = height * width;
						
					}
					
					@Override
					public void toPrint() {
						setArea();
						System.out.printf("가로가 %3d이고 세로가 %3d인 사각형의 넓이는 %6.2f이다.\n", width, height, area);
						
					}
					
				};
				break;
			}
			switch (num) {
			case 5:
				
				fig[i] = new Figure() {
					double area;
					double arround;
					@Override
					public void setArea() {
						
						area = rad * rad * Math.PI;
						arround = rad * 2 * Math.PI;
						
					}
					
					@Override
					public void toPrint() {
						setArea();
						System.out.printf("반지름이 %3d인 원의 넓이는 %6.2f이고 둘레는 %6.2f이다.\n", rad, area, arround);
						
					}
					
				};
				break;
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new day12_01();
	}

}
