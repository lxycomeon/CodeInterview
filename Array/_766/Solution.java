package _766;


/*
 *	A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
	Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
	Example 1:
	Input:
	matrix = [
	  [1,2,3,4],
	  [5,1,2,3],
	  [9,5,1,2]
	]
	Output: True
	Explanation:
	In the above grid, the diagonals are:
	"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
	In each diagonal all elements are the same, so the answer is True.
	
	解题思路：从矩阵的第一行以及第一列开始，对每一个斜对角线上的元素进行检测是否等于上一个元素，如果不等于就直接返回false
*/

public class Solution {

	public static void main(String[] args) {
		int[][] matrix= { 
							{1,2},
							{2,2},
						};
		System.out.println(isToeplitzMatrix(matrix));
		
	}
	
	 public static boolean isToeplitzMatrix(int[][] matrix) {
		 
		 for (int i = matrix.length,j = 0; i >= 0; i--) {
			 for (int m = i,n=j; m < matrix.length-1 && n< matrix[m].length-1; m += 1,n+=1) {
				if(matrix[m][n] != matrix[m+1][n+1])
					return false;
			}
		 }
		 for (int i = 0,j = matrix[0].length; j > 0; j--) {
			 for (int m = i,n=j; m < matrix.length-1 && n< matrix[m].length-1; m += 1,n+=1) {
				if(matrix[m][n] != matrix[m+1][n+1])
					return false;
			}
		 }
		 
		 return true;
	 }
}

