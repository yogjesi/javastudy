package ch7;

public class Q2_wooyoung {

	public static void main(String[] args) {
		// 206페이지 알파벳 요소 값을 소문자에서 대문자로 변환해 출력하시오.
		char[] alphabets = new char[26];
		char ch = 'a';
		
		// 배열에 값 부여
		for(int i=0 ; i<alphabets.length; i++, ch++){
			alphabets[i] = ch;
		}
		System.out.println(alphabets);
		
		// 배열 대문자로 변환, 출력
		for(int i=0; i<alphabets.length; i++){
			alphabets[i] = (char)((int)alphabets[i] - 32);
			System.out.println(alphabets[i]);
		}		
	}

}
