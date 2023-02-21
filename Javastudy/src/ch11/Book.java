package ch11;

public class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
	
	public class ToStringEx{
		public static void main(String[ ] args) {
			Book book1 = new Book(200, "개미");

			// 원래는 인스턴스 정보(클래스이름.주소값) 보여줌 ch11.Book@5ca881b5
			// 하지만 재정의 할 경우 원하는 문자열 표현 가능 개미,200
			System.out.println(book1);
			System.out.println(book1.toString()); 
		}
	}
	
}
