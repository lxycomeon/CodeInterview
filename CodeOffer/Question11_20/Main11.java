package Question11_20;

//问题11：旋转数组的最小数字
public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,3,4,0,0,0,1};
		System.out.println(findMinNum(nums));

	}
	
	public static Integer findMinNum(int[] nums) {
		if(nums == null || nums.length<=0) 
			return null;
		
		if(nums.length==1)
			return nums[0];
		int startIndex = 0;
		int endIndex = nums.length-1;
		if(nums[endIndex ]> nums[startIndex])//证明旋转数组只旋转了0个数字，是排好序的。直接返回第一个数字
			return nums[startIndex];
		while(endIndex-startIndex > 1) {
			int middle = (endIndex - startIndex)/2 + startIndex;
			if(nums[middle]>=nums[startIndex])
				startIndex = middle;
			else if(nums[middle]<=nums[endIndex])
				endIndex = middle;
			if(nums[middle]== nums[startIndex] && nums[middle]== nums[endIndex]) {
				//顺序查找最小数字,
				int minNum = nums[0];
				for(int i =1;i<nums.length;i++) {
					if(nums[i]<minNum)
						minNum = nums[i];
				}
				return minNum;
			}
		}
		return nums[endIndex];
	}

}
