package empProj2.dao;

import empProj2.db.ScottJDBC;
import empProj2.sql.EmpSQL;
import empProj2.vo.EmpVO;

import java.sql.*;
import java.util.ArrayList;

public class EmpDao {
	private EmpVO eVO;
	private ScottJDBC db;
	private EmpSQL eSQL;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public EmpDao() {
		db = new ScottJDBC();
		eSQL = new EmpSQL();
	}

	// 전체 조회해주는 함수
	public ArrayList<EmpVO> getAll() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		con = db.getCON();
		String sql = eSQL.getSQL(eSQL.SEL_ALL);
		stmt = db.getSTMT(con);
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				eVO.setEno(rs.getInt("empno"));
				eVO.setEname(rs.getString("ename"));
				eVO.setJob(rs.getString("job"));
				eVO.setHdate(rs.getDate("hiredate"));
				eVO.setHtime(rs.getTime("hiredate"));
				eVO.setSdate();
				
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
	


}
