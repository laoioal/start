package day11.Self;

public class tri extends Moyang {

	private int width, height;
	private double area;
	
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
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		area = width * height / 2.;
		
	}
	
	public tri() {
		
	}
	
	public tri(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		
	}
	
	@Override
	public void toPrint() {
		System.out.printf("밑변은 %3d 이고, 높이는 %3d 이고, 넓이는 %6.2f 인 삼각형이다.", width, height, area);
		System.out.println();
	}
	
}
