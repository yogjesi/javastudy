package ch9;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	// 재정의되면 안 되므로 final로 선언
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();			
		}
		turn();
	}

}
