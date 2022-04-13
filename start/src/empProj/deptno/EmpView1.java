package empProj.deptno;
import empProj.deptno.*;
import empProj.vo.EmpVO;

import java.util.*;

public class EmpView1 {
	private EmpSQL1 eSQL;
	
	public EmpView1() {
		eSQL = new EmpSQL1();
	}
	
	// 모든사원번호 이름 출력함수
	public void enoPrint() {
		ArrayList<EmpVO> list = eSQL.getEno();
		
		for(EmpVO i : list) {
			System.out.println(i.getEno() + " - " + i.getEname());
		}
	}
	
	
	
	// 사원번호 입력받아 처리 함수
	public int getEno(Scanner sc) {
		int eno = 0;
		ArrayList<Integer> list = eSQL.getEno1();
		

		while(true) {
			enoPrint();
			System.out.print("사원번호를 입력하세요! 이전단계는 -1을 입력하세요.\n사원번호 : ");
			String sno = sc.nextLine();
			System.out.println();
			eno = Integer.parseInt(sno);
			try {
				
				
				if(eno != -1 && !list.contains(eno)) {
					System.out.println("# 없는 사원번호입니다. 다시 입력하세요!\n");
					continue;
				}
				
			} catch(Exception e) {
				System.out.println("# 잘못된 입력입니다.");
				continue;
			}
			break;
		}
		System.out.println(eno);
		return eno;
	}
	
// 사원정보 출력해주는 함수	
	
	public void enoinfoprint(Scanner sc) {
		while(true) {
			int eno = getEno(sc);
			System.out.println("여기까진 된당");
			if(eno == -1) {
				break;
			}
			ArrayList<EmpVO> list = eSQL.getEmpno(eno);
			
			// 리스트에 들어가있는지 확인
			for(EmpVO k : list) {
				System.out.println(k.getEname());
			}
			
			System.out.println("*** " + eno + "번 부서원 정보조회");
			System.out.println("===========================================================================");
			System.out.println("| 사원번호 |  사원이름  |   직  급   |        입   사   일       | 급  여 |");
			System.out.println("---------------------------------------------------------------------------");

			for(EmpVO i : list) {
				System.out.printf("|%7d   | %10s | %10s | %22s | %6d |", i.getEno(), i.getEname(), i.getJob(), i.getSdate(), i.getSal());
			}
			
		}
		
	}
	

}
