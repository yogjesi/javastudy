package ch8;

public class VIPCustomer extends Customer {
	private int agentID; //상담원 아이디
	double saleRatio; //할인율
	
	// 생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIP Customer 생성자 호출");
	}
	
	//method
	public int getAgentID() {
		return agentID;
	}
	public String showCustomerInfo() {
		return "상담원 아이입니다";
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "상담원 아이디는" + "agentID" + "입니다";
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 적립
		return price - (int)(price * saleRatio); // 에다가 할인까지
	}
}
