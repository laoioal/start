package day18.self;

/*
	버퍼리더를 사용해서 휘파람.txt파일을 읽어보자.
*/

import java.io.*;

public class Test04 {

	public Test04() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("src/day18/result/blackpink.txt");
			br = new BufferedReader(fr);
			
			char[] buff = new char[1024];
			while(true) {
				int len = br.read(buff);
				
				if(len == -1) {
					break;
				}
				String str = new String(buff, 0 ,len);
				System.out.println(str);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
				
			}
		
		}
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
