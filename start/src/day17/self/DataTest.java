package day17.self;

/*
	파일에 친구의 정보를 저장해보자.
	정보
		이름		String
		나이		int
		신장		float
		성별		char
		전화		String
		메일		String
		혈액형		char
		RH			boolean
*/
import java.io.*;

public class DataTest {

	public DataTest() {
		
		FileOutputStream fout = null;
		
		DataOutputStream dout = null;
		
		try {
			fout = new FileOutputStream("src/day17/self/friendinfo.txt");
			dout = new DataOutputStream(fout);
			
			String name = "제니";
			int age = 27;
			float height = 165.5f;
			char gen = 'F';
			String tel = "010-1111-1111";
			String mail = "Jennie@githrd.com";
			char blood = 'O';
			boolean rh = true; // + : true, - : false
			
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeFloat(height);
			dout.writeChar(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			dout.writeChar(gen);
			dout.writeBoolean(rh);
			
			System.out.println("**** 제니 저장 성공 ****");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
				fout.close();
			} catch(Exception e) {}
		}
		
		
	}
	
	

	public static void main(String[] args) {
	new DataTest();
	}

}
