package ch8;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer a = new Customer(10010, "이우영");
		Customer b = new Customer(10011, "이원웅");
		Customer c = new GoldCustomer(10012, "이선민");
		Customer d = new GoldCustomer(10013, "이고원");
		Customer e = new VIPCustomer(10014, "브라운조던", 1);
		
		customerList.add(a);
		customerList.add(b);
		customerList.add(c);
		customerList.add(d);
		customerList.add(e);
		
		System.out.println("========고객 정보 출력 =======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		int price = 100000;
				
		System.out.println("========고객 정보 출력 =======");
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이" + 
			cost + "원 지불하셨습니다.");
			
			System.out.println(customer.getCustomerName() + "님의"
					+ "현재 보너스 포인트는" + 
			customer.bonusPoint + "점입니다.");
		}
		// 호출되는 메서드는 인스턴스에 따라 결정됨(가상 메서드)
		// 변수가 사용하는 메모리와 메서드가 사용하는 메모리는 다름
		// 클래스 생성하여 인스턴스 만들어지면, 멤버 변수는 힙 메모리에 위치. 
	}

}
