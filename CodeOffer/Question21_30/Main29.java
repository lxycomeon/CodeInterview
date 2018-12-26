package Question21_30;

//˳ʱ���ӡ����
public class Main29 {

	public static void main(String[] args) {
		int[][] mat = { {1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
						};
		printMatByCicle(mat);
		
	}
	
	public static void printMatByCicle(int[][] mat) {
		int rows = mat.length;//����
		int cols = mat[0].length;//����
		
		int start = 0;//ÿһȦ��ͷ
		while(rows > 0 && cols >0) {
			printCicle(mat,start,rows,cols);
			rows -= 2;
			cols -= 2;
			start++;
		}
		
		
	}

	private static void printCicle(int[][] mat, int start, int rows, int cols) {
		//�ȴ�ӡ��һ��
		for(int i = 0; i<cols ; i++)
			System.out.print(mat[start][start+i] + ",");
		
		//��ӡ�ұ�����
		for(int i = 1; i < rows ;i++)
			System.out.print(mat[i+start][start+cols-1]+",");
		
		//��ӡȦ��������һ�Ż�ȥ
		for(int i = cols-2 ; i >=0 && rows-1 >0; i--) 
			System.out.print(mat[start+rows-1][i+start]+",");
		
		//��ӡȦ��
		for(int i = rows-2 ;i >= 1 ;i--)
			System.out.print(mat[i+start][start] +",");
		
		
	}

		
	

}
