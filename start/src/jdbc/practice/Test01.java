package jdbc.practice;
import java.sql.*;

import javax.swing.JOptionPane;

public class Test01 {

	public Test01() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String name = "scott";
			String pw = "tiger";
			
			Connection con = DriverManager.getConnection(url, name, pw);
			
			Statement stemt = con.createStatement();
			
			String sql = "SELECT * FROM emp";
			ResultSet rs = stemt.executeQuery(sql);
			
			while(rs.next()) {
				String name1 = rs.getString("ename");
				int no = rs.getInt("empno");
				System.out.println(no + " : " + name1);
				
			}
			
		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
