package githrd.controller;

import java.util.ArrayList;
import java.util.*;

import githrd.dao.*;
import githrd.vo.MemberVO;


public class MemberController {
	private MemberDao mDao;
	
	
	public MemberController() {
		mDao = new MemberDao();
		

		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		while(bool) {
		System.out.println();
		System.out.println("****************조 회 ****************");
		System.out.print("모든 회원의 회원번호 & 아이디 출력 : 1\n회원번호 입력하여 조회 : 2\n아이디 입력하여 회원 연락처 수정 : 3\n신규 회원가입 : 4\n종료 : 5\n요청번호를 입력해주세요 : ");

		int no = sc.nextInt();
		
		switch(no) {
		case 1 :
			System.out.println();
			mDao.AllToprint();
			break;
		case 2 :
			System.out.println();
			mDao.MnoToPrint(sc);
			break;
		case 3 :
			System.out.println();
			mDao.upDateTelToPrint(sc);
			break;
		case 4 :
			System.out.println();
			mDao.insertMemToPrint(sc);
			break;
		case 5 :
			System.out.println("프로그램 종료");
			bool = false;
			break;
			}
		}
		
	}
		
		
		
	/*
		mDao.AllToprint();
		System.out.println("----------------");
		mDao.MnoToPrint();
		mDao.upDateTelToPrint();
		mDao.insertMemToPrint();
	 */
		
	

	// 회원번호와 아이디를 조회해서 출력해주는 함수

	
	// 회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	
	// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수
	
	// Scanner로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	
	
	
	public static void main(String[] args) {
		new MemberController();
	}
	

}
