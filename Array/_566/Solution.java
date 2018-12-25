package _566;


/*
 *	In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.
	You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
	The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
	If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
	
	Example 1:
	Input: 
	nums = 
	[[1,2],
	 [3,4]]
	r = 1, c = 4
	Output: 
	[[1,2,3,4]]
	Explanation:
	The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
	遇到的问题：没有仔细读题，题目最后一行表示，如果该变形操作输入的参数是不合法的，则输出原输入的二维数组。
*/

public class Solution {

	public static void main(String[] args) {
		int[][] nums= { 
							{1,2,3},
							{2,2,3},
					
						};
		int r = 1;
		int c = 6;
		int result[][] = matrixReshape(nums,r,c);
		System.out.println(result.toString());
		
	}
	
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		if((nums[0].length * nums.length) == (r*c)) {
			int[][] result = new int[r][c];
			int tmp = 0;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					result[i][j] = nums[tmp/nums[0].length][tmp%nums[0].length];
					tmp++;
					
				}
			}
			
			return result;
		}else {
			return nums;
		}
        
    }
}

