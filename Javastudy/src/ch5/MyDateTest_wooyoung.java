package ch5;

public class MyDateTest_wooyoung {
	public static void main(String[] args) {
		// date1 �ν��Ͻ� ����, ��¥/��/���� �Է�
		MyDate_wooyoung date1 = new MyDate_wooyoung(30, 2, 2000);
		// ��ȿ���� ���� ��¥�Դϴ�.
		System.out.println(date1.isValid());
		MyDate_wooyoung date2 = new MyDate_wooyoung(2, 10, 2006);
		// ��ȿ�� ��¥�Դϴ�.
		System.out.println(date2.isValid());
	}

}
