package day11.Self.ex;

public class Squ01 extends Doh {
	private int width, height, area;

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
	
	public Squ01(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void toPrint() {
		System.out.printf("가로가 %3d 이고, 세로가 %3d 이고, 넓이가 %3d 인 사각형입니다.", width, height, area);
		System.out.println();
	}

}
