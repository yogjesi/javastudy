package ch8;

public class VIPCustomer extends Customer {
	private int agentID; //���� ���̵�
	double saleRatio; //������
	
	// ������
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIP Customer ������ ȣ��");
	}
	
	//method
	public int getAgentID() {
		return agentID;
	}
	public String showCustomerInfo() {
		return "���� �����Դϴ�";
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "���� ���̵��" + "agentID" + "�Դϴ�";
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // ���ʽ� ����Ʈ ����
		return price - (int)(price * saleRatio); // ���ٰ� ���α���
	}
}
