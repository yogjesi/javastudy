package ch5;

public class MyDateTest_wooyoung {
	public static void main(String[] args) {
		// date1 인스턴스 생성, 날짜/월/연도 입력
		MyDate_wooyoung date1 = new MyDate_wooyoung(30, 2, 2000);
		// 유효하지 않은 날짜입니다.
		System.out.println(date1.isValid());
		MyDate_wooyoung date2 = new MyDate_wooyoung(2, 10, 2006);
		// 유효한 날짜입니다.
		System.out.println(date2.isValid());
	}

}
