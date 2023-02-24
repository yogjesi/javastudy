package ch9;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	public abstract void wiper();
	
//	public void startCar() {
//		System.out.println("시동을 켭니다.");
//	}
//	
//	public void turnOff() {
//		System.out.println("시동을 끕니다.");
//	}
	public void washCar() {
		System.out.println("세차를 합니다");
	}
	
	final public void run() {
//		startCar();
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}

}
