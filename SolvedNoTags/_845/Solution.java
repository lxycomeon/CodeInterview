package _845;

import java.util.ArrayList;

/*
 *Let's call any (contiguous（连续的）) subarray B (of A) a mountain if the following properties hold:

	B.length >= 3
	There exists some 0 < i < B.length - 1 such that B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
	(Note that B could be any subarray of A, including the entire array A.)
	
	Given an array A of integers, return the length of the longest mountain. 
	
	Return 0 if there is no mountain.
*/

public class Solution {

	public static void main(String[] args) {
		
	}
	public static int longestMountain(int[] A) {
		ArrayList<Integer> aa = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			aa.add(A[i]);
		}
		
		return 0;
  
    }
}

