package ch4;

public class Q1_ifelse_wooyoung {
	public static void main(String[] args) {
		//if-else if 문으로 사칙연산 수행 프로그램 만들기
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
