package ch6.Q4_wooyoung;

public class Starbucks {
	int money; // ������ ������̴� �ݾ�
	// ���� Ŀ�Ǹ� �ֹ��ϴ� ���
	public String orderCoffee(int money) {
		this.money += money;
		if (money == Menu.STARAMERICANO) {
			return "��Ÿ���� �Ƹ޸�ī��";			
		}else if(money == Menu.STARLATTE) {
			return "��Ÿ���� ��";
		}
		else {
			return null;
		}
	}
}
