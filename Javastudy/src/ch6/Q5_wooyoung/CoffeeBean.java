package ch6.Q5_wooyoung;

public class CoffeeBean {
	int money; // Ŀ�Ǻ��� ������̴� �ݾ�
	// ���� Ŀ�Ǹ� �ֹ��ϴ� ���
	public String orderCoffee(int money) {
		this.money += money;
		if (money == Menu.BEANAMERICANO) {
			return "Ŀ�Ǻ� �Ƹ޸�ī��";			
		}else if(money == Menu.BEANLATTE) {
			return "Ŀ�Ǻ� ��";
		}
		else {
			return null;
		}
	}

}
