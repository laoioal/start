package JDBCTest.SQL;
/**
 * @author 이용현
 * @since 2022.05.03
 * @version v.1.0
 */

public class MemberSQL {

	public final int SEL_MEMBER_INFO = 1001;

	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_MEMBER_INFO :
			buff.append("SELECT ");
			buff.append("	id, name, mail ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	mno = ? ");
			break;
		}
		return buff.toString();
	}
}

