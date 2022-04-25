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
	int j = 0;
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
			System.out.println();
			System.out.println("---------------------------------회원정보---------------------------------");
			System.out.printf("회원번호 : %4d\n아이디 : %-7s\n", i.getMno(), i.getId());
			System.out.println("--------------------------------------------------------------------------");
		}
	}
//---------------------------------------------------------------------------------------------------------------------------	
	
	
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
	public void MnoToPrint(Scanner sc) {
		System.out.println();
		int no = 0;
		String str = null;
		System.out.print("***### 회원번호를 입력해주세요 ###***\n\n회원번호를 모를경우 -1을 입력해주세요\n이전 단계로 이동하시려면 -3을 입력해주세요\n입력 : ");
		while(true) {
			no = sc.nextInt();
			if(no == -1) {
				nameToPrint();
				System.out.print("회원번호를 입력해주세요 : ");
			} else if(no == -3) {
				return;
			} else {
				break;
			}
		}
		ArrayList<MemberVO> list = getMno(no);
		for(MemberVO i : list) {
			System.out.println();
			System.out.println("---------------------------------회원정보---------------------------------");
			System.out.printf("회원번호 : %-4d\n이름 : %-7s\n아이디 : %-7s\n비밀번호 : %-10s\n메일 : %-20s\n아바타 : %-2d\n성별 : %-1s\n가입일 : %-22s\n\n", i.getMno(), i.getName(), i.getId(), i.getPw(), i.getMail(), i.getAvt(), i.getGen(), i.getSdate());
			System.out.println("--------------------------------------------------------------------------");
		}
		
	}

	
	// 회원번호와 이름을 산출해주는 함수
	public ArrayList<MemberVO> getName() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.ALL_MEM);
		stmt = db.getStmt(con);
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MemberVO mVO = new MemberVO();
				mVO.setMno(rs.getInt("mno"));
				mVO.setName(rs.getString("name"));
				list.add(mVO);
			}
		} catch(Exception e) {
			
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;
	}
	
	// 회원번호와 이름 산출해주는 함수
	public void nameToPrint() {
		ArrayList<MemberVO> list = getName();
		for(MemberVO i : list) {
			System.out.println("---------------------------------회원정보---------------------------------");
			System.out.print("회원번호 : " + i.getMno() + "\n이름 : " + i.getName() + "\n");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println();
		}
	}
	
