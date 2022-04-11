package Self.pra;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import Self.EmpVO;
import Self.dao.Empdao;

public class Controller {
	private Empdao eDao;

	public Controller() {
		boolean bool = true;
		while(bool) {
		Scanner sc0 = new Scanner(System.in);
		System.out.print("전체조회 : 1\n부서별 조회 : 2\n직급별 조회 : 3\n종료 : 4\n\t 명령어를 입력해주세요 : ");
		int start = sc0.nextInt();

		
		switch(start) {
		case 1 :
		eDao = new Empdao();
		ArrayList<EmpVO> list = eDao.getALL();
		for(EmpVO i : list) {
			System.out.println(i);
		}
		break;
		
		
		case 2 :
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호\n10\n20\n30\n\t부서번호 입력 : ");
		int dno = sc.nextInt();
		eDao.getDNO(dno);
		ArrayList<EmpVO> list1 = eDao.getDNO(dno);
		for(EmpVO d : list1) {
			System.out.println(d);
		}
		break;
		
		case 3 :
		Scanner sc1 = new Scanner(System.in);
		System.out.print("직급\nANALYST\nCLERK\nMANAGER\nPRESIDENT\nSALESMAN\n\t직급 입력 : ");
		String str = sc1.nextLine();
		eDao = new Empdao();
		
		ArrayList<EmpVO> list2 = eDao.getJOB(str);
		for(EmpVO j : list2 ) {
			System.out.println(j);
		}
		break;
		
		case 4 :
			bool = false;
			System.out.println("프로그램 종료");
			return;
		}
		}
	}

	public static void main(String[] args) {
		new Controller();
	}

}
