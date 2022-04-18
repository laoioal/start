package githrd.dao;

import java.sql.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import githrd.*;
import githrd.db.JenyJDBC;
import githrd.sql.MemberSQL;
import githrd.vo.MemberVO;

public class MemberDao {
	private JenyJDBC db;
	private MemberSQL mSQL;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public MemberDao() {
		db = new JenyJDBC();
		mSQL = new MemberSQL();
	
		/*
		con = db.getCon();
		System.out.println("### 커넥션 꺼내오기 성공 ###");
		db.close(con);
		*/
	}

	// 모든 회원의 회원번호, 아이디 산출
	public ArrayList<MemberVO> getAll() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.SEL_ALL);
		stmt = db.getStmt(con);
		try {
		
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			MemberVO mVO = new MemberVO();
			mVO.setMno(rs.getInt("mno"));
			mVO.setId(rs.getString("id"));
			
			list.add(mVO);
			
		}
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;
	}
	
	// 산출된 모든 회원의 회원번호, 아이디 출력함수
	public void AllToprint() {
		
		ArrayList<MemberVO> list = getAll();
		for(MemberVO i : list) {
			System.out.printf("회원번호 : %4d\n아이디 : %-7s\n\n", i.getMno(), i.getId());
		}
	}
	
	
	
	// 회원번호 입력하면 해당 회번정보를 산출해주는 함수
	public ArrayList<MemberVO> getMno(int no){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.SEL_MNO);
		pstmt = db.getPstmt(con, sql);
		try {
		pstmt.setInt(1, no);
		rs = pstmt.executeQuery();
		rs.next();
		MemberVO mVO = new MemberVO();
		mVO.setMno(rs.getInt("mno"));
		mVO.setName(rs.getString("name"));
		mVO.setId(rs.getString("id"));
		mVO.setPw(rs.getString("pw"));
		mVO.setMail(rs.getString("mail"));
		mVO.setAvt(rs.getInt("avt"));
		mVO.setGen(rs.getString("gen"));
		mVO.setHdate(rs.getDate("joindate"));
		mVO.setHtime(rs.getTime("joindate"));
		mVO.setSdate();		
		
		list.add(mVO);
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return list;
	}
	
	
	// 회원번호 입력하면 해당 회원정보 출력해주는 함수
	public void MnoToPrint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원번호를 입력해주세요 : ");
		int no = sc.nextInt();
		ArrayList<MemberVO> list = getMno(no);
		for(MemberVO i : list) {
			System.out.printf("회원번호 : %-4d\n이름 : %-7s\n아이디 : %-7s\n비밀번호 : %-10s\n메일 : %-20s\n아바타 : %-2d\n성별 : %-1s\n가입일 : %-22s\n\n", i.getMno(), i.getName(), i.getId(), i.getPw(), i.getMail(), i.getAvt(), i.getGen(), i.getSdate());
		}
		
	}
	

	
	// 아이디를 입력후 번호 입력하면 입력한 번호로 변경해주는 함수
	public int upDateTel(String str1, String str2) {
		int cnt = 0;
		MemberVO mVO = new MemberVO();
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.UP_TEL);
		pstmt = db.getPstmt(con, sql);
		try {
			pstmt.setString(1, str2);
			pstmt.setString(2, str1);
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}
	
	
	// 아이디와 변경할 번호 입력시 처리후 출력해주는 함수
	public void upDateTelToPrint() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("연락처를 변경할 회원 아이디를 입력해주세요 : ");
		String str1 = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.print("변경할 연락처를 입력해주세요 : ");
		String str2 = sc2.nextLine(); // 정규식 표현 추가하기
		int cnt = upDateTel(str1, str2);
		if(cnt == 1) {
			System.out.println("아이디 : [" + str1 + "] 고객님의 연락처가 [" + str2 + "]로 변경되었습니다.");
		}
	}

