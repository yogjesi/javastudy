package ch4;

public class Q1_ifelse_wooyoung {
	public static void main(String[] args) {
		//if-else if ������ ��Ģ���� ���� ���α׷� �����
		int num1 = 10;
		int num2 = 2;
		char operator = '-';
		
		if (operator == '+'){
			System.out.println(num1+num2);
		}
		else if(operator == '-') {
			System.out.println(num1-num2);
		}
		else if(operator == '*') {
			System.out.println(num1*num2);
		}
		else if(operator == '/') {
			System.out.println(num1/num2);
		}
	}
}
