package ch8;

public class Animal {
	public void move() {
		System.out.println("������ �����δ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �ȴ´�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ڴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �Ѵ�.");
	}
}
