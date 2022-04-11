package jdbc.practice;
/*
	emp 테이블의 데이터를 조회하는데
	dno 라는 문자열을 입력 받으면
 	부서번호를 입력받아서 해당 부서의 부서원들의
 		사원번호, 사원이름, 직급, 입사일, 급여, 부서번호, 부서이름, 부서위치
 	를 출력해주고
	job 이라는 문자열을 입력 받으면
		해당 직급을 가진 사원들의
			사원번호, 사원이름, 직급, 입사일, 급여, 급여등급, 커미션
		을 출력하고
		
	all 을 입력받으면 모든 사원들의
			사원번호, 사원이름, 직급, 입사일
		을 조회하는 프로그램을 작성하세요
	단, exit 단어가 입력되면 프로그램이 즉시 종료되게 하세요
	
*/
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.*;
public class day03test {
	private final int SEL_ALL = 0;
	private final int SEL_DNO = 1;
	private final int SEL_JOB = 2;
	
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public day03test() {
		boolean bool = true;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			while(bool) {
			getInput();
			System.out.println();
			System.out.println("*** 조회 완료 ***");
			System.out.println("계속 조회하시겠습니까?");
			Scanner sc = new Scanner(System.in);
			System.out.print("계속 조회 : 1\n중지 : 2\n\t입  력 : ");
			int no = sc.nextInt();
			if(no == 2) {
				bool = false;
			}
			}	
			
		} catch(Exception e) {
			
		}

			
		
		
	}
	
	// all, dno, job 입력시 질의명령
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
	
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
		case SEL_DNO :
			buff.append("SELECT ");
			buff.append("empno, ename, job, hiredate, sal, e.deptno, dname, loc ");
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
	
	public void getInput() {

		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호 조회 : dno\n직급별조회 : job\n전체사원조회 : all\n\t명령입력 : ");
		String str = sc.nextLine();

		
		switch(str) {
		case "all" :
			getAll();
			break;
		case "dno" :
			getDno();
			break;
		case "job" :
			getJob();
			break;
		}

		
		
	}
	
	
	
	
	
	
	// all을 선택했을때 결과
	public void getAll() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		try {
		con = DriverManager.getConnection(url, id, pw);
		String sql = getSQL(SEL_ALL);
		stmt = con.createStatement();
		
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int no = rs.getInt(1);
			String name = rs.getString(2);
			String job = rs.getString(3);
			
			Date hdate = rs.getDate(4);
			Date tdate = rs.getDate(4);
			
			SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일 ");
			SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
			
			String sdate = form1.format(hdate) + form2.format(tdate);
			
			System.out.printf("%5d | %10s | %10s | %24s\n", no, name, job, sdate);
		}
		
		} catch (Exception e) {}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch(Exception e) {
				
			}
		} 
	}
	
	
	public void getDno() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 부서번호 조회 ***");
		System.out.print("부서번호 :\n\t10\n\t20\n\t30\n\n\t 부서번호 입력 : ");
		int dno = sc.nextInt();
		
		try {

			con = DriverManager.getConnection(url, id, pw);
			String sql = getSQL(SEL_DNO);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dno);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//empno, ename, job, hiredate, sal, e.deptno, dname, loc
				int no = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Date tdate = rs.getDate("hiredate");
				SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일 ");
				SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
				String sdate = form1.format(hdate) + form2.format(tdate);
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				
				//System.out.println(name);
				System.out.printf("%5d | %10s | %10s | %24s | %8d | %3d | %10s | %15s\n", no, name, job, sdate, sal, deptno, dname, loc);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {}
		}
		
		
		
	}
	
	public void getJob() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 직급별 조회 ***");
		System.out.print("ANALYSY\n\tCLERK\n\tMANAGER\n\tPRESIDENT\n\tSALESMAN\n\t직급을 입력해주세요 : ");
		String str = sc.nextLine();
		
		StringBuffer buff = new StringBuffer();
		for(int i = 0; i < str.length(); i ++) {
			
		int tmp = str.charAt(i);
		
		if( tmp >= 'a' && tmp <= 'z' ) {
			tmp = tmp - ('a' - 'A');
			buff.append((char)tmp);
		}
	}
		String str2 = buff.toString();
		
		
		try {
		con = DriverManager.getConnection(url, id, pw);
		
		String sql = getSQL(SEL_JOB);
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, str2 );
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			// 	empno, ename, job, hiredate, sal, grade, NVL(TO_CHAR(comm), '커미션없음') comm 
			int no = rs.getInt("empno");
			String name = rs.getString("ename");
			String job = rs.getString(3);
			
			Date hdate = rs.getDate(4);
			Date tdate = rs.getDate(4);
			SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일 ");
			SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
			String sdate = form1.format(hdate) + form2.format(tdate);
			int sal = rs.getInt(5);
			int grade = rs.getInt(6);
			String comm = rs.getString(7);
			
			System.out.printf("%5d | %10s | %10s | %24s | %6s | %2d | %8s\n", no, name, job, sdate, sal, grade, comm);
					
			
			
		}
		

		} catch(Exception e) {
			
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {
				
			}
		}
		
	}
	

	public static void main(String[] args) {
		new day03test();
	}

}
