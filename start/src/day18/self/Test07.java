package day18.self;

/*
	Test06 에서 저장한 jennie.txt 파일을 읽어보자
	
	ObjectOutputStream으로 저장한(내보낸) 파일은
	반드시 ObjectInputStream으로 읽어야한다.
	그리고 보내는 쪽과 받는 쪽에 모두 동일한 클래스가 있어야 한다.
	
*/

import java.io.*;

public class Test07 {

	public Test07() {
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		
		try {
			fi = new FileInputStream("src/day18/self/je_info.txt");
			oi = new ObjectInputStream(fi);
			
			Friend jn = (Friend) oi.readObject();
			
			
			String name = jn.getName();
			String mail = jn.getMail();
			int age = jn.getAge();
			double height = jn.getHeight();
			boolean rh = jn.isRh();
			
			System.out.println("이름 : " + name);
			
			System.out.println("메일 : " + mail);
			System.out.println("나이 : " + age);
			System.out.println("키 : " + height);
			System.out.println("rh : " + rh);
			
			
		}  catch(Exception e) {
			e.printStackTrace();;
		} finally {
			try {
				oi.close();
				fi.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
