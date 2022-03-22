package day17.self;



import java.util.*;
import java.io.*;


public class ScannerTest {

	public ScannerTest() {
	int ch = 0;
	System.out.print("입력해주세여! : ");
	try {
		/*
		ch = System.in.read();
		
		System.out.println((char) ch);
		*/
		/*
		byte[] buff = new byte[1024];
		
		int len = System.in.read(buff);
		
		String str = new String(buff, 0, len);
		System.out.println(str);
		*/
		
		byte[] buff = new byte[1024];
		Arrays.fill(buff, (byte) 'A');
		int len = System.in.read(buff, 10, 100);
		String str = new String(buff, 0, len + 10);
		System.out.println(str);
		
		
	} catch(Exception e) {}
		
	}

	public static void main(String[] args) {
	new ScannerTest();
	}

}
