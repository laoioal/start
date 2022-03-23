package day18.self;


import java.io.*;

/*
 	result 폴더의 blackpink.txt 파일을 읽어보자.
 	
 	기본 스트림은 바이트 기반으로
 	보조 스트림은 문자기반 스트림으로 연결해서 처리해보자
 	
 	 참고 ]
 	 	 스트림을 사용할 때 주의사항
 	 	 	1. 반드시 방향이 같아야 한다.
 	 	 	2. 크기가 같아야 한다.
 	 	 를 지켜줘야 하는데
 	 	 위의 조건처럼 다른 계열의 스트림을 연결해서 사용해야 하는 경우는
 	 	 
 	 	 InputStreamReader / OutputStreamWrite 를 이용해서 서로를 연결해서 사용해야 한다.
 	 	 
 	 	 이때 주의 사항으로는
 	 	 	반드시 기본 스트림은 바이트 기반이어야 하고
 	 	 	보조 스트림이 문자 기반 스트림이어야 한다.
 	 	 	
 	 	 
 */


public class Test08 {

	public Test08() {
		FileInputStream fi = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		

		try {
			fi = new FileInputStream("src/day18/result/blackpink.txt");
			isr = new InputStreamReader(fi);
			br = new BufferedReader(isr);
		
			
			
			while(true) {
				
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				fi.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
