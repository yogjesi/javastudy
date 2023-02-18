package ch8;

public class Customer {
	// 1) 멤버변수
	protected int customerID; //고객 아이디
	protected String customerName; //고객 이름
	protected String customerGrade; // 고객 등급
	int bonusPoint; // 보너스 포인트
	double bonusRatio; //적립 비율
	
	// 2) 생성자
	public Customer(int customerID, String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER"; // 기본 등급
		bonusRatio = 0.01;
		System.out.println("Customer 생성자 호출");
	}
	
	// 3) method
	// protected 예약어로 선언한 변수를 외부에서 사용할 수 있게 get(), set() method 추가
	public int getCustomerId() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 계산
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + 
	bonusPoint + "입니다";
	}
}
