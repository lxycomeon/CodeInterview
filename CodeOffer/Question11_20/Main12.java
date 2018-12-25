package Question11_20;

//面试题12：在一个二维矩阵中，矩阵每一格存储一个字符。判断是否存在一条包含目标字符串的所有字符的路径
public class Main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] mat= {'a','b','t','g',
					'c','f','c','s',
					'j','d','e','h'};
		
		System.out.println(hasPath(mat,3,4,"abfb"));

	}
	
	public static boolean hasPath(char[] matrix,int rows,int cols,String str) {
		int pathLength = 0;
		boolean[] visited = new boolean[matrix.length];
		for(int i = 0;i<visited.length;i++)
			visited[i] = false;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(hasPathCore(matrix,rows,cols,i,j,str,pathLength,visited))
					return true;
			}
		}
		return false;
	}
	//注意对于矩阵的拉长之后的遍历，行数（默认减去过一的）乘列+列数。
	private static boolean hasPathCore(char[] matrix,int rows,int cols, int row, int col, String str, int pathLength, boolean[] visited) {

		if(pathLength >= str.length())
			return true;
		boolean hasPath = false;
		if( row < rows && row >= 0 && col >= 0 && col < cols && 
				matrix[(row)*cols+col]==str.charAt(pathLength) && !visited[(row)*cols+col]
			) {
			pathLength++;
			visited[(row)*cols+col] = true;
			hasPath = hasPathCore(matrix,rows,cols,row,col-1,str,pathLength,visited)||
					  hasPathCore(matrix,rows,cols,row-1,col,str,pathLength,visited)||
					  hasPathCore(matrix,rows,cols,row,col+1,str,pathLength,visited)||
					  hasPathCore(matrix,rows,cols,row+1,col,str,pathLength,visited);
		
			if(!hasPath) {
				pathLength--;
				visited[(row)*cols+col] = false;
			}
		}
		
		return hasPath;
	}

}
