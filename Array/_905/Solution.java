package _905;

/*
 * Given an array A of non-negative integers, 
 * return an array consisting of all the even elements of A, 
 * followed by all the odd elements of A.
   You may return any answer array that satisfies this condition.
 */


public class Solution {

	public static void main(String[] args) {
		
		int[] nums = {3,1,2,4};
		sortArrayByParity(nums);
		
	
		
		
	}
	
	 public static int[] sortArrayByParity(int[] A) {
		 int[] nums = new int [A.length];
		 int preIndex = 0;
		 int lastIndex = A.length-1;
		 for(int i=0;i<A.length;i++) {
			 if (A[i]%2==0) {
				 nums[preIndex++]=A[i];
			}else {
				nums[lastIndex--]=A[i];
			}
		 }
		 
		 return nums;
	 }
	


}

