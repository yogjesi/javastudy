package ch6.Q4_wooyoung;
//아침 출근길, 김씨 4,000원 별다방 아메리카노
//이씨, 4,500원 콩다방 라떼
public class Person {
	String name; //김씨
	int money; //가지고 있는 돈 
	
	//1. 생성자
	Person (String name, int money){
		this.name = name;
		this.money = money;
	}
	//2. 구매시 돈 감소 메서드
	public void buyStartbucks(Starbucks coffee, int money){
		this.money -= money;
		System.out.println(name + money);// ㅇㅇ의 현재 잔액은 얼마이다.
	}
	
	public void buyCoffeeBeans(CoffeeBean coffee, int money){
		this.money -= money;
		System.out.println(name + money);// ㅇㅇ의 현재 잔액은 얼마이다.
	}


}
