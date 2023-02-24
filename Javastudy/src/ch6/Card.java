package ch6;

public class Card {
	private static int serialNum = 0;
	String customerName;
	int customerID;
	
	public Card() {
		serialNum++;
		customerID = serialNum;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void  setCustomerName(String name) {
		customerName = name;
	}
	
	// serialNum의 get 메서드
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Card.serialNum = serialNum;
	}
}
