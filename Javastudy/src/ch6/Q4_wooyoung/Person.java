package ch6.Q4_wooyoung;
//��ħ ��ٱ�, �达 4,000�� ���ٹ� �Ƹ޸�ī��
//�̾�, 4,500�� ��ٹ� ��
public class Person {
	String name; //�达
	int money; //������ �ִ� �� 
	
	//1. ������
	Person (String name, int money){
		this.name = name;
		this.money = money;
	}
	//2. ���Ž� �� ���� �޼���
	public void buyStartbucks(Starbucks coffee, int money){
		this.money -= money;
		System.out.println(name + money);// ������ ���� �ܾ��� ���̴�.
	}
	
	public void buyCoffeeBeans(CoffeeBean coffee, int money){
		this.money -= money;
		System.out.println(name + money);// ������ ���� �ܾ��� ���̴�.
	}


}
