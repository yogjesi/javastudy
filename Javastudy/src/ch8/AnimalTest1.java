package ch8;

public class AnimalTest1 {
	public static void main(String[ ] args) {
		
		
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
	}
	// �� �޼���� � �ν��Ͻ��� �Ű������� �Ѿ�͵� ��� Animal ������ ��ȯ�Ѵ�.
	// �� , Animal ani = new Human(); �̷������� �ٲ��.
	// �� ����޼��� ������ ���� �Ű����ҷ� �Ѿ�� ���� �ν��Ͻ��� �޼����̱⿡ ��¹��� �޶���, �̰� ������!
	// �������� ������ ���� Ŭ�������� ���� �κ��� �޼��� �����ϰ�, ���� Ŭ�������� �߰� ��� �����̸� �ڵ� �� �ٰ� ��
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
