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

public class Self04re {

	public static void main(String[] args) {
		int money = 84232;
		int temp = money;
		
		int a = 50000;
		int b = 10000;
		int c = 5000;
		int d = 1000;
		int e = 500;
		int f = 100;
		int g = 50;
		int h = 10;
		int i = 1;
		
		
		
		
		int oman = temp / a;
		temp = temp % a;
		
		int man = temp / b;
		temp = temp % b;
		
		int ochun = temp / c;
		temp = temp % c;
		
		int chun = temp / d;
		temp = temp % d;
		
		
		int obeak = temp / e;
		temp = temp % e;
		
		int beak = temp / f;
		temp = temp % f;
		
		int osip = temp / g;
		temp = temp % g;
		
		int sip = temp / h;
		
		
		int il = temp % h;
		
		System.out.println("84232는");
		System.out.println("50000원 권이 : " + oman + "개");
		System.out.println("10000원 권이 : " + man + "개");
		System.out.println("5000원 권이 : " + ochun + "개");
		System.out.println("1000원 권이 : " + chun + "개");
		System.out.println("500원 권이 : " + obeak + "개");
		System.out.println("100원 권이 : " + beak + "개");
		System.out.println("50원 권이 : " + osip + "개");
		System.out.println("10원 권이 : " + sip + "개");
		System.out.println("1원 권이 : " + il + "개");
		System.out.println("가 필요합니다.");
		
		
	}
	
}
