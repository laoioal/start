package day14.ex;

public class Ex03Student {
	
	int ban, kor, eng, math, total;
	String name;

	public Ex03Student() {
	}
	public Ex03Student(String name, int ban, int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.ban = ban;
		this.name = name;
		setTotal();
	}
	
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() {
		total = kor + eng + math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "\t이름 : " + name + "\n\t반 : " + ban + "\n\t국어 : " + kor + "\n\t영어 : " + eng + "\n\t수학 : " + math + "\n\t총점 : " + total;
	}
	
	public boolean equals(Object o) {
		boolean bool = false;
		Ex03Student stu = null;
		
		try {
			
			stu = (Ex03Student) o;
			
		} catch(Exception e) {
			return false;
		}
		
		bool = (name == stu.getName()) && (ban == stu.getBan());
		
		return bool;
	}
	
	
}
