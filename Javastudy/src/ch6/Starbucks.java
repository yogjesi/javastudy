package ch6;

public class Starbucks {
	String coffee;
	int money;
	
	public Starbucks(String coffee) {
		this.coffee = coffee;
	}
	
	public void take(int money) {
		this.money += money;    // 아메리카노는 4000원
	}
	
	public void showInfo() {
		System.out.println("스타벅스의 수입은 " + money + "원 입니다.");
	}

}
