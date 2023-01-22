package ch6.Q4_wooyoung;

public class Starbucks {
	int money; // 스벅이 벌어들이는 금액
	// 고객이 커피를 주문하는 경우
	public String orderCoffee(int money) {
		this.money += money;
		if (money == Menu.STARAMERICANO) {
			return "스타벅스 아메리카노";			
		}else if(money == Menu.STARLATTE) {
			return "스타벅스 라떼";
		}
		else {
			return null;
		}
	}
}
