package ch7;

public class Q3_wooyoung {

	public static void main(String[] args) {
		// 배열 길이 5인 정수형 배열 선언, 1~10중 짝수만 배열에 저장 후 합 출력하기
		int[] nums = new int[] {2,4,6,8,10};
		int total = 0;
		
		for(int i=0; i<nums.length; i++) {
			total += nums[i];
		}
			
		System.out.println(total);
		
	}

}
