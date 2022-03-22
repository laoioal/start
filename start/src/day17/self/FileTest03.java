package day17.self;
/*
	doc 폴더 안의 파일의 목록을 알아내보자
*/

import java.io.*;

public class FileTest03 {

	public FileTest03() {
		File dir = new File("src/day17");
		
		// 파일 목록
		String[] str = dir.list();
		
		for(String s : str) {
			System.out.println(s);
		}
		System.out.println();
		
		// 파일 정보
		File[] info = dir.listFiles();
		for(File f : info) {
			String name = f.getName();
			long len = f.length();
			String fold = f.getParent();
			
			
			System.out.println("상위폴더 : " + fold + ", 파일이름 : " + f+ ", 사이즈 : " + len + "byte");
		}
		
		// 확장자가 jpg인 파일만 골라서 출력
		
		String[] flist = dir.list(new FilenameFilter(){
		
			@Override
			public boolean accept(File dir, String name) {
				boolean bool = false;
				if(name.endsWith("jpg")) {
					bool = true;
				}
						
						
				return bool;
			
			}
		});
		
		for(String fl : flist) {
			System.out.println(fl);
		}
		
	}

	public static void main(String[] args) {
	new FileTest03();
	}

}
