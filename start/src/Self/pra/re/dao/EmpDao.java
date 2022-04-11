package Self.pra.re.dao;
import java.sql.*;
import java.util.ArrayList;

import Self.pra.re.db.ScottJDBC;
import Self.pra.re.sql.EmpSQL;
import Self.pra.re.vo.EmpVO;

public class EmpDao {
	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	ScottJDBC db;
	EmpSQL eSQL;
	
	

	public EmpDao() {
		db = new ScottJDBC();
		eSQL = new EmpSQL();
				
	}
	
	
	public ArrayList<EmpVO> getAll(){
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		con = db.getCon();
		stmt = db.getStmt(con);
		try {
			rs = stmt.executeQuery(eSQL.getSQL(eSQL.SEL_ALL));
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				int no = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				
				eVO.setEno(no);
				eVO.setName(name);
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
	
	
	
	public ArrayList<EmpVO> getDNO(int no) {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		try {
			con = db.getCon();
			String sql = eSQL.getSQL(eSQL.SEL_DNO);
			pstmt = db.getPstmt(con, sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				int eno = rs.getInt("empno");
				String name = rs.getString(2);
				String job = rs.getString(3);
				Date hdate = rs.getDate(4);
				Time htime = rs.getTime(4);
				int sal = rs.getInt(5);
				int dno = rs.getInt(6);
				String dname = rs.getString(7);
				String loc = rs.getString(8);
				
				eVO.setEno(eno);
				eVO.setName(name);
				eVO.setJob(job);
				eVO.setHdate(hdate);
				eVO.setHtime(htime);
				eVO.setSal(sal);
				eVO.setDno(dno);
				eVO.setDname(dname);
				eVO.setLoc(loc);
				
				list.add(eVO);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
			
		}
		return list;
		
	}
	
	
	public ArrayList<EmpVO> getJOB(String str) {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		try {
			con = db.getCon();
			String sql = eSQL.getSQL(eSQL.SEL_JOB);
			pstmt = db.getPstmt(con, sql);
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
				eVO.setName(name);
				eVO.setJob(job);
				eVO.setHdate(hdate);
				eVO.setHtime(htime);
				eVO.setSal(sal);
				eVO.setGrade(grade);
				eVO.setComm(comm);
				
				list.add(eVO);
			}
			
			
		} catch(Exception e) {
			db.close(rs);
			db.close(pstmt);
			db.close(con);;
		}
		
		
		return list;
	}
	

}
