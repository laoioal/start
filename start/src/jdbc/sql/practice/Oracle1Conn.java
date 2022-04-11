package jdbc.sql.practice;
import java.sql.*;

public class Oracle1Conn {
	Oracle1SQL oSQL = new Oracle1SQL();
	ResultSet rs;
	Connection con;
	PreparedStatement pstmt;
	Statement stmt;
	public void setDNO() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		con = DriverManager.getConnection(url, id, pw);
		
		} catch(Exception e) {
			
		} 
		
		
	}
	
	
	public void close() {
		try {
			rs.close();
			stmt.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			
		}
		
	}

}
