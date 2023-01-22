package ch4;

public class Q2_wooyoung {

	public static void main(String[] args) {
		// continue 사용해 짝수단만 출력
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				if(i%2==0) {
					System.out.printf("%d x %d = %d %n", i,j,i*j);					
				}else
					continue;
			}
		}
	}

}
