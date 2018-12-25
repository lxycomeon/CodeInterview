package _695;

import java.util.HashMap;
import java.util.LinkedList;

/*695. Max Area of Island
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) 
 * connected 4-directionally (horizontal or vertical.) 
 * You may assume all four edges of the grid are surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
 * 
 * Example 1:
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
*/

public class Solution {
	static class Point{
		private int x,y;
		Point(int x,int y){
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
	}

	public static void main(String[] args) {
		int[][] grid = new int[][]{ {0,0,1,0,0,0,0,1,0,0,0,0,0},
		                            {0,0,0,0,0,0,0,1,1,1,0,0,0},
		                            {0,1,1,0,1,0,0,0,0,0,0,0,0},
		                            {0,1,0,0,1,1,0,0,1,0,1,0,0},
		                            {0,1,0,0,1,1,0,0,1,1,1,0,0},
		                            {0,0,0,0,0,0,0,0,0,0,1,0,0},
		                            {0,0,0,0,0,0,0,1,1,1,0,0,0},
		                            {0,0,0,0,0,0,0,1,1,0,0,0,0} };
		                            
	}                               
	public static int maxAreaOfIsland(int[][] grid) {
		
		
		return 0;
    }
	//检测该点是否是陆地，若是并返回他的一个邻居，不是或者没有邻居则返回null
	public static LinkedList<Point> HvaeEdge(Point point,int[][] grid) {
		
		
		return null;
    }
	
	
	
}

