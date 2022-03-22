package day16.ex.self;
/*
	전화번호를 관리하는 프로그램을 작성 할 예정이다.
	추가될 친구들은 
		그룹, 이름, 전화번호
	로 입력할 예정이다.
	
	전화번호부 프로그램을 작성하세요
	==> 
		친구,	제니, 010-1111-1111
				리사, 010-2222-2222
				로제, 010-3333-3333
		회사
		웬수
		
		동호회
				둘리, 010-9876-5432
		
*/

import java.util.*;

public class Test06 {
	HashMap map = new HashMap();
	
	// 그룹 생성해줄 함수
	public void makeGroup(String name) {
		if(!map.containsKey(name)) {
			map.put(name, new HashMap() );
		}
	}
	
	// 친구 등록할 함수
	public void friend(String group, String name, String tel) {
		makeGroup(group);
		HashMap map1 = (HashMap) map.get(group);
		
		map1.put(name, tel);
		
	}
	
	// 한사람 꺼내는 함수
	public void getPerson(String group, String name) {
		
		HashMap map1 = (HashMap) map.get(group);
		String tel = (String) map1.get(name);
		
		System.out.println(name + " : " + tel);
		System.out.println();
	}
	
	
	// 특정 그룹 알아내는 함수
	public void getGroup(String group) { 
		HashMap map1 = (HashMap) map.get(group);
		
		Set set = map1.keySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			String o = (String)itor.next();
			String value =(String) map1.get(o);
			System.out.println(o + " : " + value);
			}
			System.out.println();
	}
	
	
	
	
	
	public Test06() {
		friend("친구", "제니", "010-1111-1111");
		friend("친구", "로제", "010-2222-2222");
		friend("친구", "리사", "010-3333-3333");
		friend("친구", "지수", "010-4444-4444");
		friend("웬수", "정은", "010-9999-9999");
		
		getGroup("친구");
		getGroup("웬수");
		
		getPerson("친구", "제니");
	}

	public static void main(String[] args) {
	new Test06();
	}

}
