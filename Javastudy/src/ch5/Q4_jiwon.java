package ch5;

public class Q4_jiwon {
	// 해당 클래스는 문제 속 'MyDateTest' 클래스를 대신함.
	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());
	}

}
