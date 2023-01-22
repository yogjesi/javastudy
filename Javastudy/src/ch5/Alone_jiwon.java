package ch5;

public class Alone_jiwon {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int dim(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int devide(int n1, int n2) {
		if (n2 == 0) {
			int result = -1;
			return result;
		}
		else {
			int result = n1/n2;
			return result;
		}
	}
	
	public static int multiple(int n1, int n2) {
		int result = n1*n2;
		return result;
	}
}