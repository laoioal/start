package Self.pra.re.sql;

public class EmpSQL {
	public final int SEL_ALL = 1001;
	public final int SEL_DNO = 1002;
	public final int SEL_JOB = 1003;
	

	public String getSQL(int code) {
		
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL :
	 		buff.append("SELECT ");
 			buff.append("	empno, ename, job, hiredate ");
	 		buff.append("FROM ");
	 		buff.append("	emp ");
				break;
		case SEL_DNO :
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, sal, e.deptno, dname, loc ");
			buff.append("FROM ");
			buff.append("	emp e, dept d ");
			buff.append("WHERE ");
			buff.append("	e.deptno = d.deptno ");
			buff.append("	AND e.deptno = ? ");
				break;
		case SEL_JOB :
	 		buff.append("SELECT ");
	 		buff.append("	empno, ename, job, hiredate, sal, grade, NVL(TO_CHAR(comm), '커미션없음') comm "); 
	 		buff.append("FROM ");
	 		buff.append("	emp, salgrade ");
	 		buff.append("WHERE ");
	 		buff.append("	sal BETWEEN losal AND hisal ");
	 		buff.append("	AND job = ? ");
				break;
		
		}
		
		return buff.toString();
		
		
		
		
	}

}
