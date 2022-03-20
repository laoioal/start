package day14.ex;

/*
  문제 3]
  	학생 한명의 성적을 관리할 클래스 Student를 작성하세요
  	기억할 내용은
  		반, 이름, 국어, 영어, 수학, 총점
  	을 기억하도록 하고
  	필요한 기능(함수)는 필요한 만큼 추가해주세요.
  	단, 학생의 반과 이름이 같으면 같은 학생으로 처리되도록 하세요
  	학생 변수를 출력하면 모든 내용이 출력되도록 함수를 오버라이드 하세요
 */

public class Ex03 {
	
	public Ex03() {
		Ex03Student stu1 = new Ex03Student("이용현", 1, 60, 70, 80);
		Ex03Student stu2 = new Ex03Student("이용현", 2, 90, 60, 80);
		
		String result = (stu1.equals(stu2)) ? "같은" : "다른";
		
		System.out.println("stu1 학생의 정보 : \n" + stu1);
		System.out.println("stu2 학생의 정보 : \n" + stu2);
		System.out.println("stu1과 stu2는 " + result + "학생 입니다.");
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
