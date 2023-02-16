package ch6;

public class Q7_jiwon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1 = new Card();
		card1.setCustomerName("서지원");
		System.out.println(card1.customerID);
		
		Card card2 = new Card();
		card2.setCustomerName("서혜원");
		System.out.println(card2.customerID);
		
		System.out.println(card1.customerName + "님의 카드번호는 " + card1.customerID + "입니다.");
		System.out.println(card2.customerName + "님의 카드번호는 " + card2.customerID + "입니다.");
		
	}

}
