package ch6.Q4_wooyoung;

public class Test {
	
	// �ν��Ͻ� ����
	
	public static void main(String[] args) {
	
		Person kim = new Person("kim", 20000);
		Person lee = new Person("lee", 40000);
		Starbucks coffee1 = new Starbucks();
		CoffeeBean coffee2 = new CoffeeBean();
		
		kim.buyStartbucks(coffee1, 4000);
		lee.buyCoffeeBeans(coffee2, 4500);
	}
	
}
