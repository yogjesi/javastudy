package ch6;

public class Customer {
	public String customerName;
	public int money;
	
	public Customer(String customerName, int money) {
		this.customerName = customerName;
		this.money = money;
	}
	
	public void takeStarbucks(Starbucks starbucks) {
		starbucks.take(4000);
		this.money += 4000;
	}
	
	public void takeCongcafe(Congcafe congcafe) {
		congcafe.take(4500);
		this.money += 4500;
	}
	
	public void shoInfo() {
		System.out.println(customerName + "님이 사용한 금액은 " + money + "입니다.");
	}

}
