package day17.self;

import java.io.*;
/*
	이미지 파일을 복사해보자.
	
			// 할일
		// 스트림은 단방향이다.
		// 복사라는 작업은 한곳에서 읽어서 다른곳에 그대로 읽은 내용을 쓰는 작업이다.
		// 따라서 스트림이 두개 준비되어야 한다.
*/

public class ImgTest {

	public ImgTest() {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			fin = new FileInputStream("src/day17/shaco.jpg");
			fout = new FileOutputStream("src/day17/self/selfTest/shaco_copy.jpg");
			
			while(true) {
				byte[] by = new byte[1024];
				int len = fin.read(by);
				if(len == -1) {
					break;
				}
				fout.write(by, 0, len);
			}
			System.out.println("*** 파일 복사 성공 ***");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				fout.close();
			} catch(Exception e) {
				
			}
		}
		
	}

	public static void main(String[] args) {
	new ImgTest();
	}

}
