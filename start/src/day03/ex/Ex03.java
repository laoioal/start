package day03.ex;

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

public class Ex03 {

	public static void main(String[] args) {
	
		/*
		int a = 84232;
		System.out.println("50000권 : " + (a/50000));
		System.out.println("10000권 : " + ((a%50000) / 10000));
		System.out.println("5000권 : " + ((a%10000) / 5000));
		System.out.println("1000권 : " + ((a%5000) / 1000));
		System.out.println("500권 : " + ((a%1000) / 500));
		System.out.println("100권 : " + ((a%500) / 100));
		System.out.println("50권 : " + ((a%100) / 50));
		System.out.println("10권 : " + ((a%50) / 10));
		System.out.println("1권 : " + ((a%10) / 1));
		*/
		
		int total = 84232;
		
		int tmp = total;
		
		// 5만원권
		int oman = tmp / 50000;
		
		// 5만원권 제외한 금액 기억
		//tmp = tmp % 50000;
		tmp %= 50000; // tmp를 50000으로 나눈 나머지를 tmp에 대입하세요
		// 1만원권
		int man = tmp / 10000;
		
		// 1만원권을 제외한 금액
		tmp = tmp % 10000;
		
		// 5천원권 
		int ochun = tmp / 5000;
		
		tmp = tmp % 5000;
		
		// 1천원권
		int chun = tmp / 1000;
		
		tmp = tmp % 1000;
		
		// 500원권
		int obeak = tmp / 500;
		
		tmp = tmp % 500;
		
		// 100원권
		int beak = tmp / 100;
		
		tmp = tmp % 100;
		
		// 50원권
		int oship = tmp / 50;
		tmp = tmp % 50;
		
		// 10원권
		int ship = tmp / 10;
		
		// 1원권
		int il = tmp % 10;
		
		// 결과출력
		System.out.printf("%7s%3d%-4s%n", "총 금액 ", total,  "원은");
		System.out.printf("%12s%3d%-4s%n", "50000원권 : ",  oman, " 장");
		System.out.printf("%12s%3d%-4s%n", "10000원권 : ", man, " 장");
		System.out.printf("%12s%3d%-4s%n", "5000원권 : ", ochun, " 장");
		System.out.printf("%12s%3d%-4s%n", "1000원권 : ", chun, " 장");
		System.out.printf("%12s%3d%-4s%n", "500원권 : ", obeak, " 장");
		System.out.printf("%12s%3d%-4s%n", "100원권 : ", beak, " 장");
		System.out.printf("%12s%3d%-4s%n", "50원권 : ", oship, " 장");
		System.out.printf("%12s%3d%-4s%n", "10원권 : ", ship, " 장");		
		System.out.printf("%12s%3d%-4s%n", "1원권 : ", il, " 장");	
		
		
		
		

	}

}
