package day03.selfTest;

/*
	84232원을 지불하려고 한다.
	우리나라 화폐단위별로 이 금액을 지불하려면
	각 단위가 몇개 필요한지 계산해서 출력하세요.
	
	화폐단위
		50000권
		10000권
		5000권
		1000권
		500
		100
		50
		10
		1
*/

public class Self04 {
	
	public static void main(String[] args) {
		int a = 84232;
		int tmp = a;
		
		int A = 50000;
		int B = 10000;
		int C = 5000;
		int D = 1000;
		int E = 500;
		int F = 100;
		int G = 50;
		int H = 10;
		int I = 1;
		
		int b = tmp / A;
		tmp %= A;
		
		int c = tmp / B;
		tmp %= B;
		
		int d = tmp / C;
		tmp %= C;
		
		int e = tmp / D;
		tmp %= D;
		
		int f = tmp / E;
		tmp %= E;
		
		int g = tmp / F;
		tmp %= F;
		
		int h = tmp / G;
		tmp %= G;
		
		int i = tmp / H;
		
		int j = tmp % H;
		
	
		System.out.println(A + "원권 : " + b);
		System.out.println(B + "원권 : " + c);
		System.out.println(C + "원권 : " + d);
		System.out.println(D + "원권 : " + e);
		System.out.println(E + "원권 : " + f);
		System.out.println(F + "원권 : " + g);
		System.out.println(G + "원권 : " + h);
		System.out.println(H + "원권 : " + i);
		System.out.println(I + "원권 : " + j);
		
		
				
	}

}
