package day18.self;


/*
 	result 폴더에 있는 blackpink.txt 파일을 읽어보자
 */

import java.io.*;

public class Test02 {

	public Test02() {
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("src/day18/result/blackpink.txt");
			
			/*
			// 한글자만 읽어보자.
			int i = fr.read();
			System.out.println((char) i);
			*/
			
			/*
			// 여러글자 읽어보자
			char[] buff = new char[100];
			int len = fr.read(buff);
			
			String str = new String(buff, 0, len);
			System.out.println(str);
			*/
			
			// 문서 전체를 읽어보자
			char[] buff = new char[1024];
			
			while(true) {
				int len = fr.read(buff);
				
				
				if(len == -1) {
					break;
				}
				String str = new String(buff, 0, len);
				System.out.println(str);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
