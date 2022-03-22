package day17.self;

import java.io.*;

public class DataTest02 {

	public DataTest02() {
		FileInputStream fin = null;
		DataInputStream din = null;
		
		try {
			
			fin = new FileInputStream("src/day17/self/friendinfo.txt");
			din = new DataInputStream(fin);
			
			String name = din.readUTF();
			int age = din.readInt();
			float height = din.readFloat();
			char gen = din.readChar();
			String tel = din.readUTF();
			String mail = din.readUTF();
			char blood = din.readChar();
			boolean rh = din.readBoolean();
			
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("신장 : " + height);
			System.out.println("성별 : " + gen);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("혈액형 : " + blood);
			System.out.println("rh : " + (rh ? "+" : "-"));
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				din.close();
				fin.close();
			} catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
	new DataTest02();
	}

}
