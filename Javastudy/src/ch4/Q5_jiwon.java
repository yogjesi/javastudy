package ch4;

public class Q5_jiwon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;

		for(i=0; i<7; i++) {
			if(i < 4) {
				for(int j=0; j<3-i; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<(i*2)+1 ;j++) {
					System.out.print("*");
				}
				System.out.println("");
				
			}
			else {
				for(int j=0; j<i-3; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<(6-i)*2+1 ;j++) {
					System.out.print("*");
				}
				System.out.println("");
			}

			
		}

	}

}
