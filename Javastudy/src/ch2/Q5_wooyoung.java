package ch2;

public class Q5_wooyoung {
	public static void main(String[] args) {
		//'글' 유니코드 값 찾아 char 형으로 선언한 변수에 저장하고 출력
		//유니코드를 저장할 때 ASCII 영역 외의 2-byte 문자열의 경우 uXXXX' 형태로 저장!!
		char n = '\uAE00';
		System.out.println(n);
	}

}
