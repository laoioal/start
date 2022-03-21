package day16.ex.self;

public class Nemo {
	private int width, height, area;

	public Nemo() {
	}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea(width * height);
	}
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
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Nemo nemo = (Nemo) o;
		bool = width == nemo.getWidth();
		
		return bool;
		
	}
	
	@Override
	public String toString() {
		return String.format("이 사각형은 가로가 %3d, 세로가 %3d, 면적이 %6d 입니다.", width, height, area);
	}
	
	@Override
	public int hashCode() {
		return 1;	// 이 클래스의 객체는 이제부터 모두 해쉬코드값을 1을 갖는다.
	}	

}
