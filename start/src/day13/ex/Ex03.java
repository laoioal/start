package day13.ex;

/*
 	나이를 입력하면 태어난 년도가 나타나게 만들고
 	 0살보다 적게 입력하거나 130살보다 높게 입력할 경우 다시 입력하도록 예외처리 입력하기
 */

import java.util.*;

public class Ex03 {

	public Ex03() {
		Scanner sc = new Scanner(System.in);
		
		try {
			getAge(sc);
		} catch (Exception e) {
			
			System.out.println("Error ] 나이가 0살 이하 또는 130살 초과로 입력하셨습니다.");
		}
	}
	
	
	public void getAge(Scanner sc) throws Exception {
		int age = 0;
		int year = 0;
		while(true) {
			System.out.print("* 나이입력 : ");
				try {
					age = sc.nextInt();
					year = 2022 - age + 1;
					break ;
				} catch(Exception e) {
					System.out.println("# 잘못된 입력입니다.");
					break;
				}
		
		}
		
		if(age <= 0 || age > 130) {
			
			throw new Exception();
			
		} else {
			System.out.println("태어난 년도는 :" + year + "입니다.");
		}
		
		
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
