package ch4;

public class Q4_wooyoung {
	public static void main(String[] args) {
		//�ݺ��� ����� Ʈ�� ���
		int line = 4;   //�� �κ��� ���ڸ� �ٲٸ� Ʈ���� ũ�Ⱑ �޶�����
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
