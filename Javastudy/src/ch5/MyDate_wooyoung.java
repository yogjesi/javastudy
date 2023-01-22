package ch5;

import java.util.Calendar;

public class MyDate_wooyoung {
	// 1. ���� ����
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	// 2. ������ �����
	public MyDate_wooyoung(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);

//		setDay(day);
//		setMonth(month);
//		setYear(year);
		
	}
	
	// 3-1-1. setDay �޼���
	public void setDay(int day){
		switch(month) {
		// 1,3,5,7,8,10,12��
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day< 0 || day>31) {
				isValid = false;
			}else {
				this.day = day;
			}
			break;
		// 4,6,9,11��
		case 4: case 6: case 9: case 11:
			// ����(||) �� ���� �ϳ��� ���̶� ��� ���� ��
			if(day< 0 || day>30) {
				isValid = false;
			}else {
				this.day = day;
			}
			break;
		// 2�� 
		case 2:
			// ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
			// ������ ���, ����(&&) �� �� ��� ���� ��쿡
			if (( ( year % 4 ==0 &&  year % 100 !=0 ) || year % 400 ==0)){  //������ ���
				if (day <0 || day >29) {
					isValid = false;
				} 
				else {
					this.day = day;
				}
			}
			// ������ �ƴ� ���,
			else {
				if (day <0 || day >28) {
					isValid = false;
				} 
				else {
					this.day = day;
				}
			}
			break;
		default:
			isValid = false;
		}
	}
	// 3-1-2. getDay �޼���
	public int getDay() {
		return day;
	}
	
	// 3-2-1. setMonth �޼���
	public void setMonth(int month) {
		if(month<1 || month>12) {
			isValid = false;
		}else {
			this.month = month;
		}
	}
	
	// 3-2-2. getMonth �޼���
	public int getMonth() {
		return month;
	}
	// 3-3-1. setYear �޼���
	public void setYear(int year) {
		// Calendar ���̺귯���� �ش�Ǵ� �⵵�� 
		if (year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		}else {
			this.year = year;
		}
	}
	
	//3-3-2. getYear �޼���
	public int getYear() {
		return year;
	}
	// 3-4. isValid �޼��� ����� ��¥ ��ȿ���� Ȯ��.
	public String isValid() {
		if (isValid) {
			return "��ȿ�� ��¥�Դϴ�.";
		}else {
			return "��ȿ���� ���� ��¥�Դϴ�.";
		}
	}

}
