package jdbc.sql.practice;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class Oracle1getDno {
	Oracle1SQL oSQL;
	Oracle1Conn Oconn;
	Oracle1sc Os;
	

	public void getALL() {
		 oSQL = new Oracle1SQL();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			Connection con = DriverManager.getConnection(url, id, pw);
			String sql = oSQL.getSQL(oSQL.SEL_DNO);
			PreparedStatement pstmt = Oconn.con.prepareStatement(sql);
			pstmt.setInt(1, Os.getSc());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Date htime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				int grade = rs.getInt("grade");
				String comm = rs.getString("comm");
				
				SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일 ");
				SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
				String sdate = form1.format(hdate) + form2.format(htime);
				
				// 출력
				System.out.printf("%5d | %10s | %10s | %24s | %6d | %2d | %7s\n", eno, name, job, sdate, sal, grade, comm);
				
				
				
			}
			
		} catch(Exception e) {
			
		} finally {
			
		}
	}
	
}
