package JDBCTest.DB;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import JDBCTest.GitJDBC.GitJDBC;
import JDBCTest.SQL.MemberSQL;
import githrd.vo.MemberVO;

public class MemberDao {
	
	MemberSQL mSQL;
	GitJDBC db;
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public MemberDao() {
		mSQL = new MemberSQL();
		db = new GitJDBC();
	}
	
	public MemberVO setMno(int no) {
		MemberVO mVO = new MemberVO();
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.SEL_MEMBER_INFO);
		pstmt = db.getPstmt(con, sql);
		try {
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			rs.next();
			mVO.setId(rs.getString("id"));
			mVO.setName(rs.getString("name"));
			mVO.setMail(rs.getString("mail"));
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return mVO;
	}

	
}
