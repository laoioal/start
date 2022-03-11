package day11.Self;

public class Squ extends Moyang {
	private int width, height;
	private int area;
	
	
	
	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getArea() {
		return area;
	}



	public void setArea(int area) {
		this.area = area;
	}
	
	public void setArea() {
		area = width * height;
	}



	public Squ() {
		
	}
	public Squ(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	@Override
	public void toPrint() {
		System.out.printf("가로는 %3d 이고, 세로는 %3d 이고, 넓이는 %3d 인 사각형이다.", width, height, area);
		System.out.println();
	}
	
}
