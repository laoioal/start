package empProj.controller;

import empProj.dao.EmpDao;
import empProj.deptno.EmpSQL1;

public class test {
	private EmpSQL1 eSQL;
	private EmpDao eDAO;

	public test() {
		eSQL = new EmpSQL1();
		eSQL.getEmpno(7934);
	}

	public static void main(String[] args) {
		new test();
	}

}
