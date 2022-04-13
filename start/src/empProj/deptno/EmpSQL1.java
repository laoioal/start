package empProj.deptno;

import java.util.ArrayList;

import empProj.db.ScottJDBC;
import empProj.vo.EmpVO;
import java.sql.*;

public class EmpSQL1 {
	public final int SEL_EMPNO		= 1007;
	public final int SEL_ENO		= 1008;
	public final int SEL_ENOLIST	= 1009;
	private ScottJDBC db;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Statement stmt;
	
	public EmpSQL1() {
		db = new ScottJDBC();
	}

	

		
	public String getDEPTNO(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_EMPNO:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, sal, hiredate ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	empno = ? ");
			break;
		case SEL_ENO:
			buff.append("SELECT ");
			buff.append("	empno, ename ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
		case SEL_ENOLIST:
			buff.append("SELECT ");
			buff.append("	empno ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
		}
		
		
		return buff.toString();
	}
	
	
	// 사원번호를 입력받아서 정보를 반환해주는 함수
	public ArrayList<EmpVO> getEmpno(int eno){
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		con = db.getCON();
		String sql = getDEPTNO(SEL_EMPNO);
		pstmt = db.getPSTMT(con, sql);
		
		
		try {
			pstmt.setInt(1, eno);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				eVO.setEno(rs.getInt("empno"));
				eVO.setEname(rs.getString("ename"));
				eVO.setJob(rs.getString("job"));
				eVO.setSal(rs.getInt("sal"));
				eVO.setHdate(rs.getDate("hiredate"));
				eVO.setHtime(rs.getTime("hiredate"));				
				eVO.setSdate();
				
				list.add(eVO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		
		return list;
	}
	
	
	// 사원번호 조회 전담 
	public ArrayList<EmpVO> getEno() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		con = db.getCON();
		String sql = getDEPTNO(SEL_ENO);
		try {
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			EmpVO eVO = new EmpVO();
			
			eVO.setEno(rs.getInt("empno"));
			eVO.setEname(rs.getString("ename"));
			
			list.add(eVO);
		}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;
	}
	

	public ArrayList<Integer> getEno1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		con = db.getCON();
		String sql = getDEPTNO(SEL_ENOLIST);
		try {
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next()) {

	
			
			list.add(rs.getInt("empno"));
		}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;
	}
}
