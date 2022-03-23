package day18.self;
/*
char 단위로 파일에 데이터를 저장하는 프로그램을 작성하세요
*/
import java.io.*;

public class Test01 {

	public Test01() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("src/day18/result/tra.txt");
			
			/*
			// 한글자만 저장
			char ch = '아';
			fw.write(ch);
			System.out.println("완료");
			*/
			
			/*
			// 여러글자 저장
			String str = "가나다라마바사아자차카타파하\n\tabcdefg";
			char[] buff = str.toCharArray();
			fw.write(buff);
			System.out.println("완료");
			*/
			
			String str = "가나다라마바사아자차카타파하\n\tabcdefghij";
			fw.write(str);
			System.out.println("완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch(Exception e) {
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
