package ch4;

public class Q1_switchcase_wooyoung {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		switch(operator) {
			case '+':
				System.out.println(num1+num2);
				break;
			case '-' :
				System.out.println(num1-num2);
				break;
			case '*' :
				System.out.println(num1+num2);
			case '/' :
				System.out.println(num1+num2);
		}
	}
}
