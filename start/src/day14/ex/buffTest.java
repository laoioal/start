package day14.ex;

public class buffTest {

	public buffTest() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("가나다");
		sb.append("다라마");
		sb.append("바사아");
		sb.append("아자차");
		
		String abc = sb.toString();
		System.out.println(abc);
	}
	
	

	public static void main(String[] args) {
		new buffTest();
	}

}
