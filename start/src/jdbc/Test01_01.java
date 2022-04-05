package jdbc;
// JDBC 사용을 위한 클래스를 준비한 패키지를 임포트
import java.sql.*;

public class Test01_01 {

	public Test01_01() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("*** 접속 성공 ***");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("### 접속 성공 ###");
			
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM emp";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString("ename");
				int deptno = rs.getInt("deptno");
				System.out.println(deptno + " : " + name);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01_01();
	}

}
