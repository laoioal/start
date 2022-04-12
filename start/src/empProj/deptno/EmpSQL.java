package empProj.deptno;

import java.util.ArrayList;

import empProj.db.ScottJDBC;
import empProj.vo.EmpVO;
import java.sql.*;

public class EmpSQL {
	public final int SEL_DEPTNO		= 1007;
	private ScottJDBC db;
	private Connection con;
	private 
	
	

		
	public String getDEPTNO(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_DEPTNO:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, sal, hiredate ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	empno = ? ");
			break;
		}
		
		
		return buff.toString();
	}
	
	
	public ArrayList<EmpVO> getEmpno(int eno){
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		
		return list;
	}
	
	

}
