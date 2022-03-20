package day15.ex.self;

public class Won {
	int rad;
	double arround, area;

	public Won() {
	}
	public Won(int rad) {
	this.rad = rad;
	setArea();
	setArround();
	
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround() {
	arround = 2 * rad * Math.PI;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = rad * rad * Math.PI;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setArround(double arround) {
		this.arround = arround;
	}
	
	public String toString() {
		
		return "반지름이 " + rad + " 이고, 둘레가 " + arround + " 이고, 면적이 " + area;
				
	}

}
