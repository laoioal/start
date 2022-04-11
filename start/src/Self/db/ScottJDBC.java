package Self.db;
import java.sql.*;

import Self.pra.EmpSQL;


public class ScottJDBC {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	

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
		} catch(Exception e) {
			
		}
		
		return con;
	}
	
	
	public Statement getStmt(Connection con) {
		stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return stmt;
	}
	
	
	public PreparedStatement getPstmt(Connection con, String sql) {
		pstmt = null;
				
		try {
			pstmt = con.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			
		}
		
		
		
		return pstmt;

	}
	
	
	
	public void close(Object o) {
		
			try {
				if(o instanceof Connection) {
					((Connection) o).close();}
				else if(o instanceof Statement) {
					((Statement) o).close();}
				else if(o instanceof PreparedStatement) {
					((PreparedStatement) o).close();}
				else if(o instanceof ResultSet) {
					((ResultSet) o).close();

				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}
	

}
