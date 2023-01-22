package ch4;

public class Q5_wooyoung {

	public static void main(String[] args) {
		int line = 4;   //이 부분의 숫자를 바꾸면 트리의 크기가 달라진다
		String blank = "";
		for(int i1 = 0 ; i1 < line; i1++) {
			String star = "*";
			for(int j = 0 ; j < (line-1)-i1 ; j++) {
				star += "**";
			}
			System.out.println(blank + star);
			blank += " ";
		}
	}
}
