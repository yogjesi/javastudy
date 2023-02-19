package ch6.Q67_wooyoung;

public class CardCompanyTest {
	public static void main(String[] args) {
		// 카드 회사 생성
		CardCompany company = CardCompany.getInstance();
		
		// 카드 생성
		Card myCard = company.createCard("BC카드");   //메서드에서 Car 생성
		Card yourCard = company.createCard("신한카드");
		
		myCard.cardInfo();
		yourCard.cardInfo();
		System.out.println(myCard.getCardNumber());    //10001  출력
		System.out.println(yourCard.getCardNumber());  //10002  출력
		
		
	}
}
