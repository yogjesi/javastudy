package ch6.Q4_wooyoung;

public class CoffeeBean {
	int money; // 커피빈이 벌어들이는 금액
	// 고객이 커피를 주문하는 경우
	public String orderCoffee(int money) {
		this.money += money;
		if (money == Menu.BEANAMERICANO) {
			return "커피빈 아메리카노";			
		}else if(money == Menu.BEANLATTE) {
			return "커피빈 라떼";
		}
		else {
			return null;
		}
	}

}
