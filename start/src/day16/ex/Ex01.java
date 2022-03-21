package day16.ex;

import java.util.*;
import java.util.Map.Entry;
public class Ex01 {

	public Ex01() {
/*
 	5 ~ 10 사이의 정수를 랜덤하게 발생시켜서
 	그 수만큼의 학생의 점수를 기억하는 
 	HashMap을 만들어서 데이터를 기억시키고
 	꺼내서 출력하세요
 	데이터를 꺼낼때 키를 모두 추출해서 꺼내는 방식으로 출력하세요
 */
		
		
	HashMap map = new HashMap();
	
	map.put("학생1", (int) Math.random() * 6 + 5);
	
	Set set = map.keySet();
	Iterator itor = set.iterator();
	while(itor.hasNext()) {
		Object o = itor.next();
		Object value = map.get(o);
		
		System.out.println(o + " : " + value);
	}
	
	Set ent = map.entrySet();
	Iterator itor1 = ent.iterator();
	while(itor1.hasNext()) {
		Map.Entry en1 = (Map.Entry) itor1.next();
		
		Object o = en1.getKey();
		Object value = map.get(o);
		System.out.println(o + " : " + value);
		
	}
	
	
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
