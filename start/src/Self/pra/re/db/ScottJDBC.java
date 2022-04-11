package Self.pra.re.db;
import java.sql.*;

import Self.pra.re.sql.EmpSQL;

public class ScottJDBC {
	
	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	EmpSQL eSQL;
	

	public ScottJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection getCon() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		try {
			con = DriverManager.getConnection(url, id, pw);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return con;
	}
	

	public Statement getStmt(Connection con) {
		
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		} catch(Exception e) {
			
		}
				
		return stmt;
	}
	
	
	public PreparedStatement getPstmt(Connection con, String sql) {
	
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
		} catch(Exception e) {
			
		}
		
		
		return pstmt;
	}
	
	public void close(Object o) {
		
			try {
				if(o instanceof Connection) {
				((Connection) o).close();
				} else if ( o instanceof ResultSet) {
					((ResultSet) o).close();
				} else if (o instanceof Statement) {
					((Statement) o).close();
				} else if (o instanceof PreparedStatement) {
					((PreparedStatement) o).close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
