package ch7;

public class Q2_wooyoung {

	public static void main(String[] args) {
		// 206������ ���ĺ� ��� ���� �ҹ��ڿ��� �빮�ڷ� ��ȯ�� ����Ͻÿ�.
		char[] alphabets = new char[26];
		char ch = 'a';
		
		// �迭�� �� �ο�
		for(int i=0 ; i<alphabets.length; i++, ch++){
			alphabets[i] = ch;
		}
		System.out.println(alphabets);
		
		// �迭 �빮�ڷ� ��ȯ, ���
		for(int i=0; i<alphabets.length; i++){
			alphabets[i] = (char)((int)alphabets[i] - 32);
			System.out.println(alphabets[i]);
		}		
	}

}
