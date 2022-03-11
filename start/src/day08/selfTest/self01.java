package day08.selfTest;

/*
	0 ~ 9사이의 숫자를 100개 발생시켜서
	각각의 숫자가 몇번씩 발생했는지를 알아보자.
	
	방법 ]
		각 숫자의 횟수를 기억할 배열을 만들고
		각 숫자가 발생할때마다 1씩 누적시켜준다.
		
*/

public class self01 {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i = 0 ; i < 100; i++) {
			int a = (int) (Math.random() * 10);
			num[a] += 1;
			
		}
		
		for(int i = 0; i < 9; i++) {
			System.out.println(num[i]);
		}
		
	}

}
