package day14.ex;

public class Ex02Squ {
	
	int width, height, area;

	public Ex02Squ() {
	}
	
	public Ex02Squ(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
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
	
	public void setArea() {
		area = width * height;
	}
	
	public String toString() {
		return "가로가 : " + width + "이고 세로가 : " + height + ", 면적이 : " + area + "인 사각형";
	}

	public boolean equals(Object o) {
		boolean bool = false;
		Ex02Squ nam = null;
		
		try {
			
			nam = (Ex02Squ) o;
			
		} catch(Exception e) {
			return false;
		}
		
		bool = (width == nam.getWidth()) && (height == nam.getHeight());
		
		
		return bool;
	}


}