//-----------------------------------------------------------------------------------------------------------------------------------------	

	
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
	public void upDateTelToPrint(Scanner sc) {
		String str = sc.nextLine();
		String str1 = null;
		String str2 = null;
		System.out.print("연락처를 변경할 회원 아이디를 입력해주세요. \n아이디를 모를경우 check를 입력해주세요.\n이전 단계로 이동하시려면 back를 입력해주세요\n입력 : ");
		while(true) {
		str1 = sc.nextLine(); // 아이디
		if(str1.equals("check")) {
			idToPrint();
			System.out.print("연락처를 변경할 회원 아이디를 입력해주세요 : ");
			} else if(str1.equals("back")) {
				return;
			} else {
				break;
			}
		}
		System.out.print("변경할 연락처를 입력해주세요 : ");
		while(true) {
		str2 = sc.nextLine(); // 정규식 표현 추가하기
		Matcher mat = pForm("tel").matcher(str2);
		if(mat.find() == false) {
			System.out.println("잘못된 연락처입니다.\n010-0000-0000형식으로 입력해주세요.\n연락처 입력 : ");
		} else {
			break;
		}
		}
		int cnt = upDateTel(str1, str2);
		if(cnt == 1) {
			System.out.println("아이디 : [" + str1 + "] 고객님의 연락처가 [" + str2 + "]로 변경되었습니다.");
		}
	}

	
	// 아이디와 이름을 산출해주는 함수
	public ArrayList<MemberVO> getId() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.ALL_MEM);
		stmt = db.getStmt(con);
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MemberVO mVO = new MemberVO();
				mVO.setName(rs.getString("name"));
				mVO.setId(rs.getString("id"));
				list.add(mVO);

			}
		} catch(Exception e) {
			
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;
	}
	
	// 회원번호와 이름 산출해주는 함수
	public void idToPrint() {
		ArrayList<MemberVO> list = getId();
		for(MemberVO i : list) {
			System.out.println("---------------------------------회원정보---------------------------------");
			System.out.print("회원이름 : " + i.getName() + "\n아이디 : " + i.getId() + "\n");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println();
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

	// 회원정보를 입력하여 등록하는 함수	
	public ArrayList<MemberVO> isMem(Scanner sc) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO mVO = new MemberVO();
		
		String str = sc.nextLine();
		
		for(int i = 0; i < 6; i++) {
			loop:
			switch(i) {
			case 0:
				System.out.println();
				System.out.print("***### 이름을 입력해주세요 ###***\n입력 : ");
				str = sc.nextLine();
				mVO.setName(str);
				System.out.println();
				break;
			case 1:
				System.out.println("----------------------------------------------------");
				System.out.print("***### 아이디를 입력해주세요 ###***\n\n이름을 다시 입력하고 싶으면 back을 입력해주세요\n입력 : ");
				str = sc.nextLine();
				if(str.equals("back")) {
					i -= 2;
					System.out.println();
					break;
				}
				mVO.setId(str);
				System.out.println();
				break;
			case 2:
				System.out.println("----------------------------------------------------");
				System.out.print("***### 비밀번호를 입력해주세요 ###***\n\n아이디를 다시 입력하고 싶으면 back을 입력해주세요\n입력 : ");
				str = sc.nextLine();
				if(str.equals("back")) {
					i -= 2;
					System.out.println();
					break;
				}
				mVO.setPw(str);
				System.out.println();
				break;
			case 3:
				System.out.println("----------------------------------------------------");
				System.out.print("***### 메일을 입력해주세요 ###***\n\n비밀번호를 다시 입력하고 싶으면 back을 입력해주세요\n입력 : ");
				while(true) {
				str = sc.nextLine();
				if(str.equals("back")) {
					i -= 2;
					System.out.println();
					break loop;
				}
				Matcher mat = pForm("mail").matcher(str);
				if(mat.find() == false) {
					System.out.println();
					System.out.print("잘못된 메일 형식입니다.\n______@_____.___형식으로 입력해주세요.\n 메입 입력 : ");
					
				} else {
					break;
				}
				}
				mVO.setMail(str);
				System.out.println();
				break;
			case 4:
				System.out.println("----------------------------------------------------");
				System.out.print("***### 연락처를 입력해주세요 ###***\n\n메일을 다시 입력하고 싶으면 back을 입력해주세요\n입력 : ");
				while(true) {
				str = sc.nextLine();
				if(str.equals("back")) {
					i -= 2;
					System.out.println();
					break loop;
				}
				Matcher mat = pForm("tel").matcher(str);
				if(mat.find() == false) {
					System.out.println();
					System.out.print("잘못된 연락처입니다.\n010-0000-0000형식으로 입력해주세요.\n 연락처 입력 : ");
				} else {
					break;
				}
				}
				mVO.setTel(str);
				System.out.println();
				break;
			case 5:
				System.out.println("----------------------------------------------------");
				System.out.print("***### 성별을 입력해주세요 ###***\n\n\t< 남자 : M / 여자 : F >\n연락처를 다시 입력하고 싶으면 back을 입력해주세요\n입력 : ");
				String gen = null;
				while(true) {
				str = sc.nextLine();
				if(str.equals("back")) {
					i -= 2;
					System.out.println();
					break loop;
				}
				gen = str.toUpperCase();
				Matcher mat = pForm("gen").matcher(gen);
				if(mat.find() == false) {
					System.out.println();
					System.out.print("잘못 입력하였습니다.\n 남자 : M / 여자 : F\n다시 입력해주세요 : ");
				} else {
					break;
				}
				}
				mVO.setGen(gen);
				System.out.println();
				break;
			}
			list.add(mVO);	
			
		}
		return list;
	}
	
	// 회원 추가할 함수
	public int insertMem(Scanner sc) {
		int cnt = 0;
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.INSERT_MEM);
		pstmt = db.getPstmt(con, sql);
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list = isMem(sc);
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

	
	// 회원추가 성공여부 출력
	public void insertMemToPrint(Scanner sc) {
		int cnt = insertMem(sc);
		if(cnt == 1) {
			System.out.println("회원정보 입력이 성공적으로 진행되었습니다.");
		} else {
			System.out.println("회원정보 입력이 실패하였습니다.");
		}
	}

	
/*
		Pattern form1 = Pattern.compile("01[\\d]{1}-\\d{4}-\\d{4}");
		Pattern form2 = Pattern.compile(".+@.+\\..+");
		Pattern form3 = Pattern.compile("[F|M]");	
 */
	
	// 패턴 함수
	public Pattern pForm(String str) {
		Pattern form = null;
		if(str.equals("mail")) {
			form = Pattern.compile(".+@.+\\..+");
		} else if(str.equals("tel")) {
			form = Pattern.compile("01[\\d]{1}-\\d{4}-\\d{4}");
		} else if(str.equals("gen")) {
			form = Pattern.compile("[F|M]");
		}
		
		return form;
		
	}


//-------------------------------------------------------------------------------------------------------------------------------
/*
	문제 ]
		회원리스트를 꺼내오는데
		한페이지당 3명의 아이디, 메일, 가입일을 리스트형식으로 보여주고
		그중에 한명의 아이디를 입력하면
		그 회원의 상세데이터를 보여주는 기능을 구현하세요
		
		한페이지당 보여주는 리스트의 개수는 3개로 하고
		한페이지당 보여지는 페이지 수는 3개로 한다.
		이전, 다음페이지를 같이 표현해서
		이동 가능한 페이지 메뉴는 총 5개로 하세요
		이전 페이지를 누르면 현재보는 페이지가 5페이지라고 한다면
		3페이지로 이동을 하고
		이동가능한 페이지는 1 ~ 3으로 변경되어야 한다.
		현재 보고는 페이지가 1페이지인데 다음을 선택하면
		보여지는 페이지는 4페이가 되고
		종료페이지는 6페이지가 되어야 한다.
		
		할일 ]
			회원리스트 꺼내오는 함수
			아이디 입력하면 해당 정보 출력해주는 함수

*/

// 아이디 입력하면 해당 정보 출력해주는 함수
	public ArrayList<MemberVO> setID(String ID) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.SEL_ID);
		pstmt = db.getPstmt(con, sql);
		try {
			pstmt.setString(1, ID);
			rs = pstmt.executeQuery();
			while(rs.next()) {
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
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return list;
	}

// 회원리스트 꺼내오는 함수 아이디, 메일, 가입일
	public ArrayList<MemberVO> getMember() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		int cnt = getCnt();
		int page = 0;
		if(cnt % 3 != 0) {
			page = (cnt / 3) + 1;
		} else {
			page = cnt / 3;
		}
		
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.MEM_ROW);
		pstmt = db.getPstmt(con, sql);
		try {
			int a = j;
			loop:
			for(int q = a; q < page; q++) {
				int mem = (j  * 3) + 3;
				int k = j * 3;
			
			
				for(int i = k ; i < mem ; i++) {
					pstmt.setInt(1, (i + 1));
					rs = pstmt.executeQuery();
		
					while(rs.next()) {
						MemberVO mVO = new MemberVO();
				
						mVO.setId(rs.getString("id"));
						mVO.setMail(rs.getString("mail"));
						mVO.setHdate(rs.getDate("joindate"));
						mVO.setHtime(rs.getTime("joindate"));
						mVO.setSdate();
						
						list.add(mVO);
						
						
					}
				}
				break loop;
			
		}
			
			
		} catch(Exception e) {
			
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;
		
	}

	
	// 회원수 조회하는 함수
	public int getCnt() {
		int cnt = 0;
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.MEM_CNT);
		stmt = db.getStmt(con);
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				cnt = rs.getInt("count(mno)");
			}
			
		} catch(Exception e) {
			
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
			
		}
		
		return cnt;
	}

	
	
	
	
	// 회원 3명씩 출력해주는 함수
	public void threeMemToPring(String str) {
		ArrayList<MemberVO> list = getMember();
	
		for(MemberVO i : list) {
			System.out.println("---------------------------------회원정보---------------------------------");
			System.out.print("아이디 : " + i.getId() + "\n메일 : " + i.getMail() + "\n가입일 : " + i.getSdate() + "\n");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println();
		}
		
	}
	// 아이디 입력하면 출력해주는 함수
	public void getId(String str) {
		ArrayList<MemberVO> list = setID(str);
		
		for(MemberVO i : list) {
			System.out.println("---------------------------------회원정보---------------------------------");
			System.out.printf("회원번호 : %-4d\n이름 : %-7s\n아이디 : %-7s\n비밀번호 : %-10s\n메일 : %-20s\n아바타 : %-2d\n성별 : %-1s\n가입일 : %-22s\n\n", i.getMno(), i.getName(), i.getId(), i.getPw(), i.getMail(), i.getAvt(), i.getGen(), i.getSdate());
			System.out.println("--------------------------------------------------------------------------");
			System.out.println();
		}
		
	}
	
	
	// 페이지 넘기는 함수
	public String page(Scanner sc) {
		threeMemToPring("시작");
		System.out.println("******************* " + (j + 1) + "페이지 *******************");
		System.out.println();
		String page = null;
		int cnt = 0;
		if(getCnt() % 3 != 0) {
			cnt = getCnt() / 3 + 1;
		} else {
			cnt = getCnt() / 3;
		}
		while(true) {
			System.out.print("다음 회원을 조회하시려면 \"다음\"을 이전 회원을 조회하시려면 \"이전\"을 프로그램을 종료하시려면 \"종료\"를 입력해주세요\n회원 상세조회를 하시려면 아이디를 입력해주세요.\n입력 : ");
			page = sc.nextLine();
			if(page.equals("다음")) {
				j += 1;
				threeMemToPring("다음");
				System.out.println("******************* " + (j + 1) + "페이지 *******************" );
				System.out.println();
			} else if(page.equals("이전")) {
				j -= 1;
				threeMemToPring("이전");
				System.out.println("******************* " + (j + 1) + "페이지 *******************");
				System.out.println();
			} else if(page.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else { 
				getId(page);
			}

		}
		return page;
		
	}
	

}	
