package ch6;

public class Congcafe {
	String coffee;
	int money;
	
	public Congcafe(String coffee) {
		this.coffee = coffee;
	}
	
	public void take(int money) {
		this.money += money;   // 라떼는 4500원
	}
	
	public void showInfo() {
		System.out.println("콩카페의 수입은 " + money + "원 입니다.");
	}

}
