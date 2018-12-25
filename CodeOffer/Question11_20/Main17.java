package Question11_20;

//˳���ӡ�����1������nλ����ע�����Ҫ��������ֿ��ܳ���long �ķ�Χ���������ַ���ģ�����ּӷ�
public class Main17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMaxNnum2(0);

	}
	
	//ʹ�÷ǵݹ�ķ�����ӡ����
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
	
	//ʹ�õݹ鷽��,���ֵ�ȫ���еĴ�ӡ��
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
