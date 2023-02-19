package ch6.Q67_wooyoung;

public class Card {
	String cardName;
	static int serialNum = 100000;
	int cardNumber;
		
	Card(String cardName){
		this.cardName = cardName;
		serialNum++;
		this.cardNumber = serialNum;
	}
	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public void cardInfo(){
		System.out.println(cardName + "의 카드 번호는 " + cardNumber +" 입니다.");
	}
}
