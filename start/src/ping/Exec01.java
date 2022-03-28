package ping;

import java.util.*;

public class Exec01 {

	public Exec01() {
		boolean bool = true;
		
	
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		
		PingServer02 t1 = new PingServer02();
		while(bool) {
		System.out.println("*** 핑서버프로그램 ***\n서버기동 : start\n서버중단 : quit\n명령을 입력하세요.");
		String str = sc.nextLine();
		
		switch(str) {
			case "start" :
				if(!(t1.isStart())) {
					t1.start();
				}
				break;
			case "quit" :
			bool = false;
			t1.setStart(false);
				break;
		}
	}
	}
	public static void main(String[] args) {
		new Exec01();
	}

}
