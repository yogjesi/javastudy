package ch5;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	// Day get
	public int getDay() {
		return day;
	}
	// Day set
	public void setDay(int day) {
		this.day = day;
	}
//	public void setDay(int day) {
//		if (month == 2) {
//			if(day < 1 || day > 28) {
//				System.out.println("오류입니다");
//			} else {
//				this.day = day;
//			}
//		}
//		switch (month) {
//		case 1: case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
//			if (day < 1 | day > 31) {
//				System.out.println("오류입니다.");
//			} else {
//				this.day = day;
//			}
//			break;
//		case 4 : case 6 : case 9 : case 11 :
//			if (day < 1 | day > 30) {
//				System.out.println("오류입니다.");
//			} else {
//				this.day = day;
//			}
//			break;
//		}
//	}
	
	
	// Month get
	public int getMonth() {
		return month;
	}
	// Month set
	public void setMonth(int onth) {
		this.month = month;
	}
//	public void setMonth(int month) {
//		if (month < 1 | month > 12) {
//			System.out.println("오류입니다.");
//		} else {
//			this.month = month;
//		}
//	}
	
	
	// Year get
	public int getYear() {
		return year;
	}
	// Year set
	public void setYear(int year) {
		this.year = year;
	}
	
	
	// 생성자
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String isValid() {
		switch (this.month) {
		case 1: case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			if (day < 1 || day > 31) {
				return "유효하지 않은 날짜입니다.";
			}
			break;
		case 4 : case 6 : case 9 : case 11 :
			if (day < 1 || day > 30) {
				return "유효하지 않은 날짜입니다.";
			}
			break;
		case 2 :
			if(this.day < 1 || this.day >28) {
				return "유효하지 않은 날짜입니다.";
			}
			break;
		}
		return "유효한 날짜입니다.";
	}
}
