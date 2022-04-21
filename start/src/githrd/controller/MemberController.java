package githrd.controller;

import java.util.ArrayList;
import java.util.*;

import githrd.dao.*;
import githrd.vo.MemberVO;


public class MemberController {
	private MemberDao mDao;
	
	
	public MemberController() {
		mDao = new MemberDao();
		
/*
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
		*/
		mDao.threeToPrint();
		
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
	
	/*
	 	문제 ]
	 		회원리스트를 꺼내오는데
	 		한페이지당 3명의 아이디, 메일, 가입일을 리스트형식으로 보여주고
	 		그중에 한명의 아이디를 입력하면
	 		그 회원의 상세데이터를 보여주는 기능을 구현하세요
	 		
	 		한페이지당 보여주는 리스트의 개수는 3개로 하고
	 		한페이지당 보여지는 페이지 수는 3개로 한다.
	 		이전, 다음페이지를 같이 표현해서
	 		이동 가능한 페이지 메뉴는 총 5개로 하세요
	 		이전 페이지를 누르면 현재보는 페이지가 5페이지라고 한다면
	 		3페이지로 이동을 하고
	 		이동가능한 페이지는 1 ~ 3으로 변경되어야 한다.
	 		현재 보고는 페이지가 1페이지인데 다음을 선택하면
	 		보여지는 페이지는 4페이가 되고
	 		종료페이지는 6페이지가 되어야 한다.
	 		
	 */
	
	
	public static void main(String[] args) {
		new MemberController();
	}
	

}
