package JDBCTest.Controller;


import java.util.*;

import JDBCTest.DB.MemberDao;

public class MemberInfo {
	MemberDao mDao;
	public MemberInfo() {
		mDao = new MemberDao();
		while(true) {
			System.out.print("회원번호를 입력해주세요.\n종료를 원하시면 -1을 입력해주세요.\n입력 : ");
			Scanner sc = new Scanner(System.in);
			int no = sc. nextInt();
			if(no == -1) {
				System.out.println("\n*** 프로그램 종료 ***");
				break;
			}
			mDao.toPring(no);
			
		}
	}

	public static void main(String[] args) {
		new MemberInfo();
	}

}

