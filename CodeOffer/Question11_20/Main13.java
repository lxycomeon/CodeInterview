package Question11_20;

//题十三：求机器人运动范围，从坐标00开始移动。可以上下左右移动。但是行列坐标数位之和不能大于门限threshold。
public class Main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countRange(5,4,4));
	}
	
	public static int countRange(int threshold,int rows,int cols) {
		int pathLength = 0;
		boolean[] visited = new boolean[rows * cols];
		for(int i = 0;i<visited.length;i++)
			visited[i] = false;
		
		int count = countRangeCore(threshold,rows,cols,0,0,visited);
		
		
		return count;
	}

	private static int countRangeCore(int threshold, int rows, int cols, int i, int j, boolean[] visited) {
		// TODO Auto-generated method stub
		int count = 0;
		if(i>=0 && i<rows && j>=0 && j<cols && getSum(i,j)<threshold && !visited[i*cols +j]) {
			visited[i*cols +j] = true;
			count =1+   countRangeCore( threshold, rows,  cols,  i, j-1, visited)
					+ countRangeCore( threshold, rows,  cols,  i-1, j, visited)
					+ countRangeCore( threshold, rows,  cols,  i, j+1, visited)
					+ countRangeCore( threshold, rows,  cols,  i+1, j, visited);
			
			
			
		}
		
		return count;
	}

	private static int getSum(int i, int j) {
		int Sum = 0;
		while(i>0) {
			Sum += i%10;
			i=i/10;
		}
		while(j>0) {
			Sum += j%10;
			j=j/10;
		}
		
		
		return Sum;
	}
	
	
}
