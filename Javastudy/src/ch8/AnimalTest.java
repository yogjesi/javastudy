package ch8;
import java.util.ArrayList;

public class AnimalTest {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();

	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
}
