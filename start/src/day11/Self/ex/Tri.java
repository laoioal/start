package day11.Self.ex;

public class Tri extends Doh {
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

	public Tri(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	
	public void toPrint() {
		System.out.printf("밑변이 %3d 이고, 높이가 %3d 이고, 넓이가 %6.2f 인 삼각형입니다.", width, height, area);
		System.out.println();
	}
	
}
