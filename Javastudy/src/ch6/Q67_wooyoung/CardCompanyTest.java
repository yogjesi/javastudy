package ch6.Q67_wooyoung;

public class CardCompanyTest {
	public static void main(String[] args) {
		// ī�� ȸ�� ����
		CardCompany company = CardCompany.getInstance();
		
		// ī�� ����
		Card myCard = company.createCard("BCī��");   //�޼��忡�� Car ����
		Card yourCard = company.createCard("����ī��");
		
		myCard.cardInfo();
		yourCard.cardInfo();
		System.out.println(myCard.getCardNumber());    //10001  ���
		System.out.println(yourCard.getCardNumber());  //10002  ���
		
		
	}
}
