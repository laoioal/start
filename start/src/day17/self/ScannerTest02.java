package day17.self;

/*
	우리가 이제까지 키보드로 입력을 받을 때 사용했던 클래스는
	Scanner 클래스 였는데
	이 클래스의 생성방법은 
		
		Scanner(InputStream in)
		==> Scanner(System in)

	Scanner를 이용해서 day17/result/FileTest01.txt 파일을 읽어보자.
		
*/

import java.util.*;
import java.io.*;


public class ScannerTest02 {

	public ScannerTest02() {
		File file = new File("src/day17/result/FileTest01.txt");
		Scanner sc = null;
		
		try {
		sc = new Scanner(file);
		String str = sc.next();
		System.out.println(str);
		
		} catch (Exception e) {
			e.printStackTrace();
			
		}	finally {
			try {
				
			} catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
	new ScannerTest02();
	}

}