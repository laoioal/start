package empProj2.sql;
/*
	전체조회
	
	부서번호조회
	부서번호 리스트
	
	직급조회
	직급리스트
	
	입력한 테이블 추가
	
	입력한 데이터 추가
	
 */

public class EmpSQL {
	public final int SEL_ALL = 1001;
	public final int SEL_DNO = 1002;
	public final int SEL_DNOLIST = 1003;
	public final int SEL_JOB = 1004;
	public final int SEL_JOBLIST = 1005;
	
	public final int ADD_TABLE = 2001;
	public final int ADD_DATE = 2002;
	
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("    empno, ename, job, hiredate ");
			buff.append("FROM ");
			buff.append("    emp ");
			break;
		case SEL_DNO:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, sal, e.deptno, dname, loc ");
			buff.append("FROM ");
			buff.append("	emp e, dept d ");
			buff.append("WHERE ");
			buff.append("	e.deptno = d.deptno ");
			buff.append("	AND e.deptno = ? ");
			break;
		case SEL_DNOLIST:
			buff.append("SELECT ");
			buff.append("		deptno, dname ");
			buff.append("FROM ");
			buff.append("	dept ");
			break;
		case SEL_JOB:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, sal, grade, NVL(TO_CHAR(comm), 'NONE') comm ");
			buff.append("FROM ");
			buff.append("	emp, salgrade ");
			buff.append("WHERE ");
			buff.append("	sal BETWEEN losal AND hisal ");
			buff.append("	AND job = ? ");
			break;			
		case SEL_JOBLIST:
			buff.append("SELECT ");
			buff.append("	DISTINCT job ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
			
		case ADD_TABLE:
			
			break;
		
			
		}
		
		
		
		return buff.toString();
		
	}
	
	
	
	
}
