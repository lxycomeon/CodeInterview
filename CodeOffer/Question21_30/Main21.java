package Question21_30;

//调整数组顺序，使得奇数位于偶数前面
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
			if(!func(nums[start]) && func(nums[end]) && start < end) {	//前面是奇数，后面是偶数的时候才互换
				int tmp = nums[start];
				nums[start] = nums[end];
				nums[end] = tmp;
			}
		}
		
	}
	//控制将哪些数移动
	private static boolean func(int i) {
		if(i % 2 ==1)
			return true;
		else
			return false;
	}

}
