package day11.Self.ex;

public class Test01 {
	
	public Test01() {
		
		Doh[] d = new Doh[10];
		
		for(int i = 0; i < d.length; i++) {
			int soo = (int)(Math.random() * 3);
			
			int no1 = (int)(Math.random() * 91 + 10);
			int no2 = (int)(Math.random() * 91 + 10);
			
			if(soo == 0) {
				d[i] = new Cir01(no1);
			} else if(soo == 1) {
				d[i] = new Tri(no1, no2);
			} else if(soo == 2) {
				d[i] = new Squ01(no1, no2);
			}
			
		}
			
		// 출력
		for(int i = 0; i < d.length; i++) {
			d[i].toPrint();
		}
		
		
	}
	

	public static void main(String[] args) {
		new Test01() ;
	}

}
