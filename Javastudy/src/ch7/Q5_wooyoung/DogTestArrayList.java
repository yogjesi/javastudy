package ch7.Q5_wooyoung;

import java.util.ArrayList;

import ch7.Q4_wooyoung.Dog;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("A", "����1"));
		dogs.add(new Dog("B", "����2"));
		dogs.add(new Dog("C", "����3"));
		dogs.add(new Dog("D", "����4"));
		dogs.add(new Dog("E", "����5"));
		
		for(int i =0; i<dogs.size(); i++) {
			System.out.println(dogs.get(i).showDogInfo());
		}
		
		// ���� for��
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}	
	}

}
