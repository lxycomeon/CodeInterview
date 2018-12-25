package _283;

import java.util.HashMap;

/*283. Move Zeroes
 * 
 * Given an array nums, write a function to move all 0's to the end of it while 
 * maintaining the relative order of the non-zero elements.
	Example:
	Input: [0,1,0,3,12]
	Output: [1,3,12,0,0]
	Note:
	You must do this in-place without making a copy of the array.
	Minimize the total number of operations.
	
	注意：
	自己的解法时间复杂度较高
	看大神Solution2的解法时间复杂度为O（n），第一次遍历的同时进行移位操作
*/

public class Solution {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	public static void moveZeroes(int[] nums) {
		
		for (int i = nums.length-1; i >=0; i--) {
			if(nums[i]==0) {
				for(int j = i;j<nums.length-1;j++)
					nums[j] = nums[j+1];
				nums[nums.length-1] = 0;
			}
		}
    }
	
	
	class Solution2 {
	    public void moveZeroes(int[] nums) {
	        if ((nums != null) && (nums.length > 0)) {
	            int count = 0;
	            for (int i=0; i < nums.length; i++) {
	                if (0 == nums[i]) { count++; }
	                else { nums[i-count] = nums[i]; }
	            }
	            for (int i=1; i <= count; i++) {
	                nums[nums.length-i] = 0;
	            }
	        }
	        return;
	    }
	}
	
}

