package ch10;

public abstract class Calculator implements Calc{   // 추상 클래스

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

//	@Override
//	public int times(int num1, int num2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int divide(int num1, int num2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
