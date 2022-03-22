package day16.ex;

import java.util.*;

public class Ex02 {
	/*
	 	학생들의 과목점수를 기억하는 HashMap을 만들고
	 	다섯 학생의 점수를 저장해서 출력하는 프로그램을 작성하세요.
	 	과목은
	 		국어, 영어, 수학, 과학, 국사
	 	의 점수를 기억하도록 하세요
	 	
	 	
	 */
	HashMap map = new HashMap();
	
	// 학생 이름을 기억할 함수
	public void studentName(String name) {
		if(!map.containsKey(name)) {
			map.put(name, new HashMap());
		}
	}
	
	// 점수 기억할 함수
	public void subject(String name, String sub1, String sub2, String sub3, String sub4, String sub5, int score1, int score2, int score3, int score4, int score5) {
		studentName(name);
		
		HashMap map1 = (HashMap) map.get(name);
		map1.put(sub1, score1);
		map1.put(sub2, score2);
		map1.put(sub3, score3);
		map1.put(sub4, score4);
		map1.put(sub5, score5);
	
	}
	
	
	// 한명 꺼내는 함수
	public void getStudent(String name, String sub) {
		HashMap map1 = (HashMap) map.get(name);
		
		int score = (int) map1.get(sub);
		System.out.println(name);
		System.out.println(sub + " : " + score);
		
	}
	
	// 특정이름 전체 알아내는함수
	public void getScore(String name) {
		System.out.println();
		HashMap map1 = (HashMap) map.get(name);
		
		Set set = map1.keySet();
		Iterator itor = set.iterator();
		System.out.println(name);
		while(itor.hasNext()) {
			String key = (String) itor.next();
			int value = (int) map1.get(key);
			
			System.out.println(key + " : " + value);
		}
				
		
	}
	
	
	

	public Ex02() {
		subject("홍길동", "국어", "영어", "수학", "과학", "국사", (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60));
		subject("제니", "국어", "영어", "수학", "과학", "국사", (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60));
		subject("로제", "국어", "영어", "수학", "과학", "국사", (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60));
		subject("지수", "국어", "영어", "수학", "과학", "국사", (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60));
		subject("리사", "국어", "영어", "수학", "과학", "국사", (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60));
		
		
		getStudent("지수", "국어");
		getStudent("지수", "영어");
		getStudent("로제", "수학");
		
		getScore("홍길동");
		getScore("제니");
		getScore("지수");
		getScore("로제");
		getScore("리사");
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
