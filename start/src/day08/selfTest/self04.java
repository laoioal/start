package day08.selfTest;

/*
	문자열 다섯개를 기억할 배열을 만들고
	보기를 입력해 놓고
	문제와 같이 화면에 출력하고
	
	사용자가 정답을 입력하도록 해서
	답안이 맞았는지 확인하는 프로그램을 작성하세요
	
*/

import java.util.* ;

public class self04 {

	public static void main(String[] args) {
		String[] str = new String[5];
		
		str[0] = "제니";
		str[1] = "둘리";
		str[2] = "제니";
		str[3] = "제니";
		str[4] = "제니";
		
		System.out.print("다음중 블랙핑크가 아닌것은?");
		
		for(int i = 0 ; i < str.length; i++) {
			System.out.println((i +1) + " )" + str[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정답을 입력하세요 : ");
		int a = sc.nextInt();
	
	
	if(a == 1) {
		System.out.println("입력하신 답" + a + "는" + "정답입니다.");
	} else {System.out.println("입력하신 답" + a + "는" + "정답이 아닙니다.");}

}
}
