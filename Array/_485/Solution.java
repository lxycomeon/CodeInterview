package _485;

/*485. Max Consecutive Ones
 * 
 * Given a binary array, find the maximum number of consecutive 1s in this array.
	Example 1:
	Input: [1,1,0,1,1,1]
	Output: 3
	Explanation: The first two digits or the last three digits are consecutive 1s.
	The maximum number of consecutive 1s is 3.
*/

public class Solution {

	public static void main(String[] args) {
		int[] nums = new int[] {1,1,0,1,1,1,1,0,0,1,1,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int lastCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==1) {
				count +=1;
			}else {
				if(count >=lastCount)
					lastCount = count;
				count =0;
			}
		}
		if(count >=lastCount)
			lastCount = count;
		return lastCount;
	}
}

