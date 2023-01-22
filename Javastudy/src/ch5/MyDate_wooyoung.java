package ch5;

import java.util.Calendar;

public class MyDate_wooyoung {
	// 1. 변수 생성
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	// 2. 생성자 만들기
	public MyDate_wooyoung(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);

//		setDay(day);
//		setMonth(month);
//		setYear(year);
		
	}
	
	// 3-1-1. setDay 메서드
	public void setDay(int day){
		switch(month) {
		// 1,3,5,7,8,10,12월
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day< 0 || day>31) {
				isValid = false;
			}else {
				this.day = day;
			}
			break;
		// 4,6,9,11월
		case 4: case 6: case 9: case 11:
			// 논리합(||) 두 항중 하나만 참이라도 결과 값은 참
			if(day< 0 || day>30) {
				isValid = false;
			}else {
				this.day = day;
			}
			break;
		// 2월 
		case 2:
			// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
			// 윤년인 경우, 논리곱(&&) 두 항 모두 참인 경우에
			if (( ( year % 4 ==0 &&  year % 100 !=0 ) || year % 400 ==0)){  //윤년인 경우
				if (day <0 || day >29) {
					isValid = false;
				} 
				else {
					this.day = day;
				}
			}
			// 윤년이 아닌 경우,
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
	// 3-1-2. getDay 메서드
	public int getDay() {
		return day;
	}
	
	// 3-2-1. setMonth 메서드
	public void setMonth(int month) {
		if(month<1 || month>12) {
			isValid = false;
		}else {
			this.month = month;
		}
	}
	
	// 3-2-2. getMonth 메서드
	public int getMonth() {
		return month;
	}
	// 3-3-1. setYear 메서드
	public void setYear(int year) {
		// Calendar 라이브러리에 해당되는 년도만 
		if (year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		}else {
			this.year = year;
		}
	}
	
	//3-3-2. getYear 메서드
	public int getYear() {
		return year;
	}
	// 3-4. isValid 메서드 만들어 날짜 유효한지 확인.
	public String isValid() {
		if (isValid) {
			return "유효한 날짜입니다.";
		}else {
			return "유효하지 않은 날짜입니다.";
		}
	}

}
