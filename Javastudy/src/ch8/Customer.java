package ch8;

public class Customer {
	// 1) �������
	protected int customerID; //�� ���̵�
	protected String customerName; //�� �̸�
	protected String customerGrade; // �� ���
	int bonusPoint; // ���ʽ� ����Ʈ
	double bonusRatio; //���� ����
	
	// 2) ������
	public Customer(int customerID, String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER"; // �⺻ ���
		bonusRatio = 0.01;
		System.out.println("Customer ������ ȣ��");
	}
	
	// 3) method
	// protected ������ ������ ������ �ܺο��� ����� �� �ְ� get(), set() method �߰�
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
		bonusPoint += price * bonusRatio; // ���ʽ� ����Ʈ ���
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� �����" + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + 
	bonusPoint + "�Դϴ�";
	}
}
