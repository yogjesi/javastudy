package ch7;

public class Q3_wooyoung {

	public static void main(String[] args) {
		// �迭 ���� 5�� ������ �迭 ����, 1~10�� ¦���� �迭�� ���� �� �� ����ϱ�
		int[] nums = new int[] {2,4,6,8,10};
		int total = 0;
		
		for(int i=0; i<nums.length; i++) {
			total += nums[i];
		}
			
		System.out.println(total);
		
	}

}
