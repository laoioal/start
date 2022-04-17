package empProj.controller;

import empProj.db.*;
import empProj.dao.*;
import empProj.vo.*;
import oracle.jdbc.driver.DBConversion;

import java.util.*;

public class JEmpCont {
	private JEmpDao jDao;

	public JEmpCont() {
		
		jDao = new JEmpDao();
		// jemp 테이블이 없는 경우에는 만들고
		// 이미 있는 경우에는 건너뛰도록 하자.
		
		int cnt = jDao.tabCnt();
		if(cnt == 0) {
		addTable();
		} else if(cnt == 1) {
			System.out.println("*** 테이블이 잘 준비되어있습니다.");
		}
		delD30();
		
	
	}
	
	public void delD30() {
		// 먼저 백업하고
		int cnt = jDao.backupDno30();
		// 결과출력
		System.out.println(30 + " 번 부서원 " + cnt + " 명의 데이터를 백업했습니다.");
		
		int result = jDao.delDno30();
		System.out.println(30 + " 번 부서원 " + result + " 명의 데이터를 사원 테이블에서 삭제했습니다.");
		
		if(cnt == result) {
			// 백업과 삭제가 동일하므로 작업이 성공
			System.out.println("퇴사처리가 정상적으로 완료되었습니다.");
		} else {
			System.out.println("퇴사처리 작업에 문제가 있습니다. 이용현씨에게 문의하세요");			
		}
	}
	/*
	 	테이블의 데이터 삭제는 원칙적으로는 
	 	트리거가 처리하는것이 원칙이다.
	 	
	 	여기서는 질의명령으로 수동으로 처리하기로 해보자.
	 	
	 	순서는 
	 	삭제명령의 경우
	 	먼저 데이터를 백업테이블에 백업을 한 후
	 	해당 테이블에서 삭제해야한다.
	 	
	 	따라서 데이터베이스 작업이 두번 실행되어야 하고
	 	결과적으로 질의명령이 두개가 작성되어야 한다.
	 	
	 	여기서는 임의로 jemp테이블의 30번 부서 사원들을 삭제해보자
	 */
	
	// 제니데이터 입력 전용 함수
	public void addJennie() {
		// 제니 데이터를 추가해보자. 이름, 직급, 부서번호
		String name = "JENNIE";
		String job = "MANAGER";
		int dno = 40;
		
		// vo만들고
		EmpVO eVO = new EmpVO();
		
		// 데이터 체우고
		eVO.setEname(name);
		eVO.setJob(job);
		eVO.setDno(dno);
		
		// 데이터베이스작업 함수 호출
		
		int result = jDao.insertJemp(eVO);
		if(result == 1) {
			System.out.println("***" + name + "사원의 데이터 입력에 성공했습니다.");
		} else {
			System.out.println("######" + name + "사원 추가에 실패했습니다.");
		}
		
	}
	
	// 추가된 사원의 정보를 조회해서 출력하는 기능의 함수
	public void printLast() {
		// 데이터 받고
		EmpVO evo = jDao.getLast();
		
		System.out.println("");
		System.out.println("*** 마지막 입사한 사원 정보 ***");
		System.out.printf("사원번호 : %4d\n사원이름 : %-10s\n사원직급 : %-10s\n입 사 일 : %18s\n부서번호 : %2d\n ",
				evo.getEno(), evo.getEname(), evo.getJob(), evo.getSdate(), evo.getDno());
		
	}
	
	
	
	
	// emp 테이블을 복사해서 jemp테이블을 만드세요.
	public void addTable() {
		// 할일
		// dao의 함수 호출만 해주면 된다.
		 jDao.addJEMP();
	}

	public static void main(String[] args) {
		new JEmpCont();
	}

}
