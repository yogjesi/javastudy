package ch9;

public class Grandeur extends Car{
	String car = "Grandeur";

	@Override
	public void start() {
		System.out.println(car + " 시동을 켭니다.");
		
	}

	@Override
	public void drive() {
		System.out.println(car + " 달립니다.");
		
	}

	@Override
	public void stop() {
		System.out.println(car + " 멈춥니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println(car + " 시동을 끕니다.");
		
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}

}
