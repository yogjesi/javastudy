package ch4;

public class Q2_jiwon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		for(i = 1; i<=9; i++) {
			if(i%2 == 0) {
				System.out.println("구구단 " + i + "단");
				int j = 1;
				
				for(j=1; j<=9; j++) {
					System.out.println(j*i);
				}
			}
		}

	}

}
