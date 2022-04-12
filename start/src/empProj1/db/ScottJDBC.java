package empProj1.db;
import java.sql.*;

/*
 	이 클래스는 오라클의 scott계정으로
 	jdbc작업을 할 때 필요한 scott 전용 부품을 만들 예정이다.
 	
 	어제까지 작업의 내용을 보면 반복적인 작업이 많이 포함되어 있다.
 	
 	
 	이런 반복적인 작업을 좀더 편하게 하기 위해서 
 	나만의 부품을 만들어서 사용할 예정이다.
 	
 */


public class ScottJDBC {
/*
 	이 클래스를 어디선가 사용하려고 하면 new 명령으로 인스턴스를 만들것이다.
 	이 때 생성자 함수가 동시에 호출될 것이고
 	나는 그 순간에 오라클 드라이버 로딩을 자동으로 하도록 해주고 싶다.
 */
	public ScottJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			System.out.println("### 드라이버 로딩 실패 ###");
		}
	}
	
	// 누군가 오라클 세션을 요구하면 대신 접속해서 반환해주는 기능의 함수
	public Connection getCon() {
		// 반환값 변수
		Connection con = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pw = "tiger";
		
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		// 커넥션 반환
		return con;
	}
	
	// 명령 전달도구를 Statment 요구하면 준비해서 반환해주는 함수
	public Statement getSTMT(Connection con) {
		// 반환값 변수
		Statement stmt = null;
		
		// 명령전달도구준비
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			/*
			 	양방향 이동가능한 Statement 만들기
			 	
			 		ResultSet 의 Type
			 			1. TYPE_FORWARD_ONLY		: scroll이 불가능한 전(앞) 방향 전용
			 			2. TYPE_SCROLL_INSENSITIVE	: scroll은 가능하나, 변경된 사항은 적용되지 않음
			 			3. TYPE_SCROLL_SENSITIVE	: scroll도 가능하고 변경된 사항도 적용
			 			
			 		CONCURRENCY 의 TYPE	
			 		
				 		1. CONCUR_READ_ONLY	: ResultSet 객체의 변경이 불가능
				 		2. CONCUR_UPDATABLE	: ResultSet 객제의 변경이 가능
			 */
		} catch(Exception e) {
			
		}
		
		return stmt;
	}
	
	// PreparedStatment 준비해서 변환해주는 함수
	public PreparedStatement getPSTMT(Connection con, String sql) {
		// 반환값 변수
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			
		}
		return pstmt;
	}

	// 사용하지 않는 자원을 반환해주는 함수
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
			
			
			
			
		} catch(Exception e) {
			
		}
	}
	
	
	
}
