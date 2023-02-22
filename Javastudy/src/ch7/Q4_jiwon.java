package ch7;

public class Q4_jiwon {

	public static void main(String[] args) {
		// 이 클래스는 DogTest 클래스를 대신함.
		Dog[] dogs = new Dog[5];
		dogs[0] = new Dog("milo", "avisinian");
		dogs[1] = new Dog("lulu", "scotish short fold");
		dogs[2] = new Dog("DD", "Norway");
		dogs[3] = new Dog("dodo", "Korean short-hair");
		dogs[4] = new Dog("nana", "spinks");
		// 어라 근데 개인데 고양이로 했네... 
		
		for(int i = 0; i < 5; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		System.out.println("========");
		
//		for(char name, char type : dogs) {
//			System.out.println(name);
//		}

	}

}
