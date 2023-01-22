package ch4;

public class Q3_wooyoung {

	public static void main(String[] args) {
		//단보다 곱하는 수가 작거나 같은 경우까지만 출력 break 사용
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				if(i>=j) {
					System.out.printf("%d x %d = %d %n", i,j,i*j);					
				}else
					break;
			}
		}
	}
}
