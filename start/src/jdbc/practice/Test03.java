package jdbc.practice;

import java.sql.*;
import java.util.*;


public class Test03 {

	public Test03() {
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("조회할 부서번호를 입력하세요! : ");
			int dno = sc.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url, "scott", "tiger");
			
			StringBuffer buff = new StringBuffer();
			buff.append("SELECT ");
			buff.append("	empno eno, ename, job, mgr, TO_CHAR(hiredate, 'YYYY/MM/dd') hdate, deptno dno ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	deptno = ? ");
			
			String sql = buff.toString();
			
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, dno);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("eno");
				String name = rs.getString("ename");
				
			System.out.println(no + " + " + name);
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
