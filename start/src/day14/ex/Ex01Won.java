package day14.ex;

public class Ex01Won {
	
	int rad;
	double area, arround;
	

	public Ex01Won() {
	}
	
	public Ex01Won(int rad) {
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

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		area = rad * rad * Math.PI;
	}

	public double getArround() {
		return arround;
	}

	public void setArround(double arround) {
		this.arround = arround;
	}
	
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}
	
	
	public String toString() {
		return "반지름 : " + rad + ", 둘레 : " + arround + ". 넓이 : " + area + "인 원";
	}
	
	
	public boolean equals(Object o) {
		
		boolean bool = false;
		Ex01Won won = null;
		
		try {
			won = (Ex01Won) o;
			
		} catch(Exception e) {
			return false;
		}
		
		
		double myun = won.getArea();
		
		bool = area == myun;
		
		return bool;
		
	}
	

}
