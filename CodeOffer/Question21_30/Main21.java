package Question21_30;

//��������˳��ʹ������λ��ż��ǰ��
public class Main21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {};
		changePosition(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}
	
	public static void changePosition(int[] nums) {
		if(nums == null || nums.length <2)
			return ;

		int start = 0;
		int end = nums.length-1;
		
		while(start < end) {
			while(func(nums[start]) && start < nums.length) {
				start++;
			}
			while(!func(nums[end]) && end > 0) {
				end--;
			}
			if(!func(nums[start]) && func(nums[end]) && start < end) {	//ǰ����������������ż����ʱ��Ż���
				int tmp = nums[start];
				nums[start] = nums[end];
				nums[end] = tmp;
			}
		}
		
	}
	//���ƽ���Щ���ƶ�
	private static boolean func(int i) {
		if(i % 2 ==1)
			return true;
		else
			return false;
	}

}
