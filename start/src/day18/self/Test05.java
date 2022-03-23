package day18.self;
/*	
 	1. 버퍼리더라이터를 사용해서 파일을 복사해보자.
	2. PrintWriter 를 이용해서 blackpink.txt 파일을 복사해보자.
*/

import java.io.*;

public class Test05 {

	public Test05() {
		
		FileReader fr = null;
		BufferedReader br = null;
		/*
		FileWriter fw = null;
		BufferedWriter bw = null;
		*/
		PrintWriter pw = null;
		
		try {
			
			fr = new FileReader("src/day18/result/blackpink.txt");
			br = new BufferedReader(fr);
			/*
			fw = new FileWriter("src/day18/self/blackpink_01.txt");
			bw = new BufferedWriter(fw);
			
			while(true) {
				String str = br.readLine();
				
				if(str == null) {
					break;
				}
				bw.write(str + "\r\n");
				
				
				
				
			}
			System.out.println("작업완료");
			*/
			pw = new PrintWriter("src/day18/self/blackpink_02.txt");
			while(true) {
				String str = br.readLine();
				
				if(str == null) {
					break;
				}
				pw.println(str);
				pw.flush();
			}
			System.out.println("작업완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
			br.close();
			fr.close();
			/*
			bw.close();
			fw.close();
				*/
			} catch(Exception e) {}
		}
	}
	

	public static void main(String[] args) {
		new Test05();
	}

}
