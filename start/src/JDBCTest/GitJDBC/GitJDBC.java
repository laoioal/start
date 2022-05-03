package JDBCTest.GitJDBC;

import java.sql.*;

public class GitJDBC {

	public GitJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 접속 실패");
		}
	}
	public Connection getCon() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "githrd";//
		String pw = "12345";
		try {
			con = DriverManager.getConnection(url, id, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public PreparedStatement getPstmt(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	public void close(Object o) {
			try {
				if(o instanceof Connection) {
					((Connection) o).close();
				} else if(o instanceof PreparedStatement) {
					((PreparedStatement) o).close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
		}
	}
}