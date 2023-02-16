package ch6;

public class Q5_jiwon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 관련 클래스 : Starbucks, Congcafe, Customer
		// 손님 선언하기
		Customer customerLee = new Customer("Lee", 0); // 콩카페 이용자
		Customer customerKim = new Customer("Kim", 0); // 스타벅스 이용자
		
		Starbucks americano = new Starbucks("아메리카노");
		customerKim.takeStarbucks(americano);
		customerKim.shoInfo();
		americano.showInfo();
		
		Congcafe latte = new Congcafe("라떼");
		customerLee.takeCongcafe(latte);
		customerLee.shoInfo();
		latte.showInfo();

	}

}
