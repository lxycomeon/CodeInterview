package _442;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
	Find all the elements that appear twice in this array.
	Could you do it without extra space and in O(n) runtime?
	Example:
	Input:
	[4,3,2,7,8,2,3,1]
	
	Output:
	[2,3]
 *	
 *
 *	遇到的问题：虽然自己写的代码看上去，时间复杂度也是O(N)，但是用了一个Array库中的sort函数，这个函数的时间复杂度也要算进去的。
 *	，写题目时注意运用题目的给的条件，比如 1 ≤ a[i] ≤ n (n = size of array) ，只有将这个条件用上才能够完成Could you do it without extra space and in O(n) runtime?
 *	这个要求
*/

public class Solution {

	public static void main(String[] args) {
		int[] nums = { 4,3,2,7,8,2,3,1 };
		System.out.println(findDuplicates(nums));
	}
	public static List<Integer> findDuplicates(int[] nums) {
		Arrays.sort(nums);
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < nums.length -1; i++) {
			if(nums[i] == nums[i+1])
				result.add(nums[i]);
		}
		return result;
    }
	
	class Solution2 {
	    // solution2
	    public List<Integer> findDuplicates(int[] nums) {
	        List<Integer> ret = new ArrayList<>();
	        for (int i = 0; i < nums.length; i++) {
	            int index = Math.abs(nums[i]) - 1;
	            if (nums[index] < 0) {	//表示前面已经出现过一次了。
	                ret.add(index + 1);
	            }
	            nums[index] = -nums[index];
	        }
	        return ret;
	    }
	}
}

