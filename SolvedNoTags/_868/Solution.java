package _868;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *	Given a matrix A, return the transpose of A.

	The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
	思考：求矩阵的逆
	问题：1.动态数组的定义int[][] result = new int[A[0].length][A.length];**
		2.太傻了，一开始使用了那么多复杂的东西进行运算。直接定义动态数组就可以求逆赋值
*/

public class Solution {

	public static void main(String[] args) {
		int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] result = transpose(A);
		System.out.println();
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] transpose(int[][] A) {
		int[][] result = new int[A[0].length][A.length];
//        List arraylist = new ArrayList(A[0].length);
//        for (int i = 0; i < A[0].length; i++) {
//			arraylist.add(new ArrayList<Integer>(A.length));
//		}
        for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
//				((ArrayList)arraylist.get(j)).add(A[i][j]);
				result[j][i]=A[i][j];
			}
		}
//        for (int i = 0; i < result.length; i++) {
//			for (int j = 0; j < result[i].length; j++) {
//				result[i][j] = (int)(((ArrayList<Integer>)(arraylist.get(i))).get(j));
//			}
//		}
        return result;
    }
}

