package githrd.db;
import java.sql.*;
/**
 * 이 클래스는 jennie 계정으로 데이터베이스 작업을 할 경우
 * 필요한 드라이버를 로딩하는 작업, 커넥션, 스테이먼트를 필요할 때 반환해주는 기능을 가지는 클래스
 * @author 이용현
 * @since 2022.04.15
 * @version v.1.0
 */

public class JenyJDBC {

	public JenyJDBC() {
		// 이 클래스가 new 될때 드라이버로딩이 되게 처리한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			System.out.println("### 드라이버 로딩 실패 ###");
		}
		
	}
	
	// 데이터베이스 작업을 위해 접속이 필요한 경우 커넥션을 만들어서 반환해주는 함수
	public Connection getCon() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "jennie";
		String pw = "12345";
		try {
			con = DriverManager.getConnection(url, id, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public Connection getCon(String user, String pw) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	// Statement가 필요하면 준비해서 반환해주는 함수
	public Statement getStmt(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			
		}
		return stmt;
	}
	
	// PreparedStatement가 필요하면 준비해서 반환해주는 함수
	public PreparedStatement getPstmt(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return pstmt;
	}
	
	// 사용하지 않는 자우너 반환해주는 함수
	public void close(Object o) {
		
			try {
				if(o instanceof Connection) {
				((Connection) o).close();
				/*
				 (Connection) o.close() --> o를 close하고난 뒤 Connection으로 변환해준다는 의미
				 	==> o의 멤버중 close() 함수를 호출한 결과를 Connection으로 강제형변환
				 */
				} else if(o instanceof Statement) {
				((Statement) o).close();
				} else if(o instanceof PreparedStatement) {
					((PreparedStatement) o).close();
				}
					
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

}
