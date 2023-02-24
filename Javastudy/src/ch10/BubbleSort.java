package ch10;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("BubbleSort입니다.");
	}
	
	
}
