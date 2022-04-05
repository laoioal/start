package jdbc.practice;

import java.sql.*;
import java.util.*;

public class Test02 {
	private Connection con;
	private PreparedStatement pstemt;
	private ResultSet rs;
	

	public Test02() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 부서번호를 입력하세요! : ");
		int dno = sc.nextInt();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("접속1 완료");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			
			con = DriverManager.getConnection(url, id, pw);
			 System.out.println("접속2 완료");
			
			String sql = "SELECT empno eno, ename, job, mgr, TO_CHAR(hiredate, 'YYYY/MM/dd') hdate, deptno dno FROM emp WHERE deptno = ? ";
			pstemt = con.prepareStatement(sql);
			
			pstemt.setInt(1, dno);
			rs = pstemt.executeQuery();
			
			
			
			while(rs.next()) {
				String name = rs.getString("ename");
				
				System.out.println(name);
			}
			
			
			
			
			
		} catch (Exception e) {
			
		} finally {
			try {
				rs.close();
				pstemt.close();
				con.close();
				
				
			} catch(Exception e) {
				
			}
		}
		
		
		
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
