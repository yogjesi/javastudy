package ch4;

public class Q4_wooyoung {
	public static void main(String[] args) {
		//반복문 사용해 트리 출력
		int line = 4;   //이 부분의 숫자를 바꾸면 트리의 크기가 달라진다
		String tree = "*";
		for (int i = 0; i < line; i++) {
			for (int j = (line - 1) - i; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println(tree);
			tree += "**";
		}
	}

}
