package day18;

import java.io.*;

public class Test01 {

	/*
	  char 단위로 파일에 데이터를 저장하는 프로그램을 작성하세요
	 */
	public Test01() {
		// 타겟스트림(기본스트림)을 준비
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("src/day18/result/휘파람.txt");
			/*
			// 1. 한글자(2byte)만 저장해보자.
			char ch = '휘';
			fw.write(ch);
			*/
			
			/*
			// 2. 여러글자를 저장해보자.
			// 문자열을 준비하고
			String str = "\t\t\t휘파람\r\n\t\t\t\t\t블랙핑크";
			
			// 여기서는 문자 단위로 처리를 해야하므로
			// 문자배열을 준비한다.
			// 문자열을 문자배열로 변환시켜주는 함수 : toCharArray()
			char[] buff = str.toCharArray();
			fw.write(buff);
			
			String tmp = 'A' + "";
			*/
			
			/*
			  	참고 ]
			  		char 단위는 텍스트 데이터만 처리하도록 되어있기 때문에
			  		기본함수에 문자처리기능이 추가되었다.
			 
			 */
			String str = "\t\t\t휘파람\r\n\t\t\t\t\t블랙핑크";
			
			fw.write(str);
			
			
			
			// ArrayList<int> list = new Arraylist<int>(); // int 가 객체가 아니기 때문에 아래처럼 사용해야함
			// ArrayList<Integer> list = new Arraylist<Integer>();
			
			
			System.out.println("***** 저장 성공 *****");
			
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
