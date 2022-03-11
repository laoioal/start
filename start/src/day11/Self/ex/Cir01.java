package day11.Self.ex;

public class Cir01 extends Doh {
	private int rad;
	private double area, arround;

	
	
	public int getRad() {
		return rad;
	}



	public void setRad(int rad) {
		this.rad = rad;
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



	public double getArround() {
		return arround;
	}



	public void setArround(double arround) {
		this.arround = arround;
	}
	
	public void setArround() {
		arround = 2 * rad * 3.14;
	}



	public Cir01(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	
	public void toPrint() {
		System.out.printf("반지름이 %3d 이고, 둘레가 %6.2f 이고, 넓이가 %6.2f 인 원입니다.", rad, arround, area);
		System.out.println();
	}
	
}
