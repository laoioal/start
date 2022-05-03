package JDBCTest.DB;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import JDBCTest.GitJDBC.GitJDBC;
import JDBCTest.SQL.MemberSQL;
import githrd.vo.MemberVO;

public class MemberDao1 {
	
	MemberSQL mSQL;
	GitJDBC db;
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public MemberDao1() {
		mSQL = new MemberSQL();
		db = new GitJDBC();
	}
	
	public ArrayList<MemberVO> setMno(int no) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.SEL_MEMBER_INFO);
		pstmt = db.getPstmt(con, sql);
		try {
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVO mVO = new MemberVO();
				mVO.setId(rs.getString("id"));
				mVO.setName(rs.getString("name"));
				mVO.setMail(rs.getString("mail"));
				
				list.add(mVO);
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

	public void toPring(int no) {
		ArrayList<MemberVO> list = setMno(no);
		for(MemberVO mem : list) {
			System.out.print("\n아이디 : " + mem.getId() + "\n회원이름 : " + mem.getName() + "\n이메일 : " + mem.getMail() + "\n\n");
		}
	}
	

}
