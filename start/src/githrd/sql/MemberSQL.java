package githrd.sql;

public class MemberSQL {
	public final int ALL_MEM		= 1000;
	public final int SEL_ALL		= 1001;
	public final int SEL_MNO		= 1002;
	public final int UP_TEL			= 2001;
	public final int INSERT_MEM		= 3001;

	
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		
		case ALL_MEM:
			buff.append("SELECT ");
			buff.append("	mno, name, id, pw, mail, avt, gen, joindate ");
			buff.append("FROM ");
			buff.append("	member ");
			break;
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("	mno, id ");
			buff.append("FROM ");
			buff.append("	member ");
			break;
		case SEL_MNO:
			buff.append("SELECT ");
			buff.append("	mno, name, id, pw, mail, avt, gen, joindate ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	mno = ? ");
			break;
		case UP_TEL:
			buff.append("UPDATE ");
			buff.append("    member ");
			buff.append("SET ");
			buff.append("    tel = ? ");
			buff.append("WHERE ");
			buff.append("    id = ? ");	
			break;
		case INSERT_MEM:
			buff.append("INSERT INTO ");
			buff.append("    member(mno, name, id, pw, mail, tel, gen) ");
			buff.append("VALUES( ");
			buff.append("    (SELECT ");
			buff.append("    max(mno) ");
			buff.append("FROM ");
			buff.append("    member) +1 , ?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			break;
		}
		return buff.toString();
	}
	
}
