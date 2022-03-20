package day15.ex.self;

import java.util.Comparator;

public class Semo implements Comparable{
	private int width, height;
	private double area;

	public Semo() {
	}
	
	public Semo(int width, int height) {
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

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		area = width * height * 0.5;
	}

	
	@Override
	public String toString() {
		
		return "밑변이 " + width + ", 높이가 " + height + ", 넓이가 " + area + "인 삼각형";
	}

	@Override
	public int compareTo(Object o) {
		Semo s = (Semo) o;
		
		int result = height - s.getHeight(); 
		
		return -result;
		
	}
	
}
