package _654;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*654. Maximum Binary Tree
 *	Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

	The root is the maximum number in the array.
	The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
	The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
	Construct the maximum tree by the given array and output the root node of this tree.
	
	Example 1:
	Input: [3,2,1,6,0,5]
	Output: return the tree root node representing the following tree:
	
	      6
	    /   \
	   3     5
	    \    / 
	     2  0   
	       \
	        1
	        
	        
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
*/

public class Solution {

	public static void main(String[] args) {
		int[] nums = { 3,2,1,6,0,5 };
		System.out.println(constructMaximumBinaryTree(nums ));
	}

	public static TreeNode constructMaximumBinaryTree(int[] nums) {
		int max = 0;
        int maxIdx = 0;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                maxIdx = i;
            }
        }
        
        int[] leftNums = new int[maxIdx];
        int[] rightNums = new int[nums.length-1 - maxIdx];
        for(int i = 0; i < nums.length; i++){
            if(i < maxIdx){
                leftNums[i] = nums[i];
            }
            else if(i > maxIdx){
                rightNums[i-(maxIdx+1)] = nums[i];
            }
        }
        
        TreeNode node = new TreeNode(max);
        if(leftNums.length > 0)
            node.left = constructMaximumBinaryTree(leftNums);
        if(rightNums.length > 0)
            node.right = constructMaximumBinaryTree(rightNums);
        return node;        
	}
	
}

