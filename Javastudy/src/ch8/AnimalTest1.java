package ch8;

public class AnimalTest1 {
	public static void main(String[ ] args) {
		
		
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
	}
	// 이 메서드는 어떤 인스턴스가 매개변수로 넘어와도 모두 Animal 형으로 변환한다.
	// 즉 , Animal ani = new Human(); 이런식으로 바뀐다.
	// 단 가상메서드 원리에 의해 매개변소로 넘어온 실제 인스턴스의 메서드이기에 출력문이 달라짐, 이게 다형성!
	// 다형성의 장점은 상위 클래스에서 공통 부분의 메서드 제공하고, 하위 클래스에서 추가 요소 덧붙이면 코드 양 줄고 편리
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
