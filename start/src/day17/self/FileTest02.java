package day17.self;

import java.io.*;

public class FileTest02 {

	public FileTest02() {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day17/self/selfTest/FileTest02.txt");
		//	fout.write('j');
			
			String dan = "가나다라마바사아자차카타파하abcdefghij";
			byte[] by = dan.getBytes();
//			fout.write(by);
			fout.write(by, 4, 15);
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch(Exception e) {}
		}
		
		
	}

	public static void main(String[] args) {
	new FileTest02();
	}

}
