package Question11_20;

//顺序打印输出从1到最大的n位数：注意此题要考察的数字可能超过long 的范围，所以用字符串模拟数字加法
public class Main17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMaxNnum2(0);

	}
	
	//使用非递归的方法打印数字
	public static void printMaxNnum(int n) {
		if(n<= 0)
			return ;
		
		char[] tmpNum = new char[n+1];
		for (int i = 0; i < tmpNum.length; i++) {
			tmpNum[i] = '0';
		}
		
		while(tmpNum[0]=='0') {
			int wei = n;
			boolean bitCon = true;
			while(bitCon) {
				if(tmpNum[wei]< '9') {
					tmpNum[wei] += 1;
					bitCon = false;
				}
				else {
					bitCon = true;
					tmpNum[wei] = '0';
					wei--;
				}
			}
			if(tmpNum[0] != '1')
				printNum(tmpNum);
		}
	}
	
	//使用递归方法,数字的全排列的打印。
	public static void printMaxNnum2(int n) {
		if(n <= 0)
			return;
		char[] tmpNum = new char[n+1];
		
		for (int i = 0; i < 10; i++) {
			tmpNum[0] = (char) (i + '0');
			printMaxNnumCore(tmpNum,n,0);
		}
		
	}
	
	
	
	private static void printMaxNnumCore(char[] tmpNum, int n, int index) {

		if(index == n-1) {
			printNum(tmpNum);
			return;
		}
		for (int i = 0; i < 10; i++) {
			tmpNum[index+1] = (char) (i+ '0');
			printMaxNnumCore(tmpNum,n,index+1);
		}
		
	}

	public static void printNum(char[] num) {
		boolean first = true;
		for (int i = 0; i < num.length; i++) {
			if(num[i] != '0' && first == true) {
				System.out.print(num[i]);
				first = false;
				continue;
			}
			if(!first) {
				System.out.print(num[i]);
			}
			
		}
		System.out.print(',');
	}

}
