package ch7.Q5_wooyoung;

import java.util.ArrayList;

import ch7.Q4_wooyoung.Dog;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("A", "종류1"));
		dogs.add(new Dog("B", "종류2"));
		dogs.add(new Dog("C", "종류3"));
		dogs.add(new Dog("D", "종류4"));
		dogs.add(new Dog("E", "종류5"));
		
		for(int i =0; i<dogs.size(); i++) {
			System.out.println(dogs.get(i).showDogInfo());
		}
		
		// 향상된 for문
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}	
	}

}
