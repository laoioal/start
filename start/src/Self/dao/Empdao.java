package Self.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import Self.EmpVO;
import Self.db.ScottJDBC;
import Self.pra.EmpSQL;



public class Empdao {
	private EmpSQL eSQL;
	private ScottJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	

	public Empdao() {
		eSQL = new EmpSQL();
		db = new ScottJDBC();
		
		
	}
	
	// 모든사원 반환
	public ArrayList<EmpVO> getALL() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();

		try {
			con = db.getCon();
			stmt = db.getStmt(db.getCon());
			String sql = eSQL.getSQL(eSQL.SEL_ALL);
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				
				
				eVO.setEno(eno);
				eVO.setEname(name);
				eVO.setJob(job);
				eVO.setHdate(hdate);
				eVO.setHtime(htime);
				
				list.add(eVO);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		

		return list;

	}
	
	
	
	// 부서번호 반환
	public ArrayList<EmpVO> getDNO(int dno) {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		con = db.getCon();
		String sql = eSQL.getSQL(eSQL.SEL_DNO);

		try {
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, dno);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				
				
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				
				eVO.setEno(eno);
				eVO.setEname(name);
				eVO.setJob(job);
				eVO.setHdate(hdate);
				eVO.setHtime(htime);
				
				
				list.add(eVO);
				
				
			}
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				db.close(rs);
				db.close(pstmt);
				db.close(con);
			} catch(Exception e) {
				
			}
		}
		
		
		
		return list;
		
	}

	private Scanner nextInt() {
		return null;
		
	}
	
	
	
	// 직업입력
	public ArrayList<EmpVO> getJOB(String str) {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>() ;
		con = db.getCon();
		String sql = eSQL.getSQL(eSQL.SEL_JOB);
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, str);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				int grade = rs.getInt("grade");
				String comm = rs.getString("comm");
				
				
				eVO.setEno(eno);
				eVO.setEname(name);
				eVO.setJob(job);
				eVO.setHdate(hdate);
				eVO.setHtime(htime);
				eVO.setSal(sal);
				eVO.setGrade(grade);
				eVO.setScomm(comm);
				
				list.add(eVO);
				
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	finally {
			try {
				db.close(rs);
				db.close(pstmt);
				db.close(con);
			} catch(Exception e) {
				
			}
		}	
		return list;
	}
	
	

}
