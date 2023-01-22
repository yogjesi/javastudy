package ch4;

public class Q3_jiwon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 1;
		
		for(i=1; i <= 9; i++) {
			System.out.println("구구단 " + i + "단");
			for(j=1; j<=9; j++) {
				if(j > i) {
					break;
				}
				System.out.println(i*j);
			}
		}

	}

}
