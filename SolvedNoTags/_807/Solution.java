package _807;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there. We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). Height 0 is considered to be a building as well. 

	At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.
	
	What is the maximum total sum that the height of the buildings can be increased?
	
	Example:
	Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
	Output: 35
	Explanation: 
	The grid is:
	[ [3, 0, 8, 4], 
	  [2, 4, 5, 7],
	  [9, 2, 6, 3],
	  [0, 3, 1, 0] ]
	
	The skyline viewed from top or bottom is: [9, 4, 8, 7]
	The skyline viewed from left or right is: [8, 7, 9, 3]
	
	The grid after increasing the height of buildings without affecting skylines is:
	
	gridNew = [ [8, 4, 8, 7],
	            [7, 4, 7, 7],
	            [9, 4, 8, 7],
	            [3, 3, 3, 3] ]
 */
/*
 * 题目理解：对于原矩阵找出第i行最大值和第j列最大值中小的那个，记录在RowMax ，ColMax中，再循环一次二维数组，进行原数值和第i行最大值和第j列最大值中较小的值差的和计算
 * 遇到的问题：1.由于没有考虑到输入二维数组的大小，导致开始定义的固定长度的一维数组记录每行和每列的最大值数组的长度固定，结果测试时造成了数组越界的错误。
 * 			2.Java 的API Collections.max(Row) 可以计算集合中的最大值。
 * 			3.遇到的eclipse的设置问题，可以设置
			设置eclipse在编译运行项目之前自动保存修改的文件，修改下面两个地方：
			Window -> Preferences -> General -> Workspace -> “Save automatically before build”
			Window ->Preferences -> Run/Debug -> Launching -> “Save dirty editors before launching”
 */

public class Solution {

	public static void main(String[] args) {
		int[][] grid =  { 
				{13,47,91,34,20,33,39,22,80,62},{73,97,88,51,38,36,52,75,25,99},{95,43,32,26,82,74,60,69,59,55},{20,41,77,95,79,46,70,50,17,51},{51,0,93,27,46,41,58,49,8,5},{92,58,38,56,73,93,34,47,23,62},{97,66,57,72,26,46,4,90,82,74},{7,44,67,96,0,82,75,22,53,100},{95,48,46,68,41,53,69,42,13,87},{79,48,96,39,21,35,3,12,22,42}};
		
		System.out.println(maxIncreaseKeepingSkyline(grid));
	}
	public static int maxIncreaseKeepingSkyline(int[][] grid) {
		int count = 0;
		ArrayList<Integer> RowMax = new ArrayList<Integer>();
		ArrayList<Integer> ColMax = new ArrayList<Integer>();
		ArrayList<Integer> Row = new ArrayList<Integer>();
		ArrayList<Integer> Col = new ArrayList<Integer>();
			for (int i = 0; i < grid.length; i++) {
					Col.clear();
					Row.clear();
				for (int j=0; j < grid[i].length; j++) {
					Row.add(grid[i][j]);
					Col.add(grid[j][i]);		
				}
				RowMax.add( Collections.max(Row));
				ColMax.add( Collections.max(Col)) ;
			}
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					count += (((RowMax.get(i) > ColMax.get(j))? ColMax.get(j):RowMax.get(i)) - grid[i][j]);
				}
			}			
		return count;
        
    }
}

