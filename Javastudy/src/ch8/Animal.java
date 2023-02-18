package ch8;

public class Animal {
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람은 두발로 걷는다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뛴다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}
