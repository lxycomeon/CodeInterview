package _1;

import java.util.HashMap;

/*1. Two Sum
 * 
 * 
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	Example:
	Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	
	我的解：时间复杂度为O(N2)，大神的解
	
*/

public class Solution {

	public static void main(String[] args) {
		int[] nums = {1,6,9,7,0};
		
		int[] result = twoSum(nums, 9);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	public static int[] twoSum(int[] nums, int target) {
		int[] result;
		result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if(nums[i]+nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;    
    }
	
	class Solution2 {		//大神的解
	    public int[] twoSum(int[] nums, int target) throws Exception {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        int[] res = new int[2];
	        
	        
	        for (int i = 0; i < nums.length; i++) {
	            int n = target - nums[i];
	            
	            if (map.get(n) != null) {
	                res[0] = map.get(n);
	                res[1] = i;  
	                break;
	            }
	            
	            map.put(nums[i], i);
	        }
	        
	        
	        return res;
	    }
	}
	
}

