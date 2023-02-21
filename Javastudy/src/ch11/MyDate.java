package ch11;

public class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.month = month;
		this.year = year;
		this.day = day;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate md = (MyDate)obj;
			if(this.day == md.day && this.month == md.month && this.year == md.year)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return day * 10 + month * 101 + year * 102;
	}
	public static void main(String[] args) {
		MyDate date1 = new MyDate(9,18,2004);
		MyDate date2 = new MyDate(9,18,2004);
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());

	}

}
