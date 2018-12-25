package _238;

/*238. Product of Array Except Self
 * 
 * Given an array nums of n integers where n > 1, 
 *  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *  即是输出，该数组中除了nums[i]的其他的所有元素的乘积
 *  
 *  大神代码的思路：遍历两遍，第一遍计算该数所有左边的数的乘积，第二遍计算该数右边所有数的乘积，第一次从左往右循环，第二次从右往左循环
 *  
 *  
*/

public class Solution {
	public static void main(String[] args) {
		int[] nums = new int[] {0,4,0};
		nums = productExceptSelf(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	
	}

	public static int[] productExceptSelf(int[] nums)  {
		int Products = 1;
		int CountZreo = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				Products *= nums[i];
			}
			else {
				CountZreo++;
			}
			
		}
		int[] result = new int[nums.length];
		for (int i = 0; i < result.length; i++) {
			if(CountZreo == 0) {
				result[i] = Products/nums[i];
			}else if (CountZreo ==1 ) {
				if(nums[i] ==0)
					result[i] = Products;
				else
					result[i] = 0;
			}else {
				result[i] = 0;
			}
			
		}
		
		
		return result;
	}
}
/* 大神的解法
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] arr = new int[nums.length];
        arr[0] = 1;
        for(int i =1;i<nums.length;i++) {
            arr[i] = nums[i-1]*arr[i-1];
        }
        
      
        
        int right =1;
        for(int i =nums.length-1;i>=0;i--) {
            arr[i]*=right;
            right = right * nums[i];
        }
        
        
        
        return arr;
    }
}
*/