//-------------------회원 추가 함수 scanner 제외 후 다시 작성-----------------------------------------------------------
/*	
	// 회원 추가할 함수
	public int insertMem() {
		int cnt = 0;
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.INSERT_MEM);
		pstmt = db.getPstmt(con, sql);
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list = insert();

		try {
			
			for(MemberVO i : list) {			
			pstmt.setString(1, i.getName());
			pstmt.setString(2, i.getId());
			pstmt.setString(3, i.getPw());
			pstmt.setString(4, i.getMail());
			pstmt.setString(5, i.getTel());
			pstmt.setString(6, i.getGen());
			}
			cnt = pstmt.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}
	
	// 추가할 회원 입력하는 함수
	public ArrayList<MemberVO> insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원정보를 입력하시려면 아무키나 눌러주세요.");
		String str = sc.nextLine();
		String gen = null;
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO mVO = new MemberVO();
		Pattern form1 = Pattern.compile("01[\\d]{1}-\\d{4}-\\d{4}");
		Pattern form2 = Pattern.compile(".+@.+\\..+");
		Pattern form3 = Pattern.compile("[F|M]");
		int count = 0;
		
		while (count < 6) {
			
			switch(count) {
			case 0:
				System.out.print("이름을 입력해주세요 : ");
				str = sc.nextLine();
				mVO.setName(str);
				break;
			case 1:
				System.out.print("아이디를 입력해 주세요 : ");
				str = sc.nextLine();
				mVO.setId(str);
				break;
			case 2:
				System.out.print("비밀번호를 입력해 주세요 : ");
				str = sc.nextLine();
				mVO.setPw(str);
				break;
			case 3:
				System.out.print("메일을 입력해 주세요 : ");
				boolean bool1 = true;
				while(bool1) {
				str = sc.nextLine();
				Matcher mat = form2.matcher(str);
				if(mat.find() == false) {
					System.out.println("잘못된 메일 형식입니다.\noooo@oooo.ooo 형식으로 입력해주세요 : ");
					} else {
						break;
					}
				}
				mVO.setMail(str);
				break;
			case 4:
				System.out.print("전화번호를 입력해 주세요 : ");
				boolean bool2 = true;
				while(bool2) {
				str = sc.nextLine();
				Matcher mat = form1.matcher(str);
				if(mat.find() == false) {
					System.out.println("번호를 잘못 입력하셨습니다.\n010-0000-0000 형식으로 다시 입력해주세요 : ");
					} else {
						break;
					}
				}
				mVO.setTel(str);
				break;
			case 5:
				System.out.print("여자 : F, 남자 : M\n성별을 입력해 주세요 : ");
				boolean bool = true;
				while(bool){
				str = sc.nextLine();
				gen = str.toUpperCase();
				Matcher mat = form3.matcher(gen);
				if(mat.find() == false) {
					System.out.println("성별을 잘못 입력하였습니다.\n 여자 : F, 남자 : M\n다시 입력해주세요 : ");
				} else {
					break;
				}
				}
				mVO.setGen(gen);
				break;
			}
			list.add(mVO);
			
			
			count++;
		}
		return list;
	}

	
	
	// 회원추가 성공여부 출력
	public void insertMemToPrint() {
		int cnt = insertMem();
		if(cnt == 1) {
			System.out.println("회원정보 입력이 성공적으로 진행되었습니다.");
		} else {
			System.out.println("회원정보 입력이 실패하였습니다.");
		}
	}
 */
//-----------------------------------------------------------------------------------------------------------
	// 회원 이름 추가함수
	public ArrayList<MemberVO> setName(Scanner sc) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO mVO = new MemberVO();
		String name = sc.nextLine(); 
		mVO.setName(name);
		list.add(mVO);
		return list;
	}
	// 회원 아이디 추가함수
	public ArrayList<MemberVO> setId(Scanner sc) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO mVO = new MemberVO();
		String id = sc.nextLine(); 
		mVO.setId(id);
		list.add(mVO);
		return list;
	}
	// 회원 비밀번호 추가함수
	public ArrayList<MemberVO> setPw(Scanner sc) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO mVO = new MemberVO();
		String pw = sc.nextLine(); 
		mVO.setPw(pw);
		list.add(mVO);
		return list;
	}
	// 회원 메일 추가함수
	public ArrayList<MemberVO> setMail(Scanner sc) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO mVO = new MemberVO();
		String mail = sc.nextLine(); 
		mVO.setMail(mail);
		list.add(mVO);
		return list;
	}
	// 회원 연락처 추가함수
	public ArrayList<MemberVO> setTel(Scanner sc) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO mVO = new MemberVO();
		String tel = sc.nextLine(); 
		mVO.setTel(tel);
		list.add(mVO);
		return list;
	}
	// 회원 성별 추가함수
	public ArrayList<MemberVO> setGen(Scanner sc) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO mVO = new MemberVO();
		String gen = sc.nextLine(); 
		mVO.setGen(gen);
		list.add(mVO);
		return list;
	}
	
	public MemberVO setName1(Scanner sc) {
		MemberVO mVO = new MemberVO();
		String name = sc.nextLine();
		mVO.setName(name);
		return mVO;
		
	}
	
	// 회원 추가 함수
	public int setMem(Scanner sc) {
		int cnt = 0;
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.INSERT_MEM);
		pstmt = db.getPstmt(con, sql);
		int n = 0;

		try {
//			pstmt.setString(1, );
			
		} catch(Exception e) {
			
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
		
	}
	public ArrayList<MemberVO> setMem2(Scanner sc) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO mVO = new MemberVO();
		String name = null;
		String id = null;
		String pw = null;
		String mail = null;
		String tel = null;
		String gen = null;
		
		while (true) {
			name = sc.nextLine();
			if(name != null) {
				
			}
		}
		
		
		
		return list;
	}
	

	
/*
		Pattern form1 = Pattern.compile("01[\\d]{1}-\\d{4}-\\d{4}");
		Pattern form2 = Pattern.compile(".+@.+\\..+");
		Pattern form3 = Pattern.compile("[F|M]");	
 */
	

}	
