package ch8;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer a = new Customer(10010, "�̿쿵");
		Customer b = new Customer(10011, "�̿���");
		Customer c = new GoldCustomer(10012, "�̼���");
		Customer d = new GoldCustomer(10013, "�̰��");
		Customer e = new VIPCustomer(10014, "��������", 1);
		
		customerList.add(a);
		customerList.add(b);
		customerList.add(c);
		customerList.add(d);
		customerList.add(e);
		
		System.out.println("========�� ���� ��� =======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		int price = 100000;
				
		System.out.println("========�� ���� ��� =======");
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "����" + 
			cost + "�� �����ϼ̽��ϴ�.");
			
			System.out.println(customer.getCustomerName() + "����"
					+ "���� ���ʽ� ����Ʈ��" + 
			customer.bonusPoint + "���Դϴ�.");
		}
		// ȣ��Ǵ� �޼���� �ν��Ͻ��� ���� ������(���� �޼���)
		// ������ ����ϴ� �޸𸮿� �޼��尡 ����ϴ� �޸𸮴� �ٸ�
		// Ŭ���� �����Ͽ� �ν��Ͻ� ���������, ��� ������ �� �޸𸮿� ��ġ. 
	}

}
