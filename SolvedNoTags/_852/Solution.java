package _852;

import java.util.ArrayList;

/*
	Let's call an array A a mountain if the following properties hold:
	
	A.length >= 3
	There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
	Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
	
	Example 1:
	
	Input: [0,1,0]
	Output: 1
	Example 2:
	
	Input: [0,2,1,0]
	Output: 1
	
	找数组中的最大值，返回下标。。简单些
	大神的代码：使用二分查找，减少时间复杂度
	class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while(right >= left){
            int mid = left + (right - left)/2;
            if (A[mid - 1] < A[mid] && A[mid] > A[mid + 1]){
                return mid;
            } else if (mid == 0){
                return 0;
            } else if (mid == A.length - 1){
                return A.length - 1;
            } else if (A[mid - 1] < A[mid] && A[mid] < A[mid + 1]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
*/

public class Solution {

	public static void main(String[] args) {
		int[] A = {0,1,0};
		System.out.println(peakIndexInMountainArray(A));
		
	}
	public static int peakIndexInMountainArray(int[] A) {
		ArrayList<Integer> aa = new ArrayList<Integer>();
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] > max) {
				max = A[i];
			}
			aa.add(A[i]);
		}
		
		return aa.indexOf(max);
  
    }
}

