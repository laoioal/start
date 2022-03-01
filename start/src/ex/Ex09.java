package ex;

/*
 	문제 9 ]
 		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
 		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
 */

public class Ex09 {

	public static void main(String[] args) {
		int result = 0;
		int i = 1;
		
		
		
		while (result <= 100) {
			
			if(i % 2 != 0) {
				System.out.println(i);
				result = result + (i);
				i += 1;			
				
				System.out.println("result1 : " + result);
				System.out.println("---------------");
				} else { result = result - (i);
				System.out.println(i);
				i += 1;
				
				System.out.println("result2 : " + result);
				System.out.println("---------------");
				} 
					
			
	}
		System.out.println("i : " + (i - 1));
}
}
