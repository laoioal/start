package day15.ex.self;
/*
	HashSet에 랜덤하게 숫자 6개를 채워보자
	
	Set 계열 특징
		1. 입력순서 보장하지 않는다.
		2. 중복데이터 입력을 허락하지 않는다.
		
*/

import java.util.*;

public class HashTest02 {

	public HashTest02() {
		HashSet ha = new HashSet();
		
		int count = 1;
		
		while(true) {
		
		int no = (int) (Math.random() * 10 + 1);
		
		ha.add(no);
		
	
		
		if(ha.size() == 6) {
			break;
		}
		count++;

		}
		
		System.out.println("횟수 : " + count);
		
		Iterator itr = ha.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
	new HashTest02();
	}

}
