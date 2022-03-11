package day06.ex;

/*
  문제 4 ]
  	
  	다음 형태로 출력하세요

  	
***** 	
***** 	
***** 	
***** 	
***** 	  	
 
  	
*****
****
***
**
*


     *
    **
   ***
  ****
 *****
 

   *
  ***
 *****
 
 
 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < 5; j ++) {
				int c = i + j;
				String a = c + "";
				if( a != "") {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		

	}

}
