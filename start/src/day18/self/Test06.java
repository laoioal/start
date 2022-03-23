package day18.self;

/*
	제니의 정보를 Friend를 이용해서 저장해보자.
	
	ObjectOutputStream을 이용해서 저장
*/

import java.io.*;

public class Test06 {

	public Test06() {
		
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		// 데이터 만들고
		Friend je = new Friend();
		je.setAge(27);
		je.setName("제니");
		je.setMail("aa@aaa.com");
		je.setHeight(165.1);
		je.setRh(true);
		
		try {
			fout = new FileOutputStream("src/day18/self/je_info.txt");
			oout = new ObjectOutputStream(fout);
			
		oout.writeObject(je);
		System.out.println("*** 저장 성공 ***");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
		
		
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
