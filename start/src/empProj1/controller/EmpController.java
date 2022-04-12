package empProj1.controller;

import java.util.*;

import empProj1.dao.EmpDao;
import empProj1.vo.EmpVO;

public class EmpController {
private EmpDao eDao;
	public EmpController() {
		eDao = new EmpDao();
		
		ArrayList<EmpVO> list = eDao.getAll();
		for(EmpVO e : list) {
			System.out.println(e);
		}
		
		// 20번 부서 입력해서 부서원들의 정보를 조회
		Scanner sc = new Scanner(System.in);
		System.out.println("부서입력");
		int no = sc.nextInt();
		
		ArrayList<EmpVO> list1 = eDao.getDnoInfo(no);
		for(EmpVO b : list1) {
			System.out.println(b);
		}
		
		// SALESMAN 직급을 가진 사원들의 정보 조회
		
	}
	

	public static void main(String[] args) {
		new EmpController();
	}

}
