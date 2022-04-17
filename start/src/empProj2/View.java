package empProj2;

import java.util.ArrayList;

import empProj2.dao.EmpDao;
import empProj2.vo.EmpVO;

public class View {
	EmpDao eDao;
	public void getAll() {
		eDao = new EmpDao();
		ArrayList<EmpVO> list = eDao.getAll();
		for(EmpVO evo : list) {
			System.out.printf("사원번호 : %4d\n사원이름 : %-10s\n직급 : %-10s\n입사일 : %22s\n\n", evo.getEno(), evo.getEname(), evo.getJob(), evo.getSdate());
		}
		
	}

}
