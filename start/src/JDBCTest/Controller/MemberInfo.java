package JDBCTest.Controller;
/**
 * @author 이용현
 * @since 2022.05.03
 * @version v.1.0
 */

import java.util.*;

import JDBCTest.DB.MemberDao;
import githrd.vo.MemberVO;

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
			MemberVO mVO = mDao.setMno(no);
			System.out.print("\n아이디 : " + mVO.getId() + "\n회원이름 : " + mVO.getName() + "\n이메일 : " + mVO.getMail() + "\n\n");
			
		}
	}

	public static void main(String[] args) {
		new MemberInfo();
	}

}

