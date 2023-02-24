package ch10;

public class CompleteCalc extends Calculator{

	@Override
	public void description() { // 만약 디폴트 메서드를 재정의하고 싶다면 이런식으로 오버라이딩 가능!
		// TODO Auto-generated method stub
		super.description();
	}

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1/num2;
		else
			return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

}
