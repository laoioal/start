package day07.selfTest;

/*
	10개의 문자를 기억할 배열을 만들고
	'A' - 'J'까지 차례로 입력하고 출력하세요
*/

public class Ex02 {

	public static void main(String[] args) {
		char[] a = new char[10];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (char) ('A' + i);
			System.out.println(a[i]);
		}
			

	}

}
