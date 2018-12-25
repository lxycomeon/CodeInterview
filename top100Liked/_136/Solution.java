package _136;

import java.util.HashSet;

//NoFirstSolved
public class Solution {

	public static void main(String[] args) {
		int nums[] = {4,1,2,1,2};
		System.out.println(singleNumber2(nums));
	}
	public static int singleNumber(int[] nums) {
		HashSet< Integer> hashSet = new HashSet<>();
		new Integer(0).hashCode();
		for (int i = 0; i < nums.length; i++) {
			if (!hashSet.add(nums[i])) {
				hashSet.remove(nums[i]);
			}
		}
		return hashSet.iterator().next().intValue();
	}
	
	//利用异或两次为0
	public static int singleNumber2(int[] nums) {
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            res ^= nums[i];
        }
        
        return res;
    }
	

}
