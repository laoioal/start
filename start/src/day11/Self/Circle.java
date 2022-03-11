package day11.Self;

public class Circle extends Moyang {
	private int rad;
	private double arround, area;
	
	

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArround() {
		return arround;
	}

	public void setArround(double arround) {
		this.arround = arround;
	}
	
	public void setArround() {
		arround = 2 * rad * 3.14;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		area = rad * rad * 3.14;
	}

	
	public Circle() {
		
	}
	
	public Circle(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	
	@Override
	public void toPrint() {
		System.out.printf("원의 반지름은 %3d 이고, 넓이는 %6.2f 이고, 둘레는 %6.2f 인 원이다.", rad, area, arround);
		System.out.println();
	}

}
