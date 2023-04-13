package ch7;

public class Q3_jiwon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = new int[5];
		for(int i = 1; i <= 10; i++) {
			if(i%2==0) {
				int j = i/2-1;
				myArr[j] = i;
			}
		}
		for(int a = 0; a < myArr.length; a++) {
			System.out.println(myArr[a]);
		}
	}
 
}
