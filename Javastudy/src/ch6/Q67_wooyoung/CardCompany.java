package ch6.Q67_wooyoung;

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			CardCompany instance = new CardCompany();
		}
		return instance;
	}
	
	public Card createCard(String cardName) {
		Card card = new Card(cardName);
		return card;
	}
}
