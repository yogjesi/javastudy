package ch7.Q4_wooyoung;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		dogs[0] = new Dog("A", "����1");
		dogs[1] = new Dog("B", "����2");
		dogs[2] = new Dog("C", "����3");
		dogs[3] = new Dog("D", "����4");
		dogs[4] = new Dog("E", "����5");	
		
		for(int i =0; i<dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		// ���� for��
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}	
	}
}
