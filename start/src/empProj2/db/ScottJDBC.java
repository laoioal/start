package empProj2.db;
import java.sql.*;
public class ScottJDBC {

	public ScottJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("### 드라이버 로딩 실패 ###");
		}
	}
	// 커넥션 연결
	public Connection getCON() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	// Statement 연결
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	
	// PreparedStatement 연결
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	
	// 자원 반환 함수
	public void close(Object o) {
		try {
		if(o instanceof Connection) {
			((Connection) o).close();
				} else if(o instanceof Statement) {
					((Statement) o).close();
				} else if(o instanceof PreparedStatement) {
					((PreparedStatement) o).close();
				} else if(o instanceof ResultSet) {
					((ResultSet) o).close();
				}
			}  catch(Exception e) {
				e.printStackTrace();
		}
	}

}
