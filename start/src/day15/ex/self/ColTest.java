package day15.ex.self;
import java.util.*;
//ArrarList 타입의 list 에 1 ~ 25 사이의 정수 10개를 랜덤하게 만들어서 채워주세요
public class ColTest {

	public ColTest() {
		ArrayList arr = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			arr.add((int)(Math.random()* 25 + 1));
			
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arr.get(i) + " | ");
		}
		System.out.println();
		Collections.sort(arr);
		for(int i = 0; i < 10; i++) {
			System.out.print(arr.get(i) + " | ");
		}
		System.out.println();
		
		Collections.sort(arr,new form());
		for(int i = 0; i < 10; i++) {
			System.out.print(arr.get(i) + " | ");
		}
	}

	public static void main(String[] args) {
	new ColTest();
	}

}

class form implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		int no1 = (int) o1;
		int no2 = (int) o2;
		result = no1 - no2;
		return -result;
		
	}
	
}
