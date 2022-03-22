package day17.self;
/*
	1. 폴더를 강제로 만들어보자.
	
	2. 계층화된 폴더를 강제로 만들어 보자.
	
	3. 만들어진 파일중 하나를 삭제한다.(폴더도 파일로 간주되므로 삭제가능하다.)
	
	4. 만들어진 파일중 하나를 변경시켜보자.
	
*/

import java.io.*;

public class FileTest01 {

	public FileTest01() {
		/*
		// 1. 폴더 만들기
		File fi = new File("src/day17/self/selfTest");
		fi.mkdir();
		*/
		/*
		// 2. 계층화 폴더 만들기
		File file = new File("src/day17/self/selfTest/1/2/3");
		file.mkdirs();
		*/
		/*
		// 3. 파일 지우기
		File file = new File("src/day17/self/selfTest/1/2/3");
		String msg = file.delete() ? "삭제 성공" : "삭제 실패";
		System.out.println("### 결과 : " + msg);
		*/
		File ofile = new File("src/day17/self/selfTest/1/2");
		File nfile = new File("src/day17/self/selfTest/ReTest");
		ofile.renameTo(nfile);
	}

	public static void main(String[] args) {
	new FileTest01();
	}

}
