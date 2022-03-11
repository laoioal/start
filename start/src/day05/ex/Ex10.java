package day05.ex;

/*
 	문제 10 ]
 		주사위 두개를 던질 경우 눈의 합이 6이 되는 경우를 모두 출력하세요.
 */

public class Ex10 {

	public static void main(String[] args) {
		
		/*int a = (int) (Math.random() * (6-1+1)+1); 
		int b = (int) (Math.random() * (6-1+1)+1); 
		int c = a + b; */
		
		
				
		for(int i = 1; i < 7; i++) {
			for(int j = 1; j < 7; j++) {
				if(i + j == 6) {
					System.out.println(i + "," + j);
				}
			}
		}
		
		
		

			
			
			
		}
		
	}


