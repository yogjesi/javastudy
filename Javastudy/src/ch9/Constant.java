package ch9;

public class Constant {
	int num = 10;
	final int NUM = 100; //상수 선언 (상수를 선언할 땐 일반 변수와 구별하기 ㅜ이해 대문자로 쓰는 경우가 많음
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		// cons.NUM = 100;  // 상수에 값을 대입하여 오류 발생
		
		System.out.println(cons.num);
		// System.out.println(cons.NUM);
		
	}

}
