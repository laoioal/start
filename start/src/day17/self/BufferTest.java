package day17.self;

/*
	파일에 내용을 저장하는 프로그램을 작성하세요.
	단, BufferedStream을 사용하세요
*/

import java.io.*;

public class BufferTest {

	public BufferTest() {
		FileOutputStream fout = null;
		
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("src/day17/self/BufferTest.txt");
			
			bout = new BufferedOutputStream(fout);
			
			String str = "Uh, 휘 파람, 파람, 파람 (can you hear that?)";
			byte[] buff = str.getBytes();
			bout.write(buff);
			
			bout.flush();
			System.out.println("***** 작업 완료 *****");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();
				fout.close();
			} catch(Exception e) {}
		}
		
		
	}

	public static void main(String[] args) {
	new BufferTest();
	}

}
