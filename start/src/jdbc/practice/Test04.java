package jdbc.practice;
import java.sql.*;
import java.util.*;
public class Test04 {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	

	public Test04() {
		boolean bool = true;
		while(bool) {
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호를 입력해주세요.\n\t1. 10번부서 : 10\n\t2. 20번부서 : 20\n\t3. 30번부서 : 30\n\t4. 종    료 : 4\n\n\t입       력 : ");
		int dno = sc.nextInt();
		if(dno == 4) {
			System.out.println("종료");
			break;
		}
		
		
		System.out.println("****************************************************************************************");
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		con = DriverManager.getConnection(url, id, pw);
		
		StringBuffer buff = new StringBuffer();
		buff.append("SELECT ");
		buff.append("	empno eno, ename, job, mgr, TO_CHAR(hiredate, 'YYYY/MM/dd') hdate, deptno dno ");
		buff.append("FROM ");
		buff.append("	emp ");
		buff.append("WHERE ");
		buff.append("	deptno = ? ");
		
		String sql = buff.toString();
		
		pstmt = con.prepareStatement(sql);
		
		
		pstmt.setInt(1, dno);
		
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int eno = rs.getInt(1);
			String name = rs.getString("ename");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			String hdate = rs.getString("hdate");
			dno = rs.getInt("dno");
			
			// 출력
			System.out.printf("%5d - %15s - %10s - %5d - %10s - %4d\n", eno, name, job, mgr, hdate, dno);
			}
		System.out.println("****************************************************************************************");
		} catch (Exception e) {
			
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
				System.out.println();
			} catch(Exception e) {}
		}
		
		}
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
